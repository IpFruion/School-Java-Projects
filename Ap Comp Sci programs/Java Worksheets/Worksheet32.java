/**
 * Write a description of class Worksheet32 here.
 * 
 * @author Derrick Lockwood 
 * @version 11-1-12
 */
import java.util.Scanner;
public class Worksheet32
{
    public static void main()
    {
        //define variables
        Scanner s = new Scanner(System.in);
        //problem 1
        double celsius;
        int tempfahrenheit;
        //problem 2
        double fahrenheit;
        int tempcelsius;
        //problem 3
        double celsius1;
        double tempfahrenheit1;
        //problem 4
        double fahrenheit1;
        double tempcelsius1;
        
        
        //problem 1
        System.out.println("Type in a integer fahrenheit Temperature: ");
        tempfahrenheit = s.nextInt();
        celsius = 5/9 * (tempfahrenheit - 32);
        System.out.println(celsius+"\n");
        
        //problem 2
        System.out.println("Type in a integer celsius Temperature: ");
        tempcelsius = s.nextInt();
        fahrenheit = (tempcelsius * 9/5) + 32;
        System.out.println(fahrenheit+"\n");
        
        //problem 3
        System.out.println("Type in a double fahrenheit Temperature: ");
        tempfahrenheit1 = s.nextDouble();
        celsius1 = 5/9 * (tempfahrenheit1 - 32);
        System.out.println(celsius1+"\n");
        
        //problem 4
        System.out.println("Type in a double celsius Temperature: ");
        tempcelsius1 = s.nextDouble();
        fahrenheit1 = (tempcelsius1 * 9/5) + 32;
        System.out.println(fahrenheit1+"\n");
        
        //problem 5: Because by calling for a double you are getting and using a more exact formula because integers do not have decimals
    }
}
