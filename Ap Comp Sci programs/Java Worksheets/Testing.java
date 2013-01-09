
/**
 * Write a description of class Testing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testing
{

    public static void main()
    {
        o(""+dateFashion(4, 2));
    }

    public static int dateFashion(int you, int date) 
    {
        int value = 1;
        if ((you >= 8) || (date >= 8))
        {
            value = 2;
        }
        if ((you <= 2) || (date <= 2))
        {
            value = 0;
        }
        return value;
    }

    //Ap Question scores Increasing

    public static boolean scoresIncreasing(int[] scores) 
    {
        boolean isCorrect = false;
        for (int i = 0; i<scores.length; i++)
        {
            if ((i != scores.length-1) &&(scores[i] <= scores[i+1]))
            {
                isCorrect = true;
            }

        }
        return isCorrect;
    }

    //Ap Question Averagescores
    /*public static int scoresAverage(int[] scores) 
    {
    int firstAvg = average(scores,0,(scores.length-1)/2);
    int secondAvg = average(scores,scores.length/2, scores.length-1);

    if (firstAvg <= secondAvg)
    {
    return secondAvg;
    }
    return firstAvg;
    }

    public static int average(int[] nums, int start, int end)
    {
    int answer = 0;
    int index = 0;
    double answerDub;
    for (int i = start; i<=end; i++)
    {
    answer = answer +nums[i];

    index++;
    }

    answerDub = answer/index;
    return (int)Math.round(answerDub);
    }

    //recursion
    public static boolean array220(int[] nums, int index)
    {
    boolean isCorrect = false;
    int startAt = nums[index];

    if ((index < nums.length-1) && (startAt*10 == nums[index+1]))
    {
    isCorrect = true;
    return isCorrect;
    }
    if( index < nums.length-1)
    {
    isCorrect = array220(nums, index+1);
    return isCorrect;
    }
    return isCorrect;
    }
     */

    public static void o(String x){System.out.println(x);}
}
