/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: CryptAlgador
   Date written: 10/28/2021
   Self-Grade: 100
   Program #08 
   This program performs a "Caesar cipher," which is a shift of characters in
   a message by a given number of letters.  It provides a crude form of
   encoding to pass along a secret message.
   The program serves as an example of Strings and the type char. */

import java.util.Scanner;

public class CryptMessage {
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      go(input);
   }
   
   /* go() method shows all the work for this program (input & output) */
   public static void go(Scanner input)
   {
      // Ask the user times using the program
      System.out.print("How many times do you want to use this app: ");
      int tries = input.nextInt();
      for (int i = 1; i <= tries; i++)
      {
         menu();  // calling menu() to output the instruction
         System.out.print("Enter your choice --> ");    // ask the user to choose between the given menu
         char choice = (input.next()).charAt(0);
         input.nextLine();
         
         if (choice == 'e')   // if user inputs e (encrypt)
         {
            System.out.print("Your message? ");    // ask the user to input message
            String secretletter = input.nextLine();
            System.out.print("Encoding key? ");     // ask the user to input key
            int secretkey = input.nextInt();

            String encrypted = encrypt(secretletter,secretkey);     //call the encrypt() method
            System.out.println("The encrypted message is : " + encrypted);      // output encrypted message
         }
         else if (choice == 'd')    // if user inputs d (decrypt)
         {
            System.out.print("Your message? ");    // ask the user to input message
            String secretletter = input.nextLine();
            System.out.print("Encoding key? ");    // ask the user to input key
            int secretkey = input.nextInt();

            String decrypted = decrypt(secretletter,secretkey);       // call the decrypt() method
            System.out.println("The decrypted message is : " + decrypted);    // output decrypted message
         }
         else  // if the user inputs out of the given choices from menu
         {
            System.out.println("Invalid choice!");    // outputs invalid choice
         }
      }
     
   }

   /* encrypt() method use to encrypt input message
      Returns a new string with the letters of the given string shifted
	   forward or backward by the amount equal to the given key.
	   For example, shift("hello", 3) returns "khoor". */
   public static String encrypt(String secretletter, int secretkey) {
              
      secretletter = secretletter.toUpperCase();    // transform message to uppercase
      String encrypted = "";              // initialize the encrypted message

      for (int i = 0; i < secretletter.length(); i++ )     // loop to check each letter of the message
      {
         char let = secretletter.charAt(i);       // storing each letter from the message to a char data type "let"

         if(let == ' '){      // if the letter is a space (' ')
            let = ':';        // declaring space (' ') -> ':'
         }
         else if(let >= 'A' && let <= 'Z'){     // if the letter is within A-Z
            let += secretkey;       // key adds to the current letter

            // letter checking
            // condition letter > Z which will go Z -> A counting...
            if(let > 'Z')     // if the letter is > Z    
            {
               let -= 26;     // current letter minus 26 (ASCII table)
            }
            else if (let < 'A')  // if the letter is < A
            {
               let += 26;     // current letter add 26 (ASCII table)
            }
         }

         encrypted += let; // add the letter to encrypted message

      }
      return encrypted; // return the encrypted message
   }
   
   /* decrypt() method use to decrypt input message 
      decrypts the encrypted string using the same key value. 
	   For example, decrypt("khoor", 3) returns "hello".  */
   public static String decrypt(String secretletter, int secretkey) {
      
      secretletter = secretletter.toUpperCase();          // converts the message to uppercase
      String decrypted = "";                    // initializing decrypted message

      for (int i = 0; i < secretletter.length(); i++ )     // loop to check each letter of the message
      {
         char let = secretletter.charAt(i);         // storing each letter from the message to a char data type "let"

         if(let == ':'){      // if the letter is ':'
            let = ' ';        // declaring ':' -> space ' '
         }
         else if(let >= 'A' && let <= 'Z'){     // if the letter is within the A-Z range
            let -= secretkey;       // key minus the letter
            
            // letter checking
            // condition letter < A which will go A -> Z countinue subtracting...
            if(let < 'A'){ 
               int diff = 'A' - let;      // when the letter overboard subtracting to < A, get the difference from A to the current letter (< A) :REFER TO ASCII TABLE
               let = (char)('Z' - diff + 1);    // the difference will minus from Z
            }
            //condition letter > Z which will go Z -> A countinue add
            else if (let > 'Z')
            {
               int diff = 'Z' - let;     // when the letter overboard > Z, get the different between Z to the current letter ( > Z) :REFER TO ASCII TABLE
               let = (char) ('A' + diff + 1);   // add the difference to A
            }
         }
         decrypted += let;    // adds the letter to decrypted message
      }
      return decrypted;    // return decrypted message
   }
   
   /* This method display the menu for the user. refer to the sample output */
   public static void menu()
   {
      System.out.println("\t********");
      System.out.println("Enter e to encrypt your message");
      System.out.println("Enter d to decrypt your message");
      System.out.println("\t********");
   }

}