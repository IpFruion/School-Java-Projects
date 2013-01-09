
/**
 * Write a description of class TimerStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TimerStore
{
   public static void main()
   {
       Scanner stdin = new Scanner(System.in);
       boolean a1;
       
       String x;
      
       System.out.print("Enter Start/Exit/Output");
       x = stdin.next();
       if (x.compareToIgnoreCase("start") == 0)
       {
           a1 = true;
       }
       else
       {
           a1 = false;
       }
       if (x.compareToIgnoreCase("output") == 0)
       {
           
       }
   }
   public static int[] timeStart(boolean a)
   {
       int[] a2 = new int[3];
       if (a != true)
       {
           return null;
       }
       return a2;
   }
   
}
