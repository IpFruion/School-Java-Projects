/**
 * Write a description of class Project2BMI here.
 * 
 * @author Derrick Lockwood
 * @version 11-11-12
 */
public class Project2BMI
{
    /**
     * Design:
     * Needs to include:
     * -the website where I got the BMI Info
     * -the formula you will use to compute BMI
     * -the names & bounds of the 4 Weight status categories
     * -All data definitions for both variables & constants you will use
     * -how you will compute the info telling the user modify their BMI
     * -the pseudo code for your program
     * 
     * Start of Design:
     * -Website of BMI Info: http://www.cdc.gov/healthyweight/assessing/bmi/adult_BMI/index.html
     * -start at main method
     * -define data
     * --data: height(inches), weight(lbs), answer
     * --constant data: UNDERWEIGHT = 18.5, NORMAL = 24.9, OVERWEIGHT = 29.9, OBESE = 30.0, BMI_CONSTANT = 703, HEAVIEST_PERSON = 1400, TALLEST_PERSON = 100, LIGHTEST_PERSON = 10/16
     * -start at main
     * -prompt for and assign input to height(int) and weight input(double)
     * -check for the correctness of the input
     * --if not 0<height<TALLEST_PERSON
     * --- loop to top
     * --if not LIGHTEST_PERSON<weight<HEAVIEST_PERSON
     * --- loop to top
     * -run the math to compute the BMI
     * --answer = (height * height * BMI_CONSTANT) / (weight * BMI_CONSTANT)
     * -check the BMI with the Bounds to determine the status of the BMI
     * --Underweight = answer < UNDERWEIGHT
     * ---Output Underweight and 
     * --Normal = UNDERWEIGHT < answer < NORMAL
     * --Overweight = NORMAL < answer < OVERWEIGHT
     * --Obese = answer > OBESE
     * 
     */
    public static void main()
    {
        
    }
}
