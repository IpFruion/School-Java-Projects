/**
 * Write a description of class Project2BMI here.
 * 
 * @author Derrick Lockwood
 * @version 11-11-12
 */
public class Project2BMI
{
     //Start of Design:
     //Website of BMI Info: http://www.cdc.gov/healthyweight/assessing/bmi/adult_BMI/index.html
     //start at main method
     //define data
        //data: height(inches), weight(lbs), answerbmi, suggestedweight
        //constant data: UNDERWEIGHT = 18.5, NORMAL = 24.9, OVERWEIGHT = 29.9, OBESE = 30.0, BMI_CONSTANT = 703, HEAVIEST_PERSON = 1400, TALLEST_PERSON = 100, LIGHTEST_PERSON = 50
     //start at main
     //start while loop
     //start while loop
     //prompt for and assign input to height(int) and weight input(double)
     //check for the correctness of the input
        //if not 0<height<TALLEST_PERSON
            //break out of closest loop
        //if not LIGHTEST_PERSON<weight<HEAVIEST_PERSON
            //break out of closest loop
     //run the math to compute the BMI
        //answerbmi = (height * height * BMI_CONSTANT) / (weight * BMI_CONSTANT)
     //run the math to compute the suggested weight
        //suggestedweight = height*height*NORMAL/BMI_CONSTANT
     //check the BMI with the Bounds to determine the status of the BMI
        //Underweight = answer < UNDERWEIGHT
            //Output "Underweight" and suggestedweight - weight
        //Normal = UNDERWEIGHT < answer < NORMAL
            //Output "Normal"
        //Overweight = NORMAL < answer < OVERWEIGHT
            //Output "Overweight" and weight - suggestedweight
        //Obese = answer > OBESE
            //Output "Obese" and weight - suggestedweight
     //end while loop
     //end while loop
    public static void main()
    {
        
    }
}
