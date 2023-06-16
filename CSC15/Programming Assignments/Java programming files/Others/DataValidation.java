import java.util.Scanner;
public class DataValidation
{
   public static void main(String[] args)
   {
     Scanner kb = new Scanner(System.in);
     int age = getAge(kb);
     System.out.println("Your gae is : "+ age);
   }
   public static int getAge(Scanner kb)
   {
     // System.out.print("Enter your age: ");
      int age = 0;//  kb.nextInt();
      while ( age <= 0   || age > 100) // 1 -100
      {
          System.out.print("Enter your age: ");
          age = kb.nextInt();
      }  
        
      return age;
   }

}