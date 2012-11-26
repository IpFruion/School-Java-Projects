
/**
 * Write a description of class Worksheet34 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worksheet34
{
    public static void main()
    {
        for (int i = 1; i<=10; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 1,count = 1; i<100; i++)
        {
            if (i/7 == count)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("");
        for (int i = 7;i<100;i+=7)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 10; i>=0; i--)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n\nProblem 5: \n");
        for (int i = 1; i<=12; i++)
        {
            System.out.println(i+" "+ i*i);
        }
        System.out.println("\nProblem 6: \n");
        for (int i = 10; i>0; i--)
        {
            for (int j = i; j>0; j--)
            {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
}
