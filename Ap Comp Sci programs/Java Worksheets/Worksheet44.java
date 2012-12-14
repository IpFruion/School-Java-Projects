
/**
 * Write a description of class Worksheet44 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Worksheet44
{

    public static void main()
    {
        //problem definitions 
        Scanner stdin = new Scanner(System.in);
        String input;
        String input5;
        String answer1 = "goodbye";
        String yes = "yes";
        String tempString;
        double tempDouble;
        int temp;
        //problem 1
        System.out.println("Problem 1");
        for (int x = 0; x<10 ; x++)
        {
            tempDouble = Math.random();
            System.out.println(tempDouble);
        }
        //problem 2
        System.out.println("Problem 2");
        for (int x = 10; x>0; x--)
        {
            tempDouble = Math.random();
            tempDouble = tempDouble * 100;
            temp = (int)Math.round(tempDouble);
            System.out.println(temp);
        }
        //problem 3
        System.out.println("Problem 3");
        System.out.println("Enter a String: ");
        tempString = stdin.next();
        System.out.print(tempString + "\n");
        //problem 4
        System.out.println("Problem 4");
        System.out.println("Enter a Answer to problem :) : ");
        input = stdin.next();
        if (input.compareTo(answer1) == 0)
        {
            System.out.println("You say goodbye and I say hello!");
        }
        else
        {
            System.out.println("Hello, hello!");
        }
        //problem 5
        System.out.println("Problem  5");
        while (true)
        {
            tempDouble = Math.random();
            tempDouble = tempDouble * 1000;
            temp = (int)Math.round(tempDouble);
            System.out.println(temp);
            System.out.println("Continue (yes/no)");
            input5 = stdin.next();
            if (input5.compareTo(yes) != 0)
            {
                break;
            }
        }
    }
}
