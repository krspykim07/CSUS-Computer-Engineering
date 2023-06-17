/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: StackAlgador
   Date written: 04/15/2022
   Self-Grade: 100
   Description: This program converts an infix expression to a postfix expression
               and then evaluates the postfix expression. This program requires to use Stacks
    */
   
import java.util.*;

public class StackAlgador {

}

interface myStack {
   public void push(String token);
   public String peek();
   public boolean isEmpty();
   public String pop();
}

class Stack implements myStack {
   private ArrayList<String> list;                // String arraylist "list"
   int top;                                       // index of the top of the stack
   
   // constructor
   public Stack() {
      list = new ArrayList<String>();
      top = 0;
   }
   
   // This method push the token to the top of the Stack
   public void push(String token) {
      list.add(token);
      top++;
   }
   
   // This method pops and returns the element at the top of the stack
   public String pop() {

      if (!isEmpty()) {
         top--;
         String current = list.get(top);
         list.remove(top);
         return current;
      }

      return null;
   }
   
   // This method rteturns the element at the top of the stack without popping it
   public String peek() {

      if(!isEmpty())
         return list.get(top-1);
      return null;
   }
   
   // This method returns a boolean whether the stack is empty or not
   public boolean isEmpty() {
      return list.size() == 0;
   }
   
   // This method returns a string representing the elements in the stack
   public String toString() {
      return list.toString();
   }
}

class Expression {
   private String exp;                            // instance variable
   
   // constructor
   public Expression(String exp) {
      this.exp = exp;                             // assigning to exp
   }

   /* This method converts infix to postfix expression */
   public String getPostfix() {

      String postFixResult = "";                   // declaring a string to hold the postfix expression 
      Stack stack = new Stack();                   // create an object of Stack
      StringTokenizer st = new StringTokenizer(exp, " ");      // tokenize the exp instance variable declared
      
      while(st.hasMoreTokens()) {         // check each token
         String token = st.nextToken();
         
         // if token is any of the operation (+, -, *, /)
         if ( token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {        // condition token is any operations: +, -, *, /
            
            int precedenceNum = precedence(token);        // get the precedence of the token

            if (precedenceNum == 3){      // if operation * or /
               while(!stack.isEmpty() && precedence(stack.peek()) >= 3) {
                  postFixResult += stack.pop() + " ";
               }
            }
            else if (precedenceNum == 2) {      // if operation + or -
               while(!stack.isEmpty() && precedence(stack.peek()) >= 2) {
                  postFixResult += stack.pop() + " ";
               }
            }
            stack.push(token);         // push the token to the stack
         }
         else {
            postFixResult += token + " ";         // concatenate the token to the postfix expression
         }
      }

      while (!stack.isEmpty()) {
         postFixResult += stack.pop() + " ";      // concatenate the token to the postfix expression
      }
      return postFixResult;           // return postfix result
   }
   
   /* This method identifies the operation */
   private static int precedence (String opr) {

      if (opr.equals("*") || opr.equals("/"))
         return 3;
      else if (opr.equals("+")|| opr.equals("-"))
         return 2;
      return 0;
   }

   /* This method evaluates a postfix expression */
   public int evalPostfix(String post) {
         Stack stack = new Stack();               // create stack object
         StringTokenizer st = new StringTokenizer(post, " ");      // tokenize the post instance variable declared
         
         while (st.hasMoreTokens()) {         // check each token

            String token = st.nextToken();

            // if token is not any operations (+, -, *, /)
            if( !token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
               stack.push(token);                  // push the token to the stack
            }
            else {
               
               int num2 = Integer.parseInt(stack.pop());          // pop the stack and store to num2 (convert String to Int)
               int num1 = Integer.parseInt(stack.pop());          // pop the stack and store to num1 (convert String to Int)
               int calculated = calculate(num1, num2, token);     // calculate the num1 and num2 by calling calculate method

               stack.push(Integer.toString(calculated));          // push the converted (int to String) calculated
            }
         }
         return Integer.parseInt(stack.pop());        // return the converted (String to int) pop from the stack
      }
   
   /* This method calculates the number */
   private int calculate(int num1, int num2, String opr) {
      // using switch method depending on operation
      switch (opr){
         case "*" : return num1 * num2;
         case "/" : return num1 / num2;
         case "+" : return num1 + num2;
         case "-" : return num1 - num2;
         default : return 0;
      }
   }
}
class ExpDrive {
  public static void main(String[] args) {
     
     // String s = "5 - 2";
     ArrayList <String> exp = new ArrayList<String>();
     exp.add("2 + 3 + 7 * 4 - 2 / 3");
     exp.add("3 - 4 / 2 + 6 * 3");
     exp.add("5 * 6 - 8 + 2 * 10");
     exp.add("4 + 8 * 3 - 2 / 34");
     exp.add("6 - 3 + 6 / 2 * 4 - 8");
     
     for(int i = 0; i < exp.size(); i++) {
     
        Expression e1 = new Expression(exp.get(i));
        String post = e1.getPostfix();
        int result = e1.evalPostfix();
        System.out.println("Infix: "+ exp.get(i) + ",  postfix: " + post + " = " + result);
     }

}
}
/*
Write your own driver to test your code
this driver should be similar to the one 
I provided but must be your own expressions
*/
class MyExpDrive {
   public static void main(String[] args) {
      ArrayList <String> exp = new ArrayList<String>();
      exp.add("2 + 3 * 6");
      exp.add("2 * 3 + 4 / 3 * 2");
      exp.add("1 + 2 - 3 * 4 / 5");
      
      for(int i = 0; i < exp.size(); i++) {
         
         Expression express = new Expression(exp.get(i));
         String post = express.getPostfix();
         int result = express.evalPostfix();
         System.out.println("Infix: "+ exp.get(i) + "\npostfix: " + post + " = " + result + "\n");
      }

   }
}

class NewDriveMine {
   public static void main(String[] args) {

      Expression express = new Expression("2 + 3 * 6");
      String exp = "1 2 3 * + 6 7 * - 2 3 * +";
      int result = express.evalPostfix(exp);
      System.out.println(result);
   }
}