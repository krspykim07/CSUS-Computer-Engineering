
import java.util.*;

class Index{
    private String name;
    private double weight, height;
    
    public Index(String n, double w, double h){
        name = n;
        weight = w;
        height = h;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setWeight(double newWeight){
        weight = newWeight;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }
    
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }

    public String toString(){
        String words = "Name : " + name + "\n";
        words = words + "Weight = " + weight + "\n";
        words = words + "Height = " + height;
        return words;
    }

    public double bodyMassCalculator(){
        return weight / (height*height);
    }
}

public class BMI {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        //creating an array for person information
        
        String name;
        double weight, height;

        //storing each individual elements into employee array
        System.out.print("Please input a name: ");
        name = scan.nextLine();
        System.out.print("Please input weight in kg: ");
        weight = scan.nextDouble();
        System.out.print("Please input height in meters: ");
        height = scan.nextDouble();
        Index person = new Index(name,weight,height);
        
        System.out.println("\n**********************************");
        System.out.println("Here is your full information: ");
        System.out.println(person.toString());
        System.out.println("\nYour Body Mass Index is: " + person.bodyMassCalculator());
        System.out.println("**********************************");
        
        System.out.print("\nDo you want to change something? (yes or no): ");
        while(scan.next().equals("yes")){

            System.out.println("Choose which to change: weight or height");
            switch(scan.next()){
                case "weight":
                    System.out.print("Enter the weight: ");
                    person.setWeight(scan.nextDouble());
                    break;
                case "height": 
                    System.out.print("Enter the height: ");
                    person.setHeight(scan.nextDouble());
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }

            System.out.println("\n**********************************");
            System.out.println("Here is your full information: ");
            System.out.println(person.toString());
            System.out.println("\nYour Body Mass Index is: " + person.bodyMassCalculator());
            System.out.println("**********************************");
            System.out.print("\nDo you want to change something? (yes or no): ");
        }

        System.out.println("\nThank you! Hope to see you again!");
    }
}