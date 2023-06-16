/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: Narrative
   Date written: 10/14/2021
   Self-Grade: 100
   Program #06
   This program allows the user to answer questions and those answers will be used to generate a story */

import java.util.Scanner;       // allows to make the user input

public class Narrative
{
  /* the main method is given to you, rewite the main method to use your own variable names, and prompts
  for example you must change the following names kb, count, and i . Must choose your own variable names */

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);
    description();
    System.out.print("How many stories are you making: ");
    int count = kb.nextInt();
    for(int i = 1; i <= count ; i++)
    {
      System.out.println("\nAnswer a few questions and I will make up a story for you\n");
      narrative(kb);
    }

  }

   /* This method outputs the introductory message for this program */
   public static void description()
   {
     System.out.println("\n\t\t================== Welcome to Story Telling =================");
     System.out.println("\t\tYou will be given a set of questions that you need to answer.");
     System.out.println("\t\t\tAfter, I will show you a story about it.");
     System.out.println("\t\t==============================================================\n");
   }
 
  /* This method use for input and output process of this program. 
     This will output sets of questions, input the answers, and output the story */
  public static void narrative(Scanner kb)
  {
    System.out.print("What is your name? ");
    kb.nextLine();
    String name = kb.nextLine();
    System.out.print("What is your nickname? ");
    String nickname = kb.nextLine();
    System.out.print("What year you were born? ");
    int year = kb.nextInt();
    System.out.println("Oh! you are " + (2021 - year) + " years old this year 2021.");
    System.out.print("If you're going out for a date, how much budget you would bring (minimum of $95)? ");
    double budget = kb.nextDouble();
    System.out.print("Which season do you think is the best time to go out on a date? ");
    kb.nextLine();
    String season = kb.nextLine();
    System.out.print("Which restaurant would you love to go on a date? ");
    String restaurant = kb.nextLine();
    System.out.print("What would be your food for your date? ");
    String food = kb.nextLine();
    System.out.print("What flowers do you think will be the best to give to your date? ");
    String flower = kb.nextLine();
    System.out.print("Which park do you think you can hangout with your date? ");
    String park = kb.nextLine();
    System.out.print("what is your partner's favorite color? ");
    String color = kb.nextLine();
    System.out.print("Who is your date or will have a date with? ");
    String crush = kb.nextLine();

    
    System.out.println("\n===================== STORY TELLING TIME! =====================");
    System.out.println("It was a lovely weekend morning in the " + season + " season.");
    System.out.println("Everyone is either starting their weekend trip or staying at home.");
    System.out.println(name + " was starting the day with a smile!");
    System.out.println("The budget for today is: " + budget);

    // Restaurant category
    System.out.println(nickname + " went to "+ restaurant + " and buy some expensive " + food +".");
    budget = left_budget(budget, food, 2, 40, 20); // calling out the budget, item to buy, quantity, maximum cost, and minimum cost of the item.

    // flower shop category
    System.out.println(nickname + " then went to a flower shop to buy some " + flower + ".");
    budget = left_budget(budget, flower, 1, 30, 15); // calling out the budget, item to buy, quantity, maximum cost, and minimum cost of the item.

    // clothing shop category
    System.out.println(nickname + " also went to a clothing shop to buy some scarf and wants to wrap it as a present.");
    budget = left_budget(budget, "scarf", 1, 20, 10); // calling out the budget, item to buy, quantity, maximum cost, and minimum cost of the item.

    System.out.println("After, " + nickname + " went to under a big tree near the " + park + " park...");
    System.out.println("then prepared all the things.\n");
    System.out.println("\tfavorite " + food + ".");
    System.out.println("\t\tfavorite " + flower + " flowers.");
    System.out.println("\tfavorite " + color + " scarf.");
    System.out.println("\t\t\tAnd lastly, a picture frame.");
    System.out.println("\nand the person in the photo was...");
    naming(crush);
    System.out.println(nickname + " enjoyed eating alone while watching the view.");
    System.out.println("It was a lovely day for " + nickname + ".");
    System.out.println("==============================================================");
  }

  public static double left_budget(double budget, String item, int quantity, int max, int min)
  {
    
    double random_cost = (double) (Math.random() * (max - min) + min);  //generate random numbers within the given range (assumed min -> max cost of item)
    double final_cost = quantity * (Math.round(random_cost * 100.0) / 100.0); // final cost: quantity mutiply by the generated cost (rounds up to 2 decimal places)
    budget = Math.round((budget - final_cost) * 100.0) / 100.0; // budget left (convert in rounds up to 2 decimal places)
    
    System.out.println("The cost of the " + item + " for " + quantity + " is $" + final_cost + ".");
    System.out.println("You now have $" + budget + " left.");
    
    return budget;
  }
  
  /* This method allows to pull a string word or sentence to read its length
    outputs uppercase letter separated each with 2 space */
  public static void naming(String crush)
  {
    int words = crush.length(); //storing the length of the string
    System.out.print("\n\t\t");
    for (int i = 0; i <= words- 1; i++)
      {
        char letter= crush.charAt(i); // storing the character from the string crush
        System.out.print(Character.toUpperCase(letter) + "  "); //outputs the uppercase character stored in the letter
      }
    System.out.println("\n");
  }
}