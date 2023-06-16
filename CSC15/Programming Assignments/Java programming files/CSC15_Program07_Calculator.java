/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: CalculatorAlgador
   Date written: 10/19/2021
   Self-Grade: 100
   Program #07
   This program allows the user to calculate numbers by asking which operator and 2 numbers with a given range, then, the outputs gives the result. */
import java.util.Scanner;

public class CalculatorV1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in); 
      run(kb);
   }
   
   /* This method to run all the work for this program: input, operation, and output */
   public static void run(Scanner kb)
   {  
      System.out.print("How many times do you want to use the software: ");
      int tries = kb.nextInt();
      divider();
        
      for(int i = 1; i <= tries; i++)
      {
         menu();

         System.out.print("\nEnter the operation: ");
         String operator = kb.next();
         System.out.print("Enter a number between 0 - 9: ");
         int operand1 = kb.nextInt();
         System.out.print("Enter a number between 0 - 9: ");
         int operand2 = kb.nextInt();

         String symbol = convert(operator);
         String a = convertNumToWord(operand1);
         String b = convertNumToWord(operand2);
         int result = calculate(operand1,operand2,operator);

         System.out.println("\n" + a + " " + symbol + " " + b + " is " + result);
         divider();
      }   
   }
   
   /*****************************************************************
   implement all the below methods f  before implementing the run method. 
   all the methods below will be called in the run method
   ******************************************************************/
  
   /* Converting operator symbols into words using switch statement */
   public static String convert(String op)// op can be *, /, ^, %, -, +
   {
     switch(op)
     {
      case("+"): return "plus";
      case("*"): return "mulitply";
      case("-"): return "minus";
      case("^"): return "to the power of";
      case("/"): return "divided by";
      case("%"): return "modulus";
      default:  return " ";
     }  
   }
   /* Converting the numbers into words using switch statement */
   public static String convertNumToWord(int a)  // a can be a number between 1-9
   {
      switch(a)
      {
         case 0: return "zero";
         case 1: return "one";
         case 2: return "two";
         case 3: return "three";
         case 4: return "four";
         case 5: return "five";
         case 6: return "six";
         case 7: return "seven";
         case 8: return "eight";
         case 9: return "nine";
         default: return " ";
      }
      
   }
   /* Calculating the input operators and two numbers using the if statement */
   public static int calculate(int a, int b, String operator)// op can be +, -, *, /, ^, %
   {
      if(operator.equals("+"))
      {
         return a + b;
      }
      else if(operator.equals("*"))
      {
         return a * b;
      }
      else if (operator.equals("-"))
      {
         return a - b;
      }
      else if (operator.equals("^"))
      {
         return (int) Math.pow(a,b);
      }
      else if (operator.equals("/"))
      {
         return a / b;
      }
      else if (operator.equals("%"))
      {
         return a % b;
      }
      else
      {
         return 0;
      }          
   }

   /* This method outputs the instruction about operations. */
   public static void menu()
   {
      //write print statments to display the menu on the screen 
      System.out.println("To do addition enter +");
      System.out.println("To do multiplication enter *");
      System.out.println("To do subtraction enter -");
      System.out.println("To do exponent enter ^");
      System.out.println("to do division enter /");
      System.out.println("To do modulus enter %");
      divider();
   }

   /* This method outputs a divider */
   public static void divider()
   {
      for (int i = 1; i <= 29; i++)
      {
         System.out.print("*");
      }
      System.out.println();
   }
}