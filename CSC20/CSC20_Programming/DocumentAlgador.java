/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: DocumentAlgador
   Date written: 21/02/2022
   Self-Grade: 100
   Program #04
   Description: This program shows the concept of Email using inheritance.
   */

import java.util.*;
public class DocumentAlgador {

}

//superclass Document
class Document {
   private String content;


   //constructor
   public Document(String text){
      content = text;
   }

   //getContent returns the instance variable content
   public String getContent(){
      return content;
   }

   //seContent changes the instance variable content to the newContent
   public void setContent(String newContent){
      content = newContent;
   }

   //toString creates a String represent an object of Document and returns it
   public String toString(){
      return content;
   }

   //getContentLength returns the length of the content
   public int getContentLength(){
      return content.length();
   }

   //contains method checks the content if it has the keyword in it
   public boolean contains(String keyword){
      return content.contains(keyword);
   }

   //equals method compares two objects of type Document.
   public boolean equals(Document other){
      return this.content.equalsIgnoreCase(other.content);
   }

}

//subclass Email
class Email extends Document {
   private String sender;
   private String recipient;
   private Date date;
   private String subject;
   private String cc;
   private boolean isSent;

   //constructor
   public Email(String text, String sender, String recipient, String subject, String cc){
      
      super(text);   //calling the constructor from super class Document
      this.sender = sender;
      this.recipient = recipient;
      this.subject = subject;
      this.cc = cc;
      date = new Date();
   }
   
   //send method set the instance variable isSent to true showing that the email has been sent successfully
   public void send(){
      isSent = true;
   }

   //getSent returns the instance variable isSent
   public boolean getSent(){
      return isSent;
   }

   //getSender returns the instance variable sender
   public String getSender(){
      return sender;
   }

   //getRecipient returns the instance variable recipient
   public String getRecipient(){
      return recipient;
   }

   //getSubject returns the instance variable subject
   public String getSubject(){
      return subject;
   }

   //getCC returns the instance variable cc
   public String getCC(){
      return cc;
   }

   //getDate returns the instance variable getDate
   public Date getDate(){
      return date;
   }

   //setSender changes the instance variable sender to a new sender
   public void setSender(String sender){

      //checks if the email already sent by checking the instance variable isSent
      if(isSent == false)
         this.sender = sender; //condition when the email haven't sent yet allowing the user to change the sender
      else
         System.out.println("This email has been sent and the sender cannot be changed.");  //condition when the email already sent showing prompt to user can't modify the sender
   }

   //setRecipient changes the instance variable recipient to a new recipient
   public void setRecipient(String recipient){

      //checks if the email already sent by checking the instance variable isSent
      if(isSent == false)
         this.recipient = recipient; //condition when the email haven't sent yet allowing the user to change the recipient
      else
         System.out.println("This email has been sent and the recipient cannot be changed."); //condition when the email already sent showing prompt to user can't modify the recipient
   }

   //setSubject changes the instance variable subject to a new subject
   public void setSubject(String subject){
      
      //checks if the email already sent by checking the instance variable isSent
      if(isSent == false) 
         this.subject = subject; //condition when the email haven't sent yet allowing the user to change the subject
      else
         System.out.println("This email has been sent and the subject cannot be changed."); //condition when the email already sent showing prompt to user can't modify the subject
   }
   
   //setCC changes the instance variable cc to a new cc
   public void setCC(String cc){
      
      //checks if the email already sent by checking the instance variable isSent
      if(isSent == false)
         this.cc = cc;  //condition when the email haven't sent yet allowing the user to change the subject
      else
         System.out.println("This email has been sent and the cc cannot be changed."); //condition when the email already sent showing prompt to user can't modify the cc
   }
   
   //toString creates a String represent the Email object and returns it
   public String toString(){
      String message = "";
      message = "Sender: " + sender + "\n" +
               "Recipient: " + recipient + "\n" +
               "CC: " + cc + "\n" +
               "Subject: " + subject + "\n" +
               "Date: " + date + "\n" +
               "Content: " + super.toString();
      return message;
   }

   //modifyContent changes the instance variable content from the super class to a new content (newText)
   public void modifyContent(String newText){
     
      //checks if the email already sent by checking the instance variable isSent
      if(isSent == false)
         super.setContent(newText); //condition when the email haven't sent yet allowing the user to change the content calling it in super class Document
      else
         System.out.println("This email has been sent and cannot be modified."); //condition when the email already sent showing prompt to user can't modify the content
   }

   //forward method makes an email forward that was created previously sent to the new recipient and cc
   public Email forward(String recipient, String sender, String cc){
      
      //create a new Email object named frwd
      Email frwd = new Email(super.getContent(), sender, recipient, this.subject, cc);
      frwd.date = new Date();    //create a new Date object
      frwd.isSent = true;
      return frwd;
   }

}

class EmailDriver {

   public static void main(String[] args) {
      
      //creating an Email object
      Email e1 = new Email("Hello everyone, we will have a meeting tomorrow at 10", "Gita Faroughi","Alex","Meeting","");
       //sending the email
       e1.send();
       
       //disply the details about the email
       System.out.println(e1);
       System.out.println("\n\n");
       
       //searching the email for the email for the word tomorrow
       boolean b = e1.contains("tomorrow");
       if(b)
         System.out.println("The word tomorrow was found in the email");
       else
          System.out.println("The word tomorrow wasn't found in the email"); 
           
      
       //displaying just the content(text) of the email
       System.out.println("\nThe content of this email is: " + e1.getContent());
       System.out.println();
       //modifying the content of the email
       e1.modifyContent("bye");
       
       //changing the recipient of the e1 email
       e1.setRecipient("Jose@yahoo.com,Mary@gmail.com");
       System.out.println();
       
       //forwarding the email
       Email forward = e1.forward("Alex", "Gita" ,"Maria");
       System.out.println();
       
      //printing the forwarded email 
      System.out.println("forwarded message\n"+ forward);
      System.out.println();
      
      //display the length of the text in the email
      System.out.println("The number of the letters in the email is: " + e1.getContentLength()); 

      //***********************************************************************
      //your turn, refer to the provided documentt on the codes you need to write

      System.out.println("\n\n");

      //creating a second Email object
      Email e2 = new Email("Good day! Professor Gita Faroughi needs your homework assignment to be done by February 27", "Kim Algador","Alex","Homework D-Day","Gita Faroughi");

      //changing the recipient of the e1 email
      e2.setRecipient("Alex@csus.edu");
      System.out.println();

      //modifying the content of the email
      e2.modifyContent("Good day! Professor Gita Faroughi needs your homework assignment to be done by February 27 before 11:59pm");

      //display the length of the text in the second email
      System.out.println("The number of the letters in the email is: " + e2.getContentLength());
      System.out.println(); 
      
      //searching the second email for the email for the word February 27
      b = e2.contains("February 27");
      if(b)
        System.out.println("The word February 27 was found in the email\n");
      else
         System.out.println("The word February 27 wasn't found in the email\n"); 

      //sending the second email
      e2.send();
      
      //disply the details about the second email
      System.out.println(e2);
      System.out.println("\n\n");
   }
}