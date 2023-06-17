/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: PayrollAlgador
   Date written: 02/14/2022
   Self-Grade: 100
   DESCRIPTION:
    This program shows an information about employee for working hours and working rates.
  MAIN REQUIREMENT:
    * Use of Objects and Classes
    * Use of access modifiers
    * Additional: Use of arrays           */

public class PayrollAlgador{

}

class Payroll
{
  //list of the instance variables
  private String name, id;
  private double hourlyRate, hoursWorked;

  //constructor
  public Payroll(String name, String id, double hourlyRate, double hoursWorked){
    this.name = name;
    this.id = id;
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  //getter methods
  public String getName(){
    return name;
  }
  public String getId(){
    return id;
  }
  public double getHourlyRate(){
    return hourlyRate;
  }
  public double getHoursWorked(){
    return hoursWorked;
  }

  //setter/mutator method
  public void setName(String name){
    this.name = name;
  }
  public void setHourlyRate(double hourlyRate){
    this.hourlyRate = hourlyRate;
  }
  public void setHoursWorked(double hoursWorked){
    this.hoursWorked = hoursWorked;
  }
  public double getPay(){
    return hourlyRate * hoursWorked;
  }

  //toString method
  public String toString(){
    String words = "Name: " + name + "\n";
    words = words + "ID: " + id + "\n";
    words = words + "Hours worked: " + hoursWorked + "\n";
    words = words + "Hourly rate: " + hourlyRate;
    return words;
  }

}

class PayrollDriver
{
  public static void main(String[] args)
  {
    System.out.println("Creating payroll objects");

    //creating employee object array
    Payroll[] employee = new Payroll[5];

    employee[0] = new Payroll("Alex Martinez" ,"123456", 25, 20);
    employee[1] = new Payroll("Ali Santos" ,"986747", 125, 45);
    employee[2] = new Payroll(" Jose Busta" ,"45678", 55, 30);

    //testing toString: output the each employee information and their salary
    System.out.println("testing the toString method");
    System.out.println("List of the employees\n");
    for(int i = 0; i < 3; i++){
      System.out.println(employee[i]);
      System.out.println("Salary is : " + employee[i].getPay());
      System.out.println("\n***********************");
    }

    //testing setter method: use first employee to change hours worked
    System.out.println("\nTesting the setter methods");
    System.out.println("The hourly pay of " + employee[0].getName()  + " is being changed");
    employee[0].setHoursWorked(80);  // changing the hours worked for the object p1
    System.out.println(employee[0].toString());
    System.out.println("\n***********************");       
    
    //***********************************************************************************
    
    //1. create two objects of the payroll class
    employee[3] = new Payroll("Kim Algador" ,"246810", 15, 20);
    employee[4] = new Payroll("Mark Vergas" ,"873946", 20, 30);
    
    //2. displaying the employee information and their salary
    System.out.println("New employee information:\n");
    for(int i = 3; i <= 4; i++){
      System.out.println(employee[i]);
      System.out.println("Salary is : " + employee[i].getPay());
      System.out.println("\n***********************");
    }
    
    //changing the hourlyRate of the objects you created
    System.out.println("setting the hourly rate for Kim to 20\n");
    employee[3].setHourlyRate(20);
    System.out.println("setting the hourly rate for Mark to 25\n");
    employee[4].setHourlyRate(25);
    System.out.println("***********************");

    //display the objects again to see the changes you made by calling the toString method
    for(int i = 3; i <= 4; i++){
      System.out.println(employee[i]);
      System.out.println("Salary is : " + employee[i].getPay());
      System.out.println("\n***********************");
    }

    //change the hoursworked for the objects you created by calling the setter methods
    System.out.println("setting the hours worked for Kim to 30\n");
    employee[3].setHoursWorked(30);
    System.out.println("setting the hours worked for Mark to 25\n");
    employee[4].setHoursWorked(25);
    System.out.println("***********************");

    //display your objects again to see the changes you made
    for(int i = 3; i <= 4; i++){
      System.out.println(employee[i]);
      System.out.println("Salary is : " + employee[i].getPay());
      System.out.println("\n***********************");
    }
  }
}