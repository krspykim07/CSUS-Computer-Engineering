/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: InstaAlgador
   Date written: 03/07/2022
   Self-Grade: 100
   Program #06
   Description: 
   Create a social media app to connect people.  Your social media app allows you to create a list of the 
   people you can follow. Also, you can follow your followers if you want to. The functionality for this app is 
   somewhat similar to the Instagram app. Here is the list I have created. Feel free to be creative by adding 
   more functionalities. 
   + Add a follower
   + Unfollow someone
   + Follow someone
   + Search the list of followers
   + Update followers
   + List all the followers
   + Display the number of the followers
   + Display the number of the people following      */

import java.util.*;
public class InstaAlgador {

}

class User implements Comparable {
   //attributes
   private String first;
   private String last;
   private String username;
   private boolean followBack;
     
   //constructor
   public User(String first, String last, String username, boolean followBack){
      this.first = first;
      this.last = last;
      this.username = username;
      this.followBack = followBack;
   }
   
   //getter methods
   public String getFirst() {
      return first;
   }
   public String getLast() {
      return last;
   }
   public String getUsername() {
      return username;
   }
   public boolean getFollow() {
      return followBack;
   }

   //setter methods
   public void setFirst(String first) {
      this.first = first;
   }
   public void setLast(String last) {
      this.last = last;
   }
   public void setUsername(String username) {
       this.username = username;
   }
   
   //unfollow method sets the followBack to false
   public void unfollow() {
      followBack = false;
   }
   //follow method sets the followBack to true
   public void  follow() {
      followBack = true;
   }
   
   public String toString() {
      String message = "";
      message += "Username: " + username + "\n"
            + "Name: " + first + "\n"
            + "Last name: " + last;
      if(followBack)
         message += " \"You follow back this person\"";
      else
         message += " \"You are not following this person\"";

      return message;  
   }

   // compares the two users based on their username.
   public int compareTo(Object o) {
      User obj = (User) o;
      return this.username.compareTo(obj.username);
   }
   
   // compares the first and the last name of the object this, with the first and last name of the object other.
   public boolean equals(User other) {
      return this.first.equalsIgnoreCase(other.first) && 
            this.last.equalsIgnoreCase(other.last);            //compare first and last and return the answer
   }
}

class SocialMedia{
   // attributes
   private ArrayList<User> app;
   
   //constructor
   public SocialMedia(){
      app = new ArrayList<User>();
       
   }

   // looks for the match first and last name in the array and follow it
   public void followBack(String first, String last)
   {
       String account = first + " " + last;     //initialize string account with first and last

       for(int i = 0; i < app.size(); i++) {      // loop for the app array
          String accounttemp = app.get(i).getFirst() + " " + app.get(i).getLast();  //initialize string accounttemp to the current first and last in array

          if(account.equalsIgnoreCase(accounttemp))   //compare the two string variables
             app.get(i).follow();         //call the follow to set true the followback
       }
   }

   // gets the User information and check the User in the array if it matches meaning its already in the list
   public boolean follow(String first, String last, String username, boolean followBack) {
      
      User newFollow = new User(first, last, username, followBack);     //initialize User object newFollow

      for(int i = 0; i < app.size(); i++) {     // loop for the app array

         if(newFollow.getUsername().equalsIgnoreCase(app.get(i).getUsername()))   //compare and check the usernames
            return false;
      }

      int index;
      for (index = 0; index < app.size(); index++) {  // loop for the app array
         if(newFollow.compareTo(app.get(index)) < 0)   // call the compareTo method
            break;  //break the loop indicate the right index
      }
      app.add(index,newFollow);  //add the newFollow in designated index
      return true;
   }
   
   /* This method removes the person from the list */
   public boolean remove(String first, String last ) {
      
      String account = first + " " + last;      //initialize string account with first and last

       for(int i = 0; i < app.size(); i++) {    // loop for the app array
          String accounttemp = app.get(i).getFirst() + " " + app.get(i).getLast();     //initialize string accounttemp to the current first and last in array

          if(account.equalsIgnoreCase(accounttemp)) {    //compare the two string variables
             app.remove(i);               //remove the user in the array
             return true;
          }
       }
      return false;
   }
           
   /* searching the first and last name of the follower in the list */
   public boolean search(String first, String last) {
      
      String account = first + " " + last;     //initialize string account with first and last

      for(int i = 0; i < app.size(); i++) {     // loop for the app array
          String accounttemp = app.get(i).getFirst() + " " + app.get(i).getLast();  //initialize string accounttemp to the current first and last in array

          if(account.equalsIgnoreCase(accounttemp))    //compare the two string variables
            return true;      //return true indicate the seach matched
      }
      
      return false;
   }
   
   // grabs the app array
   public ArrayList<User> getList() {
      return app;    //return the app arraylist
   }

   // grabs the app array size
   public int followerCounts() {
      return app.size();
   }

   // counts the number of following in the list
   public int followingCounts() {
      int count = 0;       //initialize count to 0

      for(int i = 0; i < app.size(); i++) {        //loop for the array
         if(app.get(i).getFollow() == true)        //call the getFollow and compare it if its true
           count++;           //add in count
      }
      return count;        //return count
   }

   // returns a string representing all the followers in the list. A for loop is needed to go through the list. 
   public String toString() { 
      
      String message = "";

      for(int i = 0; i < app.size(); i++){
         message += app.get(i).toString() + "\n";
         message += "*********************************************************\n";
      }
      return message;
   }
}

class MyDriver {
   public static void main(String[] args)
   {
      SocialMedia myInsta = new SocialMedia();

      myInsta.follow("Kim", "Chan", "Chan_Kim", false);
      myInsta.follow("Tom", "Cruise",  "cruisingTom", true); 
      myInsta.follow("Scarlet", "Johanson",  "scarletRed", true); 
      myInsta.follow("Bill", "Gates", "microsoftWin11",false);
      myInsta.follow("Mark", "Zuck", "metaversing10", false);

      /*Displaying your followers*/
      System.out.println("Your followers informations\n");
      System.out.println(myInsta);

      System.out.println("Searching for Elon Musk in your followers list");
      if(myInsta.search("Elon", "Musk") == false)
         System.out.println("Elon Musk is not in your list of followers");
      else
         System.out.println("Elon Musk is in your list of followers");
      
      /*Removing a follower*/
      System.out.println("Removing Kim Chan from your followers list");
      myInsta.remove("Kim", "chan");

      /*Displaying your followers*/
      System.out.println("Your followers informations\n");
      System.out.println(myInsta);

      Scanner kb = new Scanner(System.in);
      
      System.out.println("Enter the first and  last name from the list bellow that you want to follow back: ");
      String first =kb.next();
      String last = kb.next();
      myInsta.followBack(first,last);
      
      System.out.println(myInsta);

   }
}

class Driver{
   public static void main(String[]args) {
      SocialMedia myInsta = new SocialMedia();
      
    	/*Adding followers to your list*/
      /*the boolean field indicates whether you want to follow them back*/
      myInsta.follow("Matthew", "Philips", "MatPhil", true);
      myInsta.follow("Gary", "Kane",  "GKane", false); 
      myInsta.follow("Robert", "Kenny",  "RKenny", true); 
      myInsta.follow("Bill", "Fitch", "BillF",true);
      myInsta.follow("Trevor", "Schlulz", "TrevorS", false);
      
    	/*Displaying your followers*/
      System.out.println("Your followers informations\n");
      System.out.println(myInsta);
    	
      /*Unfollowing a user*/
      System.out.println("Removing Robert Kenny from your followers list");
      myInsta.remove("Robert", "Kenny");
   	
      /*Displaying the list*/
      System.out.println("List of followers after removing Robert Kenny");
      System.out.println(myInsta);
   	
      /*adding a new follower*/
      System.out.println("Adding Elon Musk to your list of followers");
      myInsta.follow("Elon", "Musk", "ElonM", true);
      
      /*Dipslying the followers*/
      System.out.println("List of your followers:");
      System.out.println(myInsta);
   	
      /*Searching for a follower*/
      System.out.println("Searching for Stonewall Jackson(StonW) in your followers list");
      if(myInsta.search("Jackson", "Stonewall") == false)
         System.out.println("Stonewall Jackson is not in your list of followers");
      
      System.out.println("\n***************************");   
      System.out.println("You are following " + myInsta.followerCounts() + " people");
      
      System.out.println("You have " + myInsta.followingCounts() + " followers");  
      System.out.println(myInsta);

      Scanner kb = new Scanner(System.in);
      
      System.out.println("Enter the first and  last name from the list bellow that you want to follow back: ");
      String first =kb.next();
      String last = kb.next();
      myInsta.followBack(first,last);
      
      System.out.println(myInsta);
   	
   }
}