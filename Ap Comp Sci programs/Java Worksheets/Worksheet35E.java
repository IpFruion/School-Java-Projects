
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
        int letters = 9;
        int spaces;
        for (int rows = 9; rows>0; rows--)
        {
            for (spaces = rows - letters; spaces<=5; spaces++)
            {
                System.out.print(" ");
            }
            for (; spaces>=5; spaces--)
            {
                System.out.print(" ");
            }
            for (;letters > 0; letters-=2)
            {
                System.out.print("X");
            }
        }
    }
}
