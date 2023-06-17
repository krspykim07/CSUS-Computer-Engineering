/* Name:  Vigomar Kim Algador
   Title: EmailApp
   Date written: 21/02/2022
   Self-Grade: 100
   Program #04
   Description: This program shows the concept of Email using inheritance.
   */

import java.util.*;

public class EmailApp {

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

class CreateEmail {
   
   private String sender;
   private String recipient;
   private String subject;
   private String cc;
   private String content;

   public CreateEmail(Scanner scan){
      System.out.println("Enter the following:");
      System.out.print("SENDER: ");
      sender = scan.nextLine();
      System.out.print("RECIPIENT: ");
      recipient = scan.nextLine();
      System.out.print("CC: ");
      cc = scan.nextLine();
      System.out.print("SUBJECT: ");
      subject = scan.nextLine();
      System.out.print("MESSAGE: ");
      content = scan.nextLine();
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

   //getContent returns the instance variable content
   public String getContent(){
      return content;
   }
}

class EmailDriver {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      
      titlescreen();
      
      System.out.print("\nCreate a new mail? Y or N: ");
      boolean mailing = scan.next().contains("Y");
      scan.nextLine();
      System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
      while(mailing){
         
         CreateEmail newEmail = new CreateEmail(scan);
         Email mail = new Email(newEmail.getContent(), newEmail.getSender(), newEmail.getRecipient(), newEmail.getSubject(), newEmail.getCC());

         boolean modify = false;
         do{
            optionsEmail(scan,mail);
            System.out.print("\nAny more modifications? Y or N: ");
            modify = (scan.next()).contains("Y");
            scan.nextLine();
         }while(modify);

         System.out.print("Create a new mail? Y or N: ");
         mailing = scan.next().contains("Y");
         scan.nextLine();
         System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
      }

      System.out.println("THANKS FOR USING THE MAIL APP!");
   }

   public static void optionsEmail(Scanner scan, Email mail){
      System.out.println("\n     ======================= OPTIONS =============================");
      System.out.println("     (1) send the mail         (4) show mail");
      System.out.println("     (2) forward mail          (5) Get the length of the message");
      System.out.println("     (3) modify mail           (6) Search for a word in the message");
      System.out.println("     ==============================================================");
      System.out.print("\nPlease enter the number of option: ");
      int option = scan.nextInt();
      scan.nextLine();

      switch(option){
         case 1:
            System.out.println("Sent!");
            mail.send();
            break;
         case 2:
            System.out.print("Please enter recipient: ");
            String recipient = scan.nextLine();
            System.out.print("Please enter sender: ");
            String sender = scan.nextLine();
            System.out.print("Please enter cc: ");
            String cc = scan.nextLine();
            Email forward = mail.forward(recipient, sender, cc);
            System.out.println("\n==========FORWARDED MESSAGE==========\n" + forward + "\n");
            break;
         case 3:
            modificationEmail(scan, mail);
            break;
         case 4:
            displayEmail(scan, mail);
            break;
         case 5:
            System.out.println("The number of the letters in the email is: " + mail.getContentLength());
            break;
         case 6:
            System.out.print("Enter the keyword: ");
            String keyword = scan.nextLine();
            System.out.println();
            if(mail.contains(keyword))
               System.out.println("     The word " + keyword + " was found in the email");
            else
               System.out.println("     The word " + keyword + " wasn't found in the email");
            break;
         default:
            System.out.println("Your input is not in the option!");
            break;

      }
   }

   public static void modificationEmail(Scanner scan, Email mail){

      System.out.println("\n     ============== MODIFICATIONS ====================");
      System.out.println("     (1) change sender            (4) change cc");
      System.out.println("     (2) change recipient         (5) change message");
      System.out.println("     (3) change subject");
      System.out.println("     =================================================");
      System.out.print("\nPlease enter the number to modify: ");
      int modify = scan.nextInt();
      scan.nextLine();

      switch(modify){
         case 1:
            System.out.print("Please input new sender: ");
            String sender = scan.nextLine();
            mail.setSender(sender);
            break;
         case 2:
            System.out.print("Please input new recipient: ");
            String recipient = scan.nextLine();
            mail.setRecipient(recipient);
            break;
         case 3:
            System.out.print("Please input new subject: ");
            String subject = scan.nextLine();
            mail.setSubject(subject);
            break;
         case 4:
            System.out.print("Please input new cc: ");
            String cc = scan.nextLine();
            mail.setCC(cc);
            break;
         case 5:
            System.out.print("Please input new message: ");
            String message = scan.nextLine();
            mail.modifyContent(message);
            break;
         default:
            System.out.println("Your input is not in the option!");
            break;
      }
   }

   public static void displayEmail(Scanner scan, Email mail){

      System.out.println("\n     ============= DISPLAY OPTIONS =================");
      System.out.println("     (1) display mail             (5) display cc");
      System.out.println("     (2) display sender           (6) display date");
      System.out.println("     (3) display recepient        (7) display message");
      System.out.println("     (4) display subject");
      System.out.println("     =================================================");
      System.out.print("\nPlease enter the number to display: ");
      int display = scan.nextInt();
      System.out.println();

      switch(display){
         case 1:
            System.out.println("============CURRENT MAIL============\n          " + mail.toString());
            break;
         case 2:
            System.out.println("current sender: " + mail.getSender());
            break;
         case 3:
            System.out.println("current recepient: " + mail.getRecipient());
            break;
         case 4:
            System.out.println("current subject: " + mail.getSubject());
            break;
         case 5:
            System.out.println("current cc: " + mail.getCC());
            break;
         case 6:
            System.out.println("current date: " + mail.getDate());
            break;
         case 7:
            System.out.println("current message: \n          " + mail.getContent());
            break;
         default:
            System.out.println("Your input is not in the option!");
            break;
      }
   }

   public static void titlescreen(){
      System.out.println("====================================================");
      System.out.println("|                    EMAIL APP                     |");
      System.out.println("====================================================");
   }
}