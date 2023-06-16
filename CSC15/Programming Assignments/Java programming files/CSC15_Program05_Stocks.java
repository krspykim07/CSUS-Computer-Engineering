/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: Program05_Stock
   Date written: 10/05/2021
   Self-Grade: 100
   Program #05                
   This program allows the user to enter buying and selling stocks and outputs the full information and the profit that user made */

import java.util.Scanner;

public class Stocks
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    description();
    run(kb);
  }
  /* This method shows all the input, calculation, output of this program */
  public static void run(Scanner kb)
  {
    System.out.print("Enter the number of the customers using this app--> ");
    int repeating = kb.nextInt();
    
    for (int i  = 1; i <= repeating; i++)
    {
      System.out.print("Enter the name of the stock--> ");
      kb.nextLine();
      String name = kb.nextLine();
      
      // Buying stocks section
      System.out.print("Enter the number of the stocks purchased--> ");
      double count = kb.nextDouble(); 
      System.out.print("Enter the purchase price per stock--> "); 
      double buyprice = kb.nextDouble();
      
      // Selling stock sections
      System.out.print("Enter the current price of the stock--> ");
      double sellprice = kb.nextDouble();
      System.out.print("Enter the commission rate--> ");
      double rate = kb.nextDouble();

      //calculation Buying and Selling stocks section
      double purchaseAmount = getTotal(buyprice, count);
      double buyComission = getComission(purchaseAmount, rate);
      double sellAmount = getTotal(sellprice, count);
      double sellComission = getComission(sellAmount, rate);
      double profit = profitOrLoss(purchaseAmount, sellAmount, buyComission, sellComission);
      
      //output section
      stars();
      stockOutput(name, count, buyprice, buyComission, sellprice, sellComission, profit);
      stars();
    }

    System.out.println("\nCome back soon");
  }
     
 /* This method outputs the description of the program */
  public static void description()
  {
    System.out.println("Welcome to stock calculator");
    System.out.println("This app calculates the amount of the profit that you can make when buying and selling some stocks");
    System.out.println("when you buy or sell stock you need to pay commission");
    System.out.println("Answer a few questions then you will see the profit you made");
    stars();
  }
  /* This method outputs a divider using the asterisks */
  public static void stars()
  {
    System.out.println("*********************************************************************************** ");
  }
  /* This method calculates the  stock count times the price per stock. */
  public static double getTotal(double price, double count)
  {
    return (price * count);
  }
  /* This method calculates the commission rate from the total money have from buying/selling. */
  public static double getComission(double price, double rate)
  {
    return (price * (rate/100));
  }
  /* This method calculates the overall profit for buying and selling stocks. */
  public static double profitOrLoss(double purchaseAmount, double sellAmount,   double buyComission,   double sellComission)
  {
    return (sellAmount - purchaseAmount - buyComission - sellComission);
  }

  /* This method outputs the whole information for buying and selling stocks */
  public static void stockOutput(String name, double count, double buyprice, double buyComission, double sellprice, double sellComission, double profit)
  {
    System.out.println("Here is the information about your transaction");
    System.out.println("Stock: " + name);
    System.out.println("Number of the stocks bought: "+ (int) count);
    System.out.println("Purchase price per stock: " + buyprice);
    System.out.println("Total commission paid when buying the stock: " + buyComission);
    System.out.println("Selling price of the stock: " + sellprice);
    System.out.println("Total commission paid when selling the stock: " + sellComission);
    System.out.println("The profit you made buying and then selling this stock: " + profit);
  }
}