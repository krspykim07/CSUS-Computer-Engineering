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

public class Testing {
  public static void main (String[] args) {
    m(4,50);
  }

  public static void m(int a, int b) {
    if (a > b)
      return;
    if (a % 4 == 3)
      System.out.print(a + " ");
    m (a+3, b);
  }
}
