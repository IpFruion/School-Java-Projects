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
        int start;
        int end;
        long answer3 = 1;
        final int PROB3_MIN = 0;
        final int PROB3_MAX = 21;

        //start of problem 1
        System.out.print("Enter first digit to compare: \n");
        input1 = s.nextInt();
        System.out.print("Enter second digit to compare: \n");
        input2 = s.nextInt();
        if (input1 < input2)
        {
            if (!(input1 % 2 == 0))
            {
                input1+=1;
            }
            start = input1;
            end = input2;
        }
        else
        {
            if (!(input2 % 2 == 0))
            {
                input2+=1;
            }
            start = input2;
            end = input1;
        }
        for (int x = start; x<=end; x+=2)
        {
            System.out.print(x + " ");
        }
        //end of problem 1
        System.out.println();
        //start of problem 2
        for (int x = 10; x>=0; x--)
        {
            for (int z = 10; z>x; z--)
            {
                System.out.print(" ");
            }
            for (int y = x; y>0; y--)
            {
                System.out.print("X");
            }
            System.out.println();
        }
        //end of problem 2
        System.out.println();
        //start of problem 3-5
        while (true)
        {
            answer3 = 1;
            System.out.print("\nPlease Give a number to calculate factorial: \n");
            input1 = s.nextInt();
            if (input1 > PROB3_MIN && input1 < PROB3_MAX)
            {
                for (int x = input1; x>0; x--)
                {
                    answer3 = answer3*(long)x;
                }
                System.out.print(answer3);
            }
            else
            {
                System.out.println("End of Program");
                return;
            }
        }
        //end of problem 3-5
    }
}