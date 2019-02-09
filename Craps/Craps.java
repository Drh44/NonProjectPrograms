import java.util.Random;
import java.util.Scanner;
/* Author: Dylan Hesser
Version: 1.0 */
public class Craps 
/** This programs allows a user to play a game of craps with the computer. The computer calculates how many times out of 100 that you roll a seven or eleven with a pair of dice and displays it. **/
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in) ;
      boolean playAgain = false ;
  
   do 
  {
       rollTheDice();
       System.out.print ("Do you want to play again?");
       String answer = keyboard.nextLine();
       playAgain= (answer.toUpperCase().substring(0,1).equals("Y"));
  } while (playAgain);
 
 /* These do/while statements are what cause the output statement to show once the game runs. */
 
 
   }
   public static void rollTheDice()
   { 
      

  {
    Random dice = new Random ();
      int numSevens = 0;
    int numElevens = 0 ;
    int numWins = 0;
   /** The preceding and following code allow the computer to roll the dice and configure random numbers from it. **/
      for (int i = 0; i < 100; i++) 
  
       {
         int roll = dice.nextInt(6) + 1;
         roll += dice.nextInt (6) + 1 ;
   
         switch (roll)
        {
          case 7:
           numSevens++;
           numWins++;
           break;
          case 11 :
           numElevens++;
           numWins++;
           break;
        }
       }
        System.out.printf (" You rolled %d sevens and %d elevens for a total of %d wins. %n", numSevens, numElevens, numWins ) ;
   }
}
}
   
   
  
  

   
   
 
   
