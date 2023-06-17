/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: RecursiveAlgador
   Date written: 05/02/2022
   Self-Grade: 100
   Description: 
   This program practices the use of recursive methods with different signatures.
   Featured uses are palindrome array, sum of array element, longest String in array, 
   two String comparison, and linked list sum. */

import java.util.*;

public class RecursiveAlgador {
   public static void main (String[] args) {
      System.out.println("testing the palindrom method");
      int[] a = {5,6,4,5,8,5,4,6,5,12};
      System.out.print(Arrays.toString(a) + " is palindrome?  ");
      System.out.println(palindrome(a,0));
      
      int[] b = {1,2,3,4,3,2,1};
      System.out.print(Arrays.toString(b) + " is palindrome?  ");
      System.out.println(palindrome(b,0));
      
      System.out.println("\ntesting sum of the digits");
      int num = 12345; 
      System.out.println("The sum of the digits in " + num + " is "+ sum(12345));
      
      System.out.println("\ntesting longest string in an array of string");
      String[] s = {"Hello","Bye","Said","song","Building"};
      System.out.println("The longest string is the array " + Arrays.toString(s) + " is " + longest(s,1,s[0]));
      
      System.out.println("\ntesing the equals method on the strings");
      String s1 = "hello";
      String s2 = "helloo";
      System.out.println("are the strings " + s1 + " and " + s2 +" equal? "  +equals(s1,s2,0));
      
      s1 = "tomorrow";
      s2 = "tomorrow";
      System.out.println("are the strings " + s1 + " and " + s2 +" equal? "  +equals(s1,s2,0));

      
      System.out.println("\ntesting the sum of the integers in a link list");
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(5);
      list.add(7);
      list.add(8);
      list.add(12);
      System.out.println("The sum of the numbers in the linklist " + list + " is " + listSum(list,0));
   }

   /* This method that accepts an array of String and returns 
      true if the array is palindrom and returns false otherwise */
   public static boolean palindrome(int[] a, int index) {
      if (index == a.length / 2)                                                // index reached the middle of the array
         return true;                                                           // return true (end of recursive)
      return (a[index] == a[a.length - 1- index] && palindrome(a, index + 1));  // return (left array element == right array element) && call palindrome (array, index + 1)
   }

   /* write a recursive method that accepts an integer as its parameter and 
      returns the sum of the digits in teh given number
      for example sumDigit(1234) should return 1 + 2 + 3 + 4 = 10 */
   public static int sum(int num) {
      if (num == 0)                                                             // num left 0
         return 0;                                                              // return 0 (end of the recursive)
      return ((num % 10) + sum(num/10));                                        // return (grab right num) + sum (remaining num)
   }

   /* This recursive method that accepts an array of String and 
      returns the string with the longest length */
   public static String longest(String[] s, int index, String longest) {
      if (index == s.length)                                                    // index reach array length
         return longest;                                                        // return same longest (end of recursive)
      if (longest.length() < s[index].length())                                 // compare current longest < array[index] String
         longest = s[index];                                                    // set longest = array[index]
      return longest(s, index + 1, longest);                                    // return longest (s, index +1, current longest)
   }

   /* This recursive method that accepts two string paramters, 
      returns tru if the strings are the same, false otherwise */
   public static Boolean equals(String s1, String s2, int index) {
      if (s1.length() != s2.length())                                           // compare the two string length
         return false;                                                          // return false (end of recursive)
      if (index == s1.length())                                                 // index reach one of the string length
         return true;                                                           // return true (end of recursive)
      if (s1.charAt(index) != s2.charAt(index))                                 // if both character didn't match
         return false;                                                          // return false (end of recursive)
      return true && equals(s1, s2, index+1);                                   // return true && equals (same two string, index + 1)
   }

   /* This recursive method that accepts a linklist of integers and 
      finds the sum of all the numbers in the list */
   public static int listSum(LinkedList<Integer> list, int index) {
      if (index == list.size() - 1)                                             // if current index == end of list
         return list.get(index);                                                // grabs the last element in the list
      return list.get(index) + listSum(list, index + 1);                        // return grab current element in the list + listSum(list, index + 1)
   }
}