/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: AntAlgador
   Date written: 11/17/2021
   Self-Grade: 100
   DESCRIPTION:
      This program allows the user to input the height of the building for the ant to climb
      and outputs the building height and number of slips ant had trying to reach the top of the building.
   MAIN REQUIREMENT:
      * Data validation for input height considering data type and input of less than or equal to 0.
      * Generating random number 0-1 for the ant whether move 1 step or slip.
      * Using while loop to let the user decide whether to run the whole program again. */ 
import java.util.*;

public class ClimbingAnt
{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner (System.in);
    Random rand = new Random();

    run (rand,scan);

  }

  /*The run method contains the whole process of the program.*/
  public static void run(Random rand, Scanner scan)
  {
    Boolean trying = true;  //initialize the trying variable to true for the program to run
    while (trying) {
      int height = getHeight(scan);   //calling the getHeight method to work on height of the building and store in height variable
      int slip = move(height,rand);   //calling move method and to work on climbing ant and store the number of slips in slip variable

      System.out.println("To climb up the building of height " + height + " steps the ant slipped " + slip + " times"); //output the height and the total # of slips
      System.out.print("another run: "); //asking the user for another run
      String running = scan.next();      //reads the input and stored in running variable
      trying = running.equals("yes");    //comparing the running variable contains the same characters "yes" and store the boolean value to trying variable
    }
  }
  
  /*The getHeight method allows the user to input the height of the building.*/
  public static int getHeight(Scanner scan)
  {
    int height = 0;   //initialize the height of the building to 0
    
    while(height <= 0){     //allows to keep running if the input <= 0
      System.out.print("What is the height of the building: ");   //ask the user about the height
      while(!scan.hasNextInt()){    //allows to keep running when the input is not integer
        scan.nextLine();            //deletes the scan data input
        System.out.print("What is the height of the building: ");   //ask the user again about the height
      }
      height = scan.nextInt();   //store the input integer to height
      scan.nextLine();           //deletes the scan data input
    }
    return height;      //return the height value
  }
  
  /*The move method allows to calculate for random number (0 or 1) to decide whether the ant moves forward or fall off and start again.
    It return the total number of slips ant did. */
  public static int move(int h, Random rand)
  {
    int distance = h; //initialize the height value into the distance for ant to climb
    int slip = 0; //initialize the number of total slips
    
    do{           //do-while loop to let run first then ask the condition
      int step = rand.nextInt(2); //creates a random integer from 0-1 (The number 2 is exclusive indicate as a boundary)
      
      switch(step){               //switch statement for step wether 0 or 1
        case 0:                   //case 0 indicates the ant slip
          distance = h; slip++;   //the distance climbing resets to the height building and increment total slip by 1
          break;
        case 1:                   //case 1 indicates the ant move
          distance--;             //decrease the distance for climbing
          break;
      }
    }while(distance != 0);    //condition if there is still distance between the ant and the top of the building to run

    return  slip; //return the total slip ant made
  }
}