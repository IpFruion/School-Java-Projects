/**
 * Write a description of class Worksheet31 here.
 * 
 * @author Derrick Lockwood
 * @version 10-30-12
 */
public class Worksheet31
{
    
    public static  void main()
    {
        //definition of objects
        int score = 35;
        double bat = 13.95;
        double ball = 5.99;
        double glove = 109.52;
        int year = 2012;
        int February = 29;
        boolean leap_year = false;
        double pi = 3.14159;
        char grade = 'A';
     
        //problem 1
        System.out.println("");
        System.out.println("The value of \"Score\" is " + score);
        
        //problem 2
        System.out.print("\nline one");
        System.out.print("\nline two");
        System.out.print("\nline three");
        System.out.print("\nline four\n\n");
        
        //problem 3
        System.out.println("bat  \t"+bat);
        System.out.println("ball \t"+ball);
        System.out.println("glove\t"+glove);
        System.out.println("");
        System.out.println("bat     "+bat);
        System.out.println("ball    "+ball);
        System.out.println("glove   "+glove+"\n");
        
        //problem 4
        System.out.println("The int \"year\" has a value of: "+year);
        System.out.println("The int \"February\" has a value of: "+February);
        System.out.println("The boolean \"leap_year\" has a value of: "+leap_year);
        System.out.println("The double \"pi\" has a value of: "+pi);
        System.out.println("The char \"grade\" has a value of: "+grade);
        
        //problem 5
        leap_year = true;
        System.out.println("\nThe statement \"2012 is a leap year\" is "+leap_year+", Febuary had "+February+" days.");
    }

}
