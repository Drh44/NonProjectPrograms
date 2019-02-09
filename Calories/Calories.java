import java.io.*;

/**
<pre>
This program calculates the amount of energy expended
using the concept of metabolic equivalents.  
The formula used is 
Calories/Minute = 0.0175 * MET * WeightInKilos 
One Kg = 2.2 Pounds

@author Dylan Hesser
@version 1.0
*/
public class Calories 
{
   //defining varibles and assigning values
   private static final int METS_RUNNING_6MPH = 10;
   private static final int METS_BASKETBALL = 8;
   private static final int METS_SLEEPING = 1;
   
   private static final double CONSTANT_FACTOR = 0.0175;
   private static final double KILO_FACTOR = 2.2;
   private static final double MINUTES_PER_HOUR = 60.0;
   

  
   public static void main(String[] args)
   {
      // construction of pseudo inputs and intiation of varibles
      String inputName = "Dylan Hesser";
      int inputWeight = 175;
      int inputBasketballTime = 60;
      int inputRunningTime = 30;
      double inputSleepingTime = 8.0;
      
      //Conversions of weight and time
      double weightInKiloGrams = inputWeight / KILO_FACTOR;
      int sleepingTimeInMinutes = (int)(inputSleepingTime * MINUTES_PER_HOUR);

      //Equations for totals of calories
      double caloriesBurnedRunning = caloriesBurned(METS_RUNNING_6MPH, weightInKiloGrams,inputRunningTime);
      double caloriesBurnedBasketBall = caloriesBurned(METS_BASKETBALL, weightInKiloGrams,inputBasketballTime);
      double caloriesBurnedSleeping = caloriesBurned(METS_SLEEPING, weightInKiloGrams,sleepingTimeInMinutes);
      double totalCaloriesBurned= caloriesBurnedRunning + caloriesBurnedBasketBall + caloriesBurnedSleeping ;
      
     
      //output statements using printf to format the totals to 2 decimal places 
      System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
      System.out.printf(inputName + " burned an estimated %.2f running. %n", caloriesBurnedRunning);
      System.out.printf(inputName + " burned an estimated %.2f playing basketball. %n", caloriesBurnedBasketBall);
      System.out.printf(inputName + " burned an estimated %.2f sleeping. %n", caloriesBurnedSleeping);
    
      System.out.printf(inputName + "burned an estimated total of %.2f calories %n", totalCaloriesBurned);
    

     System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
     
   }
   
   /**
      This method accepts as input the integer METS value for a specific activity, the double
      weight value for the person involved in the activity, and the number of minutes that the
      activity was sustained. This method then returns the approximate number of calories that
      person burned during the activity.
      
      @author Steve Satterfield
   */
   private static double caloriesBurned(int Mets, double Weight, int Minutes)
   {
      return ((CONSTANT_FACTOR) * Mets * Weight * Minutes);
   }
   
}         
      
      
      
