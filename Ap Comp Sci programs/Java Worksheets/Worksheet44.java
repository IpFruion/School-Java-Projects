
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
        Scanner stdin = new Scanner(System.in);
        String input;
        String input5;
        String answer1 = "goodbye";
        String yes = "yes";
        for (int x = 0; x<10 ; x++)
        {
            System.out.println(Math.random());
        }
        for (int x = 10; x>0; x--)
        {
            System.out.println(Math.round(Math.random()*100));
            //System.out.println(Math.round(Math.random()/10) *1000);
        }
        System.out.println("Enter a String: ");
        System.out.print(stdin.next() + "\n");
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
        while (true)
        {
            System.out.println(Math.round(Math.random()*1000));
            System.out.println("Continue (yes/no)");
            input5 = stdin.next();
            if (input5.compareTo(yes) != 0)
            {
                break;
            }
        }
    }
}
