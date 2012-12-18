
/**
 * Write a description of class Worksheet45 here.
 * 
 * @author Derrick Lockwood
 * @version 12-17-12
 */
import java.util.Scanner;
public class Worksheet45
{
    public static void main()
    {
        int r;
        int runNum;
        Scanner stdin = new Scanner(System.in);
        while (true)
        {
            System.out.println("Input number of rolls");
            runNum = stdin.nextInt();
            if (runNum <= 0)
            {
                break;
            }
            for (int x = 0; x < runNum ; x++)
            {
                r = rollDie();
                r++;
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }

    public static int rollDie()
    {
        int random;
        random = (int)(Math.random()*6);
        return random;
    }
}
