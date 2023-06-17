/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: MatchingGameAlgador
   Date written: 02/11/2021
   Self-Grade: 100
   Program #02
   Description: This program allows the user to play the number matching game.
                The program generate 3 random numbers and the user gets a point if there are 2 or 3 matched.
                The user allows to continue and accumulate points till the user stops.
                The program also allows the user to play a new game for other user.
   */
import java.util.*;

public class MatchingGameAlgador {
    
    // description method prints out the description of the program
    public static void description(){
        System.out.println("***************************************************************");
        System.out.println("*         WELCOME TO THE NUMBER MATCHING GAME!                *");
        System.out.println("*   I will generate three random numbers for you.             *");
        System.out.println("*   If two of the numbers match, you win 100 dollars.         *");
        System.out.println("*   If you get three matching numbers, you win 300 dollars.   *");
        System.out.println("***************************************************************");
    }

    // getRandNum method generates random number
    public static int getRandNum(Random rand){
        return rand.nextInt(9) + 1;
    }

    // match method checks 3 variables if 2 or 3 matches
    public static int match(int n1, int n2, int n3){
        
        if(n1 == n2 && n2 == n3)        // condition whether all the 3 numbers matched
            return 3;                   // return 3
        else if(n1 == n2 || n1 == n3 || n2 == n3)       // condition whether 2 of the 3 numbers matched
            return 2;                                   // return 2
        else                    //no numbers matched
            return 0;           // return 0;
    }

    // play method lets the single user play the game
    public static void play(Random rand, Scanner scan){
        
        int[] num = new int[3];     // declaration of num array
        int points = 0;             // initializing points variable to 0
        String answer = " ";        // declaration of answer variable

        while(!answer.equalsIgnoreCase("q")){   // while loop for answer is not equal to q or Q
            
            System.out.print("\nYou got:");
            for (int i = 0; i < num.length; i++){       // for loop to generate 3 random numbers and store it in num array
                num[i] = getRandNum(rand);              // calling the getRandNum method and store it in the array
                System.out.print(" " + num[i]);         // prints out the random number generated
            }
            System.out.println();

            int match = match(num[0],num[1],num[2]);    // calling match method and assign the returned value to match variable

            switch(match){
                case 2:                 // condition when match == 2
                    points += 100;      // add 100 to points variable
                    System.out.println("You got two matches, you won 100 dollars");
                    break;
                case 3:                 // condition when match == 3
                    points += 300;      // add 300 to points variable
                    System.out.println("You got all matched, you won 300 dollars");
                    break;
                default:        // default condition
                    System.out.println("Sorry, no match");
                    break;
            }
            System.out.print("\nHit enter to continue or press q/Q to quit: ");     // prints out the message for user to continue or exit
            answer = scan.nextLine();           // stores the user's response
        }

        System.out.println("\nTotal amount you won: " + points);        // prints out the total points user got
    }

    public static void main(String[] args){
        Random rand = new Random();             //create a random object
        Scanner scan = new Scanner(System.in);  //create a scanner object
        String answer = "";                     // decleration of answer variable

        while(!answer.equalsIgnoreCase("q")){   // while loop for answer is not equal to q or Q
            description();      // calling the description method

            System.out.print("\nWhat is your name: ");
            scan.nextLine();
            
            play(rand,scan);        // call the play method

            System.out.print("\nHit enter to let another person play or enter Q to quit the program");  // ask if there's another user to play the game
            answer = scan.nextLine();       // stores the user's response
        }

        System.out.println("\nThank you for playing!");     // prints out goodbye message
    }
}
