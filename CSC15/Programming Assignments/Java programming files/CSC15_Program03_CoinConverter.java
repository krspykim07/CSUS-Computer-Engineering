/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: Program03_CoinConverterShell
   Date written: 09/20/2021
   Self-Grade: 100
   Program #03                
   This program shows the conversion of current pennies you have to a divided types of pennies. */
   
public class CoinConverter
{
   //Main method use to call out the different method
   public static void main(String[] args)
   {
      //calling the introduction method to output message
      description();
      
      //calling the conversion method to do the work
      convert();
   }
   
   /* The introduction method outputs a introductory message to users */
   public static void description()
   {
      System.out.println("Welcome to the Coin Converter");
      System.out.println("Tell me the number of the pennies you have,");
      System.out.println("I will tell you the number of dollar bill, quarters, dimes, nickels, and pennies");
   }
   
   /* Conversion method that works all the conversion and calculation process, and display their output as well */
   public static void convert()
   {
      //declaration and initializing the pennies you have
      int money = 6789;
      
      //outputs the pennies you have
      System.out.println(money + " pennies are equal to:");
      
      //declaration of different types of money to be converted
      int dollar, quarter, dime, nickel, penny;
      
      //declaration of pennies left after converting one type to another
      int left;
      
      //conversion and output for dollar
      dollar = money / 100;
      left = money % 100;
      System.out.println(dollar + " dollar(s)");
      
      //conversion and output for quarter
      quarter = left / 25;
      left = left % 25;
      System.out.println(quarter + " quarter(s)");
      
      //conversion and output for dime
      dime = left / 10;
      left = left % 10;
      System.out.println(dime + " dime(s)");
      
      //conversion and output for nickel
      nickel = left / 5;
      left = left % 5;
      System.out.println(nickel + " nickel(s)");
      
      //conversion and output for penny
      penny = left / 1;
      System.out.println(penny + " penny(s)");
   }
}