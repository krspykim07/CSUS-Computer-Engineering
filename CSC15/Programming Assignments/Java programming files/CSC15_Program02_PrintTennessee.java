/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: Program02_PrintTennessee
   Date written: 09/13/2021
   Self-Grade: 100
   Program #02                
   This program shows the use of different methods to print out letters that generates the word Tennessee. */
   
public class PrintTennessee
{
   //Main method use to call out the different method to print each letters
   public static void main(String[] args)
   {
     letterT();
     System.out.println("");
     letterE();
     System.out.println("");
     letterN();
     System.out.println("");
     letterN();
     System.out.println("");
     letterE();
     System.out.println("");
     letterS();
     System.out.println("");
     letterS();
     System.out.println("");
     letterE();
     System.out.println("");
     letterE();
   }
  
   //method name printT for the letter T
   public static void letterT()
   {
      System.out.println("TTTTTTTTTT");
      System.out.println("    TT    ");
      System.out.println("    TT    ");
      System.out.println("    TT    ");
      System.out.println("    TT    ");
      System.out.println("    TT    ");
     
   }
   
   //method name printE for the letter E
   public static void letterE()
   {
      System.out.println("EEEEEEEEEE");
      System.out.println("E");
      System.out.println("EEEEEEEEEE");
      System.out.println("E");
      System.out.println("EEEEEEEEEE");
   }
   
   //method name printN for the letter N
   public static void letterN()
   {
      System.out.println("N N     N");
      System.out.println("N   N   N");
      System.out.println("N     N N");
      System.out.println("N       N");
   }
   
   //method name printS for the letter S
   public static void letterS()
   {
      System.out.println(" SSSSSSSS ");
      System.out.println("S        S");
      System.out.println("S");
      System.out.println(" SSSSSSSS");
      System.out.println("         S");
      System.out.println("S        S");
      System.out.println(" SSSSSSSS");
   }
}