public class AutomobileTest
{
/** This program is to test automobile.test **/
public static void main(String[]args)
   {
   Automobile ford = new Automobile("ford", " focus", 1900.00, "red" ) ;
   Automobile porshe = new Automobile("porshe", " 911 " ,  100000.00, "black"  ) ;
   Automobile dodge = new Automobile("dodge", " charger " ,  45000.00, "blue" ) ;
   
   
   Automobile  chevy = new Automobile();
   chevy.setMake ( "chevy " );
   chevy.setModel ("Volt" ) ;
   chevy.setPrice (39995.00);
   chevy.setColor ("White") ; 
   
     chevy.setModel("Impala");
      chevy.setPrice(45995.00);
      
      String fordMake = ford.getMake();
      
      if(chevy.equals(ford))
         System.out.println("chevy equals ford");
      else
         System.out.println("chevy does not equal ford");
         
      System.out.println("chevy toString() returns: " + chevy.toString());
      
     
   
   System.out.printf ( " The %s %s costs %.2f ,and is %s %n",  chevy.getMake(), chevy.getModel(), chevy.getPrice(),chevy.getColor());  
   System.out.printf ( " The %s %s costs %.2f ,and is %s %n",  ford.getMake(), ford.getModel(), ford.getPrice(),ford.getColor()); 
   System.out.printf ( " The %s %s costs %.2f ,and is %s %n", porshe.getMake(),porshe.getModel(), porshe.getPrice(),porshe.getColor());
   System.out.printf ( " The %s %s costs %.2f ,and is %s %n", dodge.getMake(),dodge.getModel(), dodge.getPrice(), dodge.getColor());
   
    }
}  
   

