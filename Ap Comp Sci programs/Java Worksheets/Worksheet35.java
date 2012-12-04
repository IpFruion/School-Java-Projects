/**
 * Write a description of class Worksheet35 here.
 * 
 * @author Derrick Lockwood
 * @version 12-4-12
 */ 
import java.util.Scanner;
public class Worksheet35
{

    public static void main()
    {
        Scanner s = new Scanner(System.in);
        int input1;
        int input2;

        System.out.print("Enter first digit to compare: \n");
        input1 = s.nextInt();
        System.out.print("Enter second digit to compare: \n");
        input2 = s.nextInt();

        /*
         * if (!(input1 % 2 == 0))
            {
                input1+=1;
            }
         */
        //start of problem 1
        if (!(input1 % 2 == 0))
        {
            for (int x = input1+1; x<=input2; x+=2)
            {
                System.out.print(x + " ");
            }
            for (int x = input2+1; x<=input1; x+=2)
            {
                System.out.print(x + " ");
            }
        }
        else
        {
            for (int x = input1; x<=input2; x+=2)
            {
                System.out.print(x + " ");
            }
            for (int x = input2; x<=input1; x+=2)
            {
                System.out.print(x + " ");
            }
        }
        //end of problem 1
    }
}