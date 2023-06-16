/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: CalculatorAlgador
   Date written: 01/04/2021
   Self-Grade: 100
   Program #09
   This program plays a simple guessing game with the user.
   This program generates a random number from 500 to 600
   and allows the user to guess multiple attempts and outputs number of guesses*/

import java.util.*;

public class GuessingNumber {
    //class constant MIN for the minimum number 500
  
   //class constant MAX for the maximum number 600
   public static final int MAX = 600;
   
    public static void main(String[] args) {
        
        //declare a scanner object
        Scanner console = new Scanner(System.in);
        
        //call the proper method to display the info for the game
        giveIntro();
        
        //call the run method
        run(console);
    }
    
    /* run method that contains all the work to input and output*/
    public static void run(Scanner console)
    {  
                 
        //declaring a random object
        Random rand = new Random();
        
        //initialize to let the user play first time
        String play = "yes";
        
        //while loop for user to keep playing
        while (play.equals("yes"))
        {
            //generate a random number between MIN and MAX and store it in a variable
            int random_num = rand.nextInt((MAX - MIN) + 1) + MIN;
            
            //calling the playGame method to make the user guess the random number and return the total number of tries
            int total_guess = playGame(console,random_num);
            
            //display the total number of guesses
            System.out.println("\nYou guesses the correct number by making "+ total_guess +" guesses\n");
             
            //asking the user if they want to play again
            System.out.println("******************************************************\n");
            System.out.print("Do you want to play another round? enter yes or no: ");
            console.nextLine();
            play = console.nextLine();
            System.out.println("******************************************************\n");
        }
        
        //prints out a goodbye message
        System.out.println("\n\t**************************");
        System.out.println("\t| Thank you for playing! |");
        System.out.println("\t|   See you next time!   |");
        System.out.println("\t**************************");
    }
    /*giveIntro method prints out the introduction message*/
    public static void giveIntro() {
        System.out.println("\n\t         ++++   WELCOME TO GUESSING GAME!   ++++            ");
        System.out.println("\t               My name is Kim the computer                  ");
        System.out.println("\t             and I will be your game master                 \n");
        
        System.out.println("\t**********************************************************");
        System.out.println("\t| INSTRUCTION:                                           |");
        System.out.println("\t|  >> I will be thinking a number between 500 to 600.    |");
        System.out.println("\t|  >> You are required to guess the number.              |");
        System.out.println("\t|  >> You are allowed to guess multiple times            |");
        System.out.println("\t|     until you get it right.                            |");
        System.out.println("\t|  >> For each guess, I will tell you whether the        |");
        System.out.println("\t|     right answer is higher or lower than your guess.   |");
        System.out.println("\t**********************************************************");
    }

    /*playGame method allows user to guess multiple times for the right number and counts the number of tries*/
    public static int playGame(Scanner console, int num) {
       
        //variable to hold the total number of tries made by the user
        int total_guess = 0;
        
        //variable that hold user's guess number
        int guess = 0;
        
        System.out.println("\nEnter a number between 500 and 600");

        while (guess != num)
        {
            System.out.print("Enter your guess --> ");
            guess = console.nextInt();

            if(guess >= MIN && guess <= MAX) //condition when the user is within the 500 - 600 range
            {
                if(guess < num){ //When guess < num: print to guess a higher number
                    System.out.println("\t****************************");
                    System.out.println("\t|  Guess a higher number!  |");
                    System.out.println("\t****************************");
    
                }
                else if(guess > num){ //When guess > num: print to guess a lower number
                    System.out.println("\t****************************");
                    System.out.println("\t|  Guess a lower  number!  |");
                    System.out.println("\t****************************");
                }
            }
            else{ //else condition that outputs the guess is out of range
                System.out.println("\t****************************");
                System.out.println("\t|   Guess out  of Range!   |");
                System.out.println("\t| Guess between 500 to 600 |");
                System.out.println("\t****************************");
            }

            total_guess++; //increment the number of tries
        }
        
        return total_guess; //return the number of tries
    }

    public static final int MIN = 500;

}