import java.util.*;
/* Author: Dylan Hesser
vers 1.00 */

public class Automobile
{
/**this programs goes along with the Automobile test program. **/
private String make;
private String model;
private double price;
private String color;
   public Automobile ()
   { 
   make = " " ;
   model = " " ;
   price = 0.0 ; 
   color = " ";
   
   }
   
   public Automobile ( String make, String model, double price, String color )
      {
         this.make = make;
         this.model = model;
         this.price = price;
         this.color = color;
         }
         
         
         public void setMake ( String make )
         { 
            this.make = make;
            }
            
            
               public void setModel ( String model )
         { 
            this.model = model;
            }
            
                 public void setPrice ( double price )
         { 
            this.price = price;
            }
            
            public void setColor (String color)
 
  { this.color = color;
   }
   public void setColor (int colorCode)
   
   {
      switch (colorCode)
      {
         case 1:
         this.color = "red";
         break;
         
         
         case 2:
         this.color = "blue";
         break;
         
         case 3:
         this.color = "black";
         break;
         
         case 4:
         this.color = "white";
         break;
        
         default: 
         this.color= " invalid colorcode! ";
         break;
       }
  }    
     
              public String getColor ()
   {
      return this.color;
   }
   
            
               public String getMake ()
               {  return this.make ; 
                }
               public String getModel ()
               { return this.model ;
               }
               public double getPrice ()
               { return this.price ;
               }
             
      public boolean equals ( Automobile obj ) 
{ 
      if ( this == obj )
      {
         return true ;
      }
      else
 { 
      if (!(this.make.equals (obj.make)))
      {
         return false ; 
      } 
      
         return true;  
 }
}
   
public String toString ()
   {
         return  String.format ( " the %s %s is %s and costs %.2f %n " , this.make, this.model, this.color, this.price);
   
   }
         
         
  
             
    }        
