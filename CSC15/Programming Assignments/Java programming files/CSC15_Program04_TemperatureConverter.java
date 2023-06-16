/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: Program04_TempConvertShell
   Date written: 09/29/2021
   Self-Grade: 100
   Program #04                
   This program shows the conversion of temperature from Fahrenheit to Centigrade. */

public class TemperatureConverter
{
   //Declaration of the constant value named CONVERT_CONSTANT
   public static final double CONVERT_CONSTANT = 9.0/5;
      
   public static void main (String[] args)
   {
     //calling the description method.
     description();
     //calling the farToCenti method.
     farToCenti();
   }
   
   /*The fartoCenti method shows the whole conversion of the temperature. */
   public static void farToCenti()
   {
      //declaration of variable F to store Fahrenheit values
      double F;
      
      //output the header of the conversion table
      System.out.println("Centrigrade \t\t\t Fahrenheit");
      
      //for-loop to convert from 0-45 Centrigrade into Fahrenheit
      for (int C = 0; C <= 45; C++)
      {
         //computation formula for Fahrenheit with the given Centrigrade
         F = (CONVERT_CONSTANT)* C + 32;
         
         //output of the Centrigrade value and its corresponding Fahrenheit value
         System.out.println("     " + C + "\t\t\t\t\t\t " + (int) F);
      }
   }
   
   /* The description method outputs a description or an instruction to the user. */
   public static void description()
   {
      //calling the divider method
      divider();
      System.out.println("Welcome to the Temp converter app");
      System.out.println("This app provides the temperatures in both centrigrade and Fahrenheit");
      //calling the divider method
      divider();
   }
   
   /* The divider method outputs a divider for description */
   public static void divider()
   {
      //nested for-loop to produce 2 lines of divider
      for (int i = 1; i <= 2; i++)
      {
         for(int j = 1; j <= 80; j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   }    
   
}
  
