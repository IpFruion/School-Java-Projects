import java.util.Scanner;
/**
 * Write a description of class Worksheet33 here.
 *
 * @author Derrick Lockwood
 * @version 11-7-12
 */

public class Worksheet33
{
    public static void main()
    {
        //definitions
        int input = 1;
        int output = 0;
        int number_negative = 0;
        int number_positive = 0;
        Scanner s = new Scanner(System.in);
        
        while (input != 0) {
            System.out.println("Input a Integer: ");
            input = s.nextInt();
            if (input < 0)
            {
                output = input * -1;
                number_negative = number_negative + 1;
            }
            else if (input > 0)
            {
                output = ((input+5) /10) *10;
                number_positive = number_positive + 1;
            }
            if (input != 0)
            {
                System.out.println("Original input: " +input+ " Output value is: " +output);
            }
        }
        System.out.println("Number of Positive numbers: "+ number_positive + "\nNumber of Negative numbers: " + number_negative);
    }
}
