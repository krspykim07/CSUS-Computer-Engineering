/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: BookAppAlgador
   Date written: 03/31/2022
   Self-Grade: 100
   Program #06
   Description: 
   This program is an application to keep track of some book objects. The user lets to create a list of the Book objects 
   which features add, remove, and search books. More importantly, this program lets the user to sort books based on 
   certain criteria: Title, Author, and Author and Price. */

import java.util.*;
public class BookAppAlgador {

}

/* THIS CLASS SHOWS THE ATTRIBUTES AND BEHAVIOR OF A SINGLE BOOK */
class Book implements Comparable {
   // attributes
   private String title;
   private String author;
   private String ISBN;
   private double price;

   // constructor
   public Book(String title, String author, String ISBN,double price) {
      this.title = title;
      this.author = author;
      this.ISBN = ISBN;
      this.price = price;
   }

   public String getTitle() {
      return title;
   }

   public String getAuthor() {
      return author;
   }

   public String getISBN() {
      return ISBN;
   }

   public double getPrice() {
      return price;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public void setIsbn(String ISBN) {
      this.ISBN = ISBN;
   }

   public String toString() {
      return title+ ", " + author+", "+price+", "+ISBN;
   }

   public boolean equals(Book other) {
     return this.ISBN.equals(other.ISBN);
   }
   
   /* Compare two titles */
   public int compareTo(Book b) {
      return title.compareToIgnoreCase(b.title);
   }

   public int compareTo(String title) {
      return this.title.compareToIgnoreCase(title);
   }
   
   /* Compare two authors */
   public int compares(Book b) {
      return author.compareToIgnoreCase(b.author);
   }
   /* Compare two authors and price */
   public double compare(Book b) {
      if(this.author.equalsIgnoreCase(b.author))
         return this.price - b.price;
      else
         return author.compareToIgnoreCase(b.author);
   }
}

/* THIS CLASS SHOWS AN ARRAYLIST OF BOOKS */
class BookStore
{
   // attributes
   private ArrayList<Book> books;
   
   // constructor
   public BookStore() {
      books = new ArrayList<Book>();
   }
   
   // adds a new book to the arraylist
   public void add(String title, String author, double price, String isbn) {
      books.add(new Book(title, author,isbn, price));
   }

   public String toString() {
      String s = "";
      for(int i = 0; i < books.size(); i++)
      {
         s= s+ books.get(i).toString()+"\n";
      }
      return s;
   }
   
   // deletes a book from the arraylist using the isbn
   public boolean delete(String isbn) {
      for(int i = 0; i < books.size(); i++) {
         if (books.get(i).getISBN().equals(isbn)) {
            books.remove(i);
            return true;
         }
      }
      return false;
   }

   // Sorting the arraylist based on their title using selection sort
   public void selectionSort() {
      for(int i = 0; i < books.size(); i++) {
         int index = 0;
         boolean swap = false;
         Book min = books.get(i);
         for(int j = i+1; j < books.size(); j++) {
            if(books.get(j).compareTo(min) < 0){
               index = j;
               min = books.get(j);
               swap = true;
            }
         }
         
         if(swap) {
            Book temp = books.get(i);
            books.set(i, books.get(index));
            books.set(index, temp);
         }
      }
   }
   // Sorting the arraylist based on their author using insertion sort
   public  void insertionSort() {
      for(int i = 0; i < books.size()-1; i++){
         int j = i+1;
         Book next = books.get(j);
         while(j > 0 && next.compares(books.get(j-1)) < 0) {
            books.set(j, books.get(j-1));
            j--;
         }
         books.set(j,next);
      }
   }
   // Sorting the arraylist based on their author and price using bubble sort
   public void bubbleSort() {
      for(int i = 0; i < books.size(); i++){
         for(int j = 0; j < books.size()-1-i; j++){
            if(books.get(j+1).compare(books.get(j)) < 0) {
               Book temp = books.get(j);
               books.set(j, books.get(j+1));
               books.set(j+1, temp);
            }
         }
      }
   }
   
   // This method searches the title of the book in the arraylist
   public Book binarySearch(String title) {
      
      selectionSort();

      int first = 0;
      int last = books.size() - 1;
      int mid = (first + last) / 2;
      while (first <= last) {

         if (books.get(mid).getTitle().equalsIgnoreCase(title))
            return books.get(mid);

         if (books.get(mid).compareTo(title) < 0)
            first = mid + 1;
         else
            last = mid - 1;
         mid = (first + last) / 2;
      }

      return null;
   }
}
   
class Driver
{
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      BookStore myStore = new BookStore();
      myStore.add("Java","Zoie",23.56,"12345678");
      myStore.add("Python","Elina",23.56,"2");
    
      myStore.add("Advance Java","Stewart",98,"767676576");
      myStore.add("Build Java","Liang",45,"56786565y76");
      myStore.add("Zip lining", "Stewart",12,"1234566576");
      myStore.add("C++","Elina",23.56,"2645556");
      myStore.add("Programming Java","Stewart",124,"75465666");
      myStore.add("Humanity","Smith",100.56,"234545657");
      boolean b = true;
      while(b)
      {
         System.out.println("Enter 1 to sort based on the title");
         System.out.println("Enter 2 to sort based on the author");
         System.out.println("Enter 3 to sort based on the author, and the price");
         System.out.print("Enter your choice: ");
         int option = kb.nextInt();
         System.out.println("\n*************");
         if(option == 1)
         {
            System.out.println("Sorted based on the title\n");
            myStore.selectionSort();
         }
         else if (option == 2)
         {
            System.out.println("Sorted based on the author\n");
            myStore.insertionSort();
         } 
         
         else  
         {
            System.out.println("Sorted based on the author and price\n");
            myStore.bubbleSort();
         }   
         System.out.println(myStore);
         System.out.println("\n     **************     ");
         System.out.println("Enter the title of the book to search for it: ");
         kb.nextLine();
         String t = kb.nextLine();
         
         Book book = myStore.binarySearch(t);
         if(book != null)
            System.out.println(book);
         else
           System.out.println("Book not found");   
         System.out.println("\n");
            
      }  
   
   }
}
class YourDriver {
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      BookStore myStore = new BookStore();

      myStore.add("To Kill a Mocking Bird","Harper Lee",14.24,"83749276");
      myStore.add("The Diary of a Young Girl","Anne Frank",22.34,"58392657");
      myStore.add("Harry Potter and the Sorcerer's Stone","J.K. Rowling", 25.40,"38475928");
      myStore.add("Pride and Prejudice","Jane Austen",14.99,"38275947");
      myStore.add("The Da Vinci Code","Dan Brown",16.34,"93748562");
      myStore.add("Harry Potter and the Half-Blood Prince","J.K. Rowling",26.80,"59374859");

      boolean menu = true;
      while(menu) {
         System.out.println("==============================");
         System.out.println("Enter 1 to Sort the Book list");
         System.out.println("Enter 2 to Find a book");
         System.out.println("Enter 3 to Exit");
         System.out.println("==============================");
         System.out.print("Enter your choice: ");
         while(!scan.hasNextInt()){
            scan.nextLine();
            System.out.print("\nInvalid input!\nEnter your choice: ");
         }
         int menuoption = scan.nextInt();
         scan.nextLine();

         switch(menuoption){
            case 1:
               Sorting(scan, myStore);
               System.out.println(myStore);
               break;
            case 2:
               BookBinarySearch(scan, myStore);
               break;
            case 3:
               menu = false;
               break;
         }
      }
   }

   public static void Sorting(Scanner scan, BookStore myStore){
      boolean sorting = true;
      while(sorting)
      {
         System.out.println("\n==================================================");
         System.out.println("Enter 1 to sort based on the title");
         System.out.println("Enter 2 to sort based on the author");
         System.out.println("Enter 3 to sort based on the author, and the price");
         System.out.println("==================================================");
         System.out.print("Enter your choice: ");
         while (!scan.hasNextInt()){
            scan.nextLine();
            System.out.print("\nInvalid input!\nEnter your choice: ");
         }
         int option = scan.nextInt();
         scan.nextLine();
         System.out.println("\n**************************");

         switch(option){
            case 1:
               System.out.println("Sorted based on the title\n");
               myStore.selectionSort();
               sorting = false;
               break;
            case 2:
               System.out.println("Sorted based on the author\n");
               myStore.insertionSort();
               sorting = false;
               break;
            case 3:
               System.out.println("Sorted based on the author and price\n");
               myStore.bubbleSort();
               sorting = false;
               break;
         }
      }
   }

   public static void BookBinarySearch (Scanner scan, BookStore myStore) {
      
      System.out.println("\nEnter the title of the book to search for it: ");
      System.out.println("==================================================");
      System.out.print("Search: ");
      String search = scan.nextLine();
      System.out.println();
      Book book = myStore.binarySearch(search);
      if(book != null)
         System.out.println(book);
      else
         System.out.println("Book not found");   
      System.out.println("\n");
   }

}