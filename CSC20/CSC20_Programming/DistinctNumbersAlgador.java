/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: DistinctNumbersAlgador
   Date written: 01/31/2021
   Self-Grade: 100
   Program #01
   Description: This program allows the user to input number until it has 10 distinct numbers 
                and ignore repeated numbers.
   */
import java.util.*;

public class DistinctNumbersAlgador
{

  //found method helps to compare the current input number to the numbers stored already in the Array
  public static Boolean found(int[] num, int n){
    
    for(int i = 0; i <= num.length - 1; i++){   // for-loop to check every number in the array
      if(num[i] == n){ 
        return true;      // return true if the current number input is the same in one of the array
      }
    }
    return false;     // return false after checking all the numbers in the array
  }

  //getInput method allows the user to input numbers and call the found method to check the numbers
  public static int[] getInput() {
    Scanner scan = new Scanner (System.in);
    
    int[] num = new int[10];

    for(int i = 0; i <= num.length - 1; i++){
      System.out.print("Enter a number: ");
      int temp = scan.nextInt();        //create a new variable temp to store current number input
      if (found(num, temp) == true) {     //if statement and calling found method checking if its true
        i--;    // disregard the current loop
      }
      else {
        num[i] = temp;  // add the current temp number to the array
      }
    }
    return num;   //return the num array
  }

  //display method allows the program to output the whole array
  public static void display(int[] num) {
    System.out.println("I filtered out all the repeated numbers you entered and kept only one copy of each number");
    System.out.println("Here is the list of your numbers");
    System.out.print("(");

    for(int i = 0; i <= num.length - 1; i++){    //for-loop to print all the numbers in array
      if (i == num.length - 1){
        System.out.print(num[i] + ")");       //check the index and prints out the last number in the array
      }
      else{
        System.out.print(num[i] + ", ");      //prints out the first 9 numbers in the array
      }
    }
  }
  
  public static void main(String[] args){
    System.out.println("Welcome to the distinct numbers. \nI will remove the repeated numbers and display the numbers you just entered");
    int[] num = getInput();    //calling getInput method and store it in array num
    display(num);             //call the display method
  }
}