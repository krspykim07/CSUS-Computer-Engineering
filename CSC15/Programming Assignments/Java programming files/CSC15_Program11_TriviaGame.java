/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: TriviaGameAlgador
   Date written: 11/18/2021
   Self-Grade: 100
   DESCRIPTION:
      This program is about trivia game were there are set of questions that the user
      needs to answer. At the end, the program will show the user's total score.
   MAIN REQUIREMENT:
      * Use class constant to store the number of questions in the game.
      * Use of arrays to store information such as the questions, answers, and points.
      * Use while loop to let the user ask to play the game. */ 

import java.util.*;

public class TriviaGame 	 
{
   public static final int SIZE = 5;      //class constant SIZE for the number of questions
   public static void main(String[] args)
   {
      Scanner scan = new Scanner (System.in);
      run(scan);
   }

   public static void run(Scanner scan)
   {
      String[] questions = new String[SIZE];       //declaring questions array
      String[] answers = new String[SIZE];         //declaring answers array
      int[] points = new int[SIZE];                //declaring points array

      initialize(questions, answers, points);      //calling initialize method to store the values
      Boolean playing = true;                      //initialize boolean 
      
      while(playing){         //while loop to continue running the game
         
         description();         //calling description method
         int score = play(questions, answers, points, scan);   //call play method and store the return value to score
         System.out.println("Your score is: " + score);        //print out score
         System.out.print("\n  Is there another person?\n  ");     //asking the user if someone wants to play the game
         playing = (scan.next()).equals("yes");                //store the boolean value comparing the input to "yes"
         scan.nextLine();        //erases the remaining scanned value
      }
      
   }

   /*The initialize method stores each information in each array index for questions, answers, and points */
   public static void initialize(String[] questions, String[] answers, int[] points)
   { 	
      questions[0] = "What is the name of the school Harry Potter attended?";
      answers[0] = "hogwarts";
      points[0] = 1;

      questions[1] = "Who did Harry Potter married?";
      answers[1] = "ginny weasley";
      points[1] = 2;

      questions[2] = "What spell did Harry Potter casted to ward off Dementors?";
      answers[2] = "expecto patronum";
      points[2] = 1;

      questions[3] = "What is the seventh and the last Horcrux that got destroyed?";
      answers[3] = "nagini";
      points[3] = 3;

      questions[4] = "What is the most popular drink in the Harry Potter series?";
      answers[4] = "butterbeer";
      points[4] = 3;
   }
   
   /*The play method runs the gaming system comparing the user input to the right answer*/
   public static int play(String[] questions, String[] answers, int[] points, Scanner scan)
	{
      int score = 0;    //initialize the score of the user to 0

      //for-loop to show the 5 questions
      for(int i = 0; i < SIZE; i++){
         System.out.println("\nQuestion " + (i+1));     //outputs question number
         System.out.print("  " + questions[i] + " ");   //outputs the question
         String guess = scan.nextLine();                //input the user answer to guess
         guess = guess.toLowerCase();                   //convert the input to all lowercase
         
         //if statement comparing the input to answer
         if(guess.equals(answers[i])){                   
            score+=points[i];           //add the question point to the score
            System.out.println("\tThat is correct!");       //prints out that the user input is correct
         }
         else {
            System.out.println("\tWrong. The correct answer is " + answers[i]);  //prints out that the user is incorrect and the right answer
         }
      }
      return score;     //return the total score of the user
	}

   /*The description method outputs the header of the game*/
   public static void description()
   {
      System.out.println("\n\t*************************");
      System.out.println("\t*     Welcome to the    *");
      System.out.println("\t*   HARRY POTTER QUIZ   *");
      System.out.println("\t*************************");
   }
} 
	 