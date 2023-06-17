/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: GroceryAlgador
   Date written: 03/18/2022
   Self-Grade: 100
   Program #07
   Description: 
   This program is about an app to keep track of your groceries that you need to purchase. The information that you 
   should keep track of each Item are the food, the price, and the expiration date of the food. In this 
   app we want to create a dynamic list therefore LinkList must be used. */

import java.util.*;

public class GroceryAlgador {
} 

/* CLASS FOR EACH ITEM FOOD */
class Item implements Comparable <Object> {
	//instance variable
   private String food;
   private double price;
   private String expDate;
   
   //constructor
   public Item (String food, double price, String expDate) {
      this.food = food;
      this.price = price;
      this.expDate = expDate;
   }
   
   public String getFood() {
      return food;
   }

   public void setFood(String food) {
      this.food = food;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public String getExpDate() {
      return expDate;
   }

   public void setExpDate(String expDate) {
      this.expDate = expDate;
   }
   
   public boolean equals(Item other) {
      //compare two objects of food and price
      return this.food.equalsIgnoreCase(other.food) && (this.price == other.price);
   }
	
   //compare two items based on the instance variable food
   public int compareTo(Object obj) {

      if(this.food.equals(((Item) obj).food))     //compare two food
         return 1;
      return 0;
   }

   public String toString(){
      return "\nFood: " + food + "\nPrice: " + price + "\nExpiration Date: " + expDate + "\n";
   }
}

/* CLASS ON CREATING LISTNODE */
class ListNode {
	private Item productItem;
   private ListNode next;

   public ListNode() {
   }

   public ListNode(Item productItem) {
      if(productItem instanceof Item)
         this.productItem = productItem;
   }

   public ListNode(Item productItem, ListNode next) {
      if(productItem instanceof Item) {
         this.productItem = productItem;
         this.next = next;
      }
   }

   public Item getItem() {
      return productItem;
   }

   public ListNode getNext() {
      return next;
   }

   public void setNext(ListNode next) {
      this.next = next;
   }
	
}

interface List{
   public void add(String food, double price, String expDate);
   public void add(int index, String food, double price, String expDate);
   public int indexOf(String food);
   public void remove(String food);
   public int size();
   public String toString();
   public Item get(int index);
   public Item mostExpensive();
}

/* CLASS FOR WHOLE GROCERY LIST */
class GroceryList implements List{
	private ListNode head;
   public static int size = 0;

   // constructor
   public GroceryList () {
      head = null;   //initialize ListNode head as empty node
   }

   /* ADD AN ITEM TO THE LIST AT THE END */
   public void add(String food, double price, String expDate) {
   	
      Item newItem = new Item(food, price, expDate);

      // checking the first node
      if(head == null) {
         head = new ListNode(newItem);   // put the new ListNode to the head
         size++;     //increment size
         return;     //exit the method
      }

      // creating a copy of the ListNode head to checkList
      ListNode checkList = head;

      // checking each node if its empty
      while(checkList.getNext() != null)
         checkList = checkList.getNext();    //move to the next node
      
      // add the newItem at the end of checkList
      checkList.setNext(new ListNode(newItem));
      size++;     //increment size
   }

   /* ADD AN ITEM TO THE LIST WITH THE GIVEN INDEX */
   public void add(int index, String food, double price, String expDate) {
      
      Item newItem = new Item(food, price, expDate);

      // check if the input index > listnode size
      if(index > size) {
         System.out.println("Invalid index");
         return;
      }
      
      // creating a copy of the ListNode head to checkList
      ListNode checkList = head;

      int i = 0;
      // check each node if its empty and i < index - 1
      while(checkList.getNext() != null && i < index-1) {
         // move to the next node
         checkList = checkList.getNext();
         i++;     //increment i
      }

      // creating a node addItemList with the newItem
      ListNode addItemList = new ListNode(newItem);

      // point the addItemList node to the next current checkList
      addItemList.setNext(checkList.getNext());
      // point the current checkList to the addItemList
      checkList.setNext(addItemList);
      size++;
   	
   }

   /* THIS METHOD SEARCH THE INDEX OF THE FOOD */
   public int indexOf(String food) {
      
      if(head == null)     //if the list is empty
         return -1;
      
      // creating a copy of the listnode head
      ListNode checkList = head;
      
      int index = 0;       // initialize index
      // check for each node till empty and index < size
      while(checkList!= null && index < size) {
         // check if the current checkList food is same as the food the user looking for
         if(checkList.getItem().getFood().equalsIgnoreCase(food)) 
            return index;     //return the index (position of the food in the list)
         // move to the next node
         checkList = checkList.getNext();
         index++;  //increment index
      }  
      return -1;
   }

   /* THIS METHOD REMOVES AN ITEM IN THE LIST */
   public void remove(String food) {
      
   	if(head == null) {     // if the list is empty
         System.out.println("The list is empty\n");
         return;
      }
      
      // check the first node matches the food to remove
      if(head.getItem().getFood().equalsIgnoreCase(food)) {
         head = head.getNext();
         size--;           // decrement size
         return;
      }
      
      // create a copy of ListNode head to checkList and preCheckList
      ListNode checkList = head;
      ListNode preCheckList = head;
      // check for each node till empty and check the current checkList food is not the same as the food user looking for
      while (checkList != null && !checkList.getItem().getFood().equalsIgnoreCase(food)){
         preCheckList = checkList;              // assign current checkList node to the preCheckList
         checkList = checkList.getNext();       // move to the next node
      }

      // check current checklist if its the end
      if(checkList == null) {
         System.out.println("The item is not in the list.");
         return;
      }

      // connect the preCheckList to the next checkList (indication removing the checkList node)
      preCheckList.setNext(checkList.getNext());
      size--;     // decrement size
      System.out.println(food +" has been removed from the list.\n");
   	
   }

   /* THIS METHOD RETURNS THE SIZE OF THE GROCERY LIST */
   public int size() {
   	return size;
   }

   /* THIS METHOD GRABS THE ITEM GIVEN THE POSITION */
   public Item get(int position) {
      
      // checking the head if its empty 
      // or searching position is beyond the size of the list
      if(head == null || position > size)
         return null;

      //make a copy of the head of the list
      ListNode checkList = head;

      // check each node till empty and the index matches the position
      for (int index = 0; checkList != null && position != index; index++) {
         checkList = checkList.getNext();    // move to the next node
      }

      if(checkList == null)   
         return null;
      
      // return the item
      return checkList.getItem(); 
   }

   /* THIS METHOD SEARCH FOR THE MOST EXPENSIVE ITEM */
   public Item mostExpensive() {
   	if(this.head == null)
          return null;
      
      // create a copy of listnode
      ListNode checkList = head;

      // store the first Item to expensive
      Item expensive = checkList.getItem();

      // checking each node
      while(checkList!= null) {
         
         // check the current node > expensive item variable
         if(checkList.getItem().getPrice() > expensive.getPrice())
            // change expensive to the current checkList node
            expensive = checkList.getItem();
         // move to the next node
         checkList = checkList.getNext();
      }

      //return the expensive
      return expensive;
   }

   /* THIS METHOD RETURNS THE WHOLE LIST INFORMATION */
   public String toString() {
     if(head == null)  //checking to see if the list is empty
        return "EMPTY GROCERY LIST";
     ListNode checkList = head; // making a copy of the front node
     String itemString = "";

     //traverse through the list all the way to the end
     while(checkList != null)
     {
        itemString += checkList.getItem().toString();
        checkList = checkList.getNext();
     }   
     return itemString;
   }
	
}

class Driver {
	public static void main(String []args) {
		GroceryList list = new GroceryList();
		
		list.add("Bread", 5.99, "3/20/2022");
		list.add("Milk", 3.99, "2/1/2002");
		list.add("Chips", 2.99, "12/30/2025");
		list.add("Rice", 35.50, "8/15/2030");
		
		System.out.println("Here is the list of food items");
		System.out.println(list);
		
		System.out.println("Here is the most expensive item on the list");
		System.out.println(list.mostExpensive());
		
		System.out.println("Removing Milk from the list and adding a new expensive item on the list in the 2nd node");
		list.remove("Milk");
		list.add(1, "Truffle", 800, "4/20/2050");
		System.out.println(list);
		
		System.out.println("Testing the mostExpensive method to see what is the most expensive item now");
		System.out.println(list.mostExpensive());
		
		System.out.println("Testing the get method to get the item at the 3rd node");
		System.out.println(list.get(2));
		
	}
}
 
class MyDriver {
   public static void main(String[] args) {
      GroceryList list = new GroceryList();
      Scanner scan = new Scanner(System.in);
      
      description();    // output the welcome description
      boolean modify = true;
		
		do{
         optionWindow();
         System.out.print("Please enter the number of option: ");
		   while(!scan.hasNextInt()){			//checking the input data type is integer
			   scan.nextLine();			      //flush the input data
			   System.out.print("\nPlease enter the number of option: ");
		   }

         int option = scan.nextInt();
         scan.nextLine();

         // check if option = 8 indicating exit
         if(option == 8) 
            modify = false;   // change modify to fase
         else{
            modification(scan, list, option);   // call modification
         }

		}while (modify);

      exit();
   }

   public static void modification(Scanner scan, GroceryList list, int option) {
		
      int index;
      Item checkItem;

		System.out.println("================================================================================");
      
      switch(option) {
         case 1:        // show the full grocery list
            System.out.println("Here is the list of food items");
            System.out.println(list);
            break;
         case 2:        // add an item to the list
            addItem(scan, list);
            break;
         case 3:        // remove an item from the list
            System.out.print("Enter the item to remove: ");
            list.remove(scan.nextLine());
            break;
         case 4:        // searching an item using the index
            System.out.print("Enter the index for item to search: ");
            // data validation
            while(!scan.hasNextInt()){			//checking the input data type is integer
               scan.nextLine();			      //flush the input data
               System.out.print("\nInvalid input!\nEnter the index for item to search: ");
            }
            index = scan.nextInt();
            scan.nextLine();
            
            checkItem = list.get(index);
            if(checkItem == null)
               System.out.println("invalid index\n");
            else
               System.out.println(checkItem);
            break;
         case 5:        // show the grocery list size
            System.out.println("You have " + list.size() + " items in your Grocery list");
            break;
         case 6:        // show the most expensive item from the list
            System.out.println("The most expensive item:");
            System.out.println(list.mostExpensive());
            break;
         case 7:        // search for the position of the item
            System.out.print("Enter the item name: ");
            String food = scan.nextLine();
            index = list.indexOf(food);
            if(index == -1)
               System.out.println("The item is not in the list\n");
            else
               System.out.println("The item is in index " + index);
            break;
         default:	      //outputs the message for wrong input
				System.out.println("Your input is not in the option!");
				break;
      }
      System.out.print("\nPress any to continue: ");
      scan.nextLine();
   }

   /* THIS METHOD INPUTS INFORMATION AND CALL THE ADD METHOD FROM THE GROCERYLIST CLASS */
   public static void addItem(Scanner scan, GroceryList list){

      // options whether add item at the end or given index
      System.out.println("ADDING OPTIONS: ");
      System.out.println("    (1) add item at the end of the list");
      System.out.println("    (2) add item with given index to the list");
      System.out.print("option: ");

      // data validation
      while(!scan.hasNextInt()){			//checking the input data type is integer
			scan.nextLine();			      //flush the input data
         System.out.println("wrong option!");
			System.out.print("enter option again: ");
		}
      int option = scan.nextInt();
      	scan.nextLine();

      // input the requested information
      System.out.println("================================================================================");
      System.out.print("Item name: ");
      String food = scan.nextLine();
      System.out.print("price: ");
      double price = scan.nextDouble();
      scan.nextLine();
      System.out.print("Expiration date (MM/DD/YYYY): ");
      String ExpDate = scan.nextLine();
      
      switch(option){
         case 1:     // adding the item to the end of the list
            list.add(food, price, ExpDate);
            break;
         case 2:     // adding the item to the given index
            System.out.print("index: ");
            int index = scan.nextInt();
            list.add(index, food, price, ExpDate);
            break;
         default:     // default wrong input
            System.out.println("WRONG INPUT!");
            break;
      }
   }
   //this method outputs the introduction message
	public static void description() {
		System.out.println("====================================================");
		System.out.println("|               CSC20 GROCERY APP                  |");
		System.out.println("====================================================");
	}

   public static void optionWindow() {
      System.out.println("\n=========================== GROCERY APP LIST =================================");
		System.out.println("(1) Show Grocery List                       (5) Show the Grocery List size      ");
		System.out.println("(2) Add an item to the List                 (6) Search for most expensive item  ");
		System.out.println("(3) remove item from the List               (7) Search the position of the item ");
		System.out.println("(4) search with item number from the list   (8) Exit                            ");
		System.out.println("================================================================================");
   }

	//this method outputs the exit message
	public static void exit() {
		System.out.println("====================================================");
		System.out.println("|       Thanks for using CSC20 GROCERY APP!        |");
		System.out.println("====================================================");
	}
}