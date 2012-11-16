/**
 * Write a description of class Project2BMI here.
 * 
 * @author Derrick Lockwood
 * @version 11-11-12
 */
import java.util.Scanner;
public class Project2BMI
{
     //Start of Design:
     //Website of BMI Info: http://www.cdc.gov/healthyweight/assessing/bmi/adult_BMI/index.html
     //define data
       
     
     //start at main
     public static void main(){
         //data: height(inches), weight(lbs), answerbmi, suggestedweightMin, scanin, suggestedweightMax, suggestedweight
         double weight, answerbmi, suggestedweightMin, suggestedweightMax, suggestedweight, answerbmifloat;
         Scanner scanin = new Scanner(System.in);
         double height;
        //constant data: UNDERWEIGHT = 18.5, NORMAL = 24.9, OVERWEIGHT = 29.9, OBESE = 30.0, BMI_CONSTANT = 703, HEAVIEST_PERSON = 1400, TALLEST_PERSON = 100, LIGHTEST_PERSON = 50, SHORTEST_PERSON = 1
        final double UNDERWEIGHT = 18.5;
        final double NORMAL = 24.9;
        final double OVERWEIGHT = 29.9;
        final double OBESE = 30.0;
        final double BMI_CONSTANT = 703.;
        final double HEAVIEST_PERSON = 1400.;
        final double LIGHTEST_PERSON = 50.;
        final double TALLEST_PERSON = 100.;
        final double SHORTEST_PERSON = 1.;
        //start while loop << to break out of this when input = zero
        System.out.println("A program by Derrick Lockwood production");
        while (true) {
            //start while loop << to break out of this when not correct input
            while (true) {
                //prompt for and assign input to height(int) and weight input(double)
            System.out.println("Please enter your height(in)(ex. 5.9ft -> 70.8in): ");
            height = scanin.nextDouble();
            System.out.println("Please enter your weight(lbs)(ex. 120lbs): ");
            weight = scanin.nextDouble();
            //check if zero
            if (height == 0 || weight == 0) {
                System.out.println("Exiting Program \n");
                //return out of program
                return;
            }
            //check for the correctness of the input
                //if not SHORTEST_PERSON<height or not height<TALLEST_PERSON
            if (!(SHORTEST_PERSON<height) || !(height<TALLEST_PERSON)){
                System.out.println("Not within height range");
                //break out of closest loop   
                break;
            }
                //if not LIGHTEST_PERSON<weight or not weight<HEAVIEST_PERSON
            if (!(LIGHTEST_PERSON<weight) || !(weight<HEAVIEST_PERSON)){
                System.out.println("Not within weight range\n");
                //break out of closest loop
                break;
            }
            //run the math to compute the BMI
            //answerbmi = (height * height * BMI_CONSTANT) / (weight * BMI_CONSTANT)
            answerbmi = weight / (height * height) * BMI_CONSTANT;
            //run the math to compute the suggested weight
            //suggestedweightMin = height*height*UNDERWEIGHT/BMI_CONSTANT
            suggestedweightMin = height*height*UNDERWEIGHT/BMI_CONSTANT;
            //suggestedweightMax = height*height*NORMAL/BMI_CONSTANT
            suggestedweightMax = height*height*NORMAL/BMI_CONSTANT;
            //check the BMI with the Bounds to determine the status of the BMI
            //if answerbmi < UNDERWEIGHT
            if (answerbmi <= UNDERWEIGHT)
            {
                //Output "Underweight" and suggestedweightMin - weight
                answerbmifloat = (int)(answerbmi * 100);
                suggestedweight = suggestedweightMin - weight;
                System.out.println("Underweight:\nYour BMI is: " +answerbmifloat/100+"\n You need to gain: "+suggestedweight+"lbs\n");
            }
            //if UNDERWEIGHT < answerbmi < NORMAL
            if (UNDERWEIGHT < answerbmi && answerbmi <= NORMAL)
            {
                answerbmifloat = (int)(answerbmi * 100);
                //Output "Normal"
                System.out.println("Normal:\nYour BMI is: "+answerbmifloat/100+"\n");
            }
            //if NORMAL < answerbmi < OVERWEIGHT
            if (NORMAL < answerbmi && answerbmi <= OVERWEIGHT)
            {
                answerbmifloat = (int)(answerbmi * 100);
                suggestedweight = weight - suggestedweightMax;
                //Output "Overweight" and weight - suggestedweightMax
                System.out.println("Overweight: \nYour BMI is: "+answerbmifloat/100+"\n You need to lose: "+suggestedweight);
            }
            //if answerbmi > OBESE
            if (answerbmi > OBESE)
            {
                answerbmifloat = (int)(answerbmi * 100);
                suggestedweight = weight - suggestedweightMax;
                //Output "Obese" and weight - suggestedweightMax
                System.out.println("Obese: \nYour BMI is: "+answerbmifloat/100+"\n You need to lose: "+suggestedweight);
            }
            //end while loop
            }
            //end while loop
        }
    }
}
