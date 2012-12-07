
/**
 * Write a description of class Worksheet35E here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worksheet35E
{
    public static void main()
    {
        for (int x = 10; x>0; x--)
        {
            for (int z = x; z>0; z++)
            {
                System.out.print(" ");
            }
            for (int y = x; y>0; y-=2)
            {
                if (y % 2 == 0)
                {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
