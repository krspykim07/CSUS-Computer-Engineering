/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: QueueAlgador
   Date written: 04/29/2022
   Self-Grade: 100
   Description: 
   This program construct a Queue class and use the concept of handling exceptions. */

import java.util.*;
public class QueueAlgador {
}

class Queue {
   //attribute
   ArrayList<Integer> list;
   
   //constructor
   public Queue() {
     list = new ArrayList<Integer>();
   }

   /* This method allows to add an element in the list*/
   public void enqueue(Integer num) {
      list.add(num);
   }
   /* This method lets grab and remove the element from the list */
   public Integer dequeue() {
     return list.remove(0);
   }

   /* This method lets to grab the element in index 0 without removing */
   public Integer peek() {
      return list.get(0);
   }

   /* This method returns the whole list */
   public String toString() {
     String s = "";

     Queue copy = new Queue();
     boolean stop = false;
     while(!stop) {
       try {
          int num = this.dequeue();
          copy.enqueue(num);
          s = s + " " + num;
       }
       catch(Exception e) {
          stop = true;
       }
     }
     restore(copy);
     return s;
   }


   /* This method returns the original Queue list state */
   public void restore(Queue q) {
      boolean stop = false;
      while(!stop) {
         try {
            this.enqueue(q.dequeue());
         }

         catch(Exception e) {
            stop = true;
         }
      }
   }

   /* This method finds the maximum element in the queue and returns it. */
   public Integer getMax() {                              
     Queue copy = new Queue();                        // create a Queue copy object
     boolean stop = false;                            // set boolean stop to false
     int max;
     try{
        max = this.dequeue();                         // set the first element dequeue to max
        copy.enqueue(max);                            // enqueue the max to Queue copy
     }
     catch (Exception e) {                            // catch if there's an exception
        return null;                                  // return null
     }

     while(!stop) {
       try {
          int num = this.dequeue();                   // store dequeue elemenet to num
          if(num > max)                               // if num > max : store the num to max
             max = num;
          copy.enqueue(num);                          // add the num to the Queue copy
       }

       catch(Exception e) {
         stop = true;
       }
     }
     restore(copy);                                   // call the method restore
     return max;                                      // return the max value
   }

   /* This method finds the minimum element in the queue and returns it. */
   public Integer getMin() {
      Queue copy = new Queue();                       // create a Queue copy object
      boolean stop = false;
      int min;                                        // declare min variable

      try{  
         min = this.dequeue();                        // set the first element dequeue to min
         copy.enqueue(min);                           // enqueue the min to Queue copy
      }
      catch (Exception e) {                           // catch if there's an exception
         return null;                                 // return null
      }

      while (!stop) {
         try {
            int num = this.dequeue();                 // dequeue from Queue and store to num
            if (num < min)                            // compare num less than min
               min = num;                             // set min equals to num
            copy.enqueue(num);                        // enqueue the num to Queue copy
         }

         catch (Exception e) {
            stop = true;
         }
      }

      restore(copy);                                  // restore the copy to Original Queue
      return min;                                     // return the min value          
   }

   public void reverseOrder() {
      Stack<Integer> stack = new Stack<Integer>();    // create a Stack object
      
      // transfer the Queue to Stack
      Boolean stop = false;
      while(!stop) {
         try {
            stack.push(this.dequeue());               // dequeue the element and push it to the stack
         }

         catch (Exception e) {
            stop = true;
         }
      }
      
      // transfer the Stack to Queue
      stop = false;
      while (!stop){
         try {
            this.enqueue(stack.pop());                // pop the stack and enqueue to the Queue object
         }

         catch (Exception e) {
            stop = true;
         }
      }
   }

   /* getAverage finds the average of all the elements in the queue. */
   public double getAverage() {
      int num;                                        // declare num to store the element dequeue
      int sum = 0;                                    // initialize sum to 0
      int count = 0;                                  // initialize count to 0
      Queue copy = new Queue();                       // create a Queue copy object

      Boolean stop = false;
      while(!stop) {
         try {
            num = this.dequeue();                     // store dequeue to num
            copy.enqueue(num);                        // enqueue the num to Queue copy
            sum += num;                               // add num to sum
            count++;                                  // add 1 to count
         }

         catch (Exception e) {
            stop = true;
         }
      }

      restore(copy);                                  // restore copy to the Original Queue
      return (double) sum/count;                      // return the average in double (sum / count)
   }
   
   /* isSorted returns true if the list is sorted and false otherwise */
   public boolean isSorted() {
      Queue queue = new Queue();                      // create a Queue copy object
      Boolean stop = false;
      Boolean sorted = true;
      
      int n1 = this.dequeue();                        // dequeue first element from Queue and set to n1

      while (!stop){
         try {
            int n2 = this.peek();                     // peek from the Queue and set to n2
            queue.enqueue(n1);                        // enqueue n1 to the queue
            if (n1 > n2)                              // compare n1 greater than n2
               sorted = false;                        // set sorted to false

            n1 = this.dequeue();                      // set n1 to next element
         }
         catch (Exception e) {                      // enqueue the last element
            stop = true;                              // set stop to true
         }
         finally {
            queue.enqueue(n1);  
         }
      }   
      
      restore(queue);                                 // restore queue to the Original Queue
      return sorted;                                  // retorn the boolean sorted
   }

   /* This method sort the elements in ascending order */
   public void sortingQueue() {
      Queue copy = new Queue();                       // create a Queue copy
      Queue temp = new Queue();                       // create a Queue temp
      
      Boolean stop = false;                           // initialize stop to false
      while(!stop) {
         try{
            int min = this.dequeue();                 // initialize min for first element in Queue
            
            Boolean secondstop = false;               // initialize secondstop to false
            while(!secondstop) {
               try {
                  int num = this.dequeue();           // initialize num from the Queue
                  if (num < min) {                    // compare num less than min
                     temp.enqueue(min);               // enqueue the min to Queue temp
                     min = num;                       // set num to min
                  }
                  else {
                     temp.enqueue(num);               // enqueue the num to Queue temp
                  }
               }
               catch (Exception e) {                  // call restore to restore the temp to Original Queue
                  secondstop = true;                  // set secondstop to true
               }
               finally {                       
                  copy.enqueue(min);                  // enqueue the final min to Queue copy
                  restore(temp);    
               }
            }
         }
         
         catch(Exception e) {                         // catch if the Queue out of bound
            stop = true;                              // set stop to true
         }
      }
      restore(copy);                                  // restore the copy to Original Queue
   }
}

class Driver
{
   public static void main(String[] args) {
      Queue m = new Queue();
      
      m.enqueue(10);
      m.enqueue(12);
      m.enqueue(15);
      m.enqueue(7);
      m.enqueue(100);
      m.enqueue(22);

      System.out.println("The queue is : " + m);
      m.reverseOrder();
      System.out.println("The queue in the reverse order is: "+ m);
      m.reverseOrder();
      System.out.println("Queue is back to its original state: " + m);
      System.out.printf("Average = %.2f\n", m.getAverage());
      System.out.println("Max = " + m.getMax());
      System.out.println("Min = " + m.getMin());
      System.out.println("The list is sorted: "+ m.isSorted());
   }
}

class yourDriver {
   public static void main(String[] args) {
      Queue m = new Queue();
      
      m.enqueue(2);
      m.enqueue(3);
      m.enqueue(1);
      m.enqueue(5);
      m.enqueue(7);
      m.enqueue(9);
      m.enqueue(6);
      m.enqueue(4);
      m.enqueue(8);

      System.out.println("The queue is : " + m);
      m.reverseOrder();
      System.out.println("The queue in the reverse order is: "+ m);
      m.reverseOrder();
      System.out.println("Queue is back to its original state: " + m);
      System.out.println("Is the list sorted? "+ m.isSorted());
      m.sortingQueue();
      System.out.println("Queue in Ascending order: " + m);
      System.out.println("Is the list sorted? "+ m.isSorted());
      
      System.out.printf("Average = %.2f\n", m.getAverage());
      System.out.println("Max = " + m.getMax());
      System.out.println("Min = " + m.getMin());
   }
}