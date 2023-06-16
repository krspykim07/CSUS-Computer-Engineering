/* Name:   Vigomar Kim Algador
   Course: CSC-15
   Title: PayrollShellAlgador
   Date written: 12/12/2021
   Self-Grade: 100
   DESCRIPTION:
    This program shows an information about employee for working hours and working rates.
  MAIN REQUIREMENT:
    * Use of Objects and Classes
    * Use of access modifiers           */

public class PayrollShell {

}

class Payroll {
  
  //Payroll class attributes
  private String name, ID;
  private double hourlyrate, hoursworked;

  //Payroll class construction
  public Payroll(String I, String N, double rate, double hours){
    name = N;
    ID = I;
    hourlyrate = rate;
    hoursworked = hours;
  }

  //Changes in attributes method
  public void setName(String newName){
    name = newName;
  }
  public void setId(String newID){
    ID = newID;
  }
  public void setHours(double newHours){
    hoursworked = newHours;
  }
  public void setRate(double newHourlyRate){
    hourlyrate = newHourlyRate;
  }

  //accessors method
  public String getId(){
    return ID;
  }
  public String getName(){
    return name;
  }
  public double getRate(){
    return hourlyrate;
  }
  public double hourseWorked(){
    return hoursworked;
  }

  //display the attributes method
  public String toString(){
    String words = "Name : " + name + "\n";
    words = words + "ID = " + ID + "\n";
    words = words + "Hourly rate = " + hourlyrate + "\n";
    words = words + "Hours worked = " + hoursworked;
    return words;
  }

  //calculation pay method
  public double pay(){
    return hourlyrate * hoursworked;
  }
}

class PayrollDriver
{
  public static void main(String[] args)
  {
    //creating an array for employee information
    Payroll[] employee = new Payroll[3];

    //storing each individual elements into employee array
    employee[0] = new Payroll("1234","Alex",12,12);
    employee[1] = new Payroll("9807", "Nik",10,20);
    employee[2] = new Payroll("2345","Jose", 100, 20);
    
    //call the method toString to display the information for the object p1, p2, p3
    System.out.println("Testing the toString method\n");
    for(int i = 0; i < 3; i++){
      System.out.println(employee[i].toString());
      System.out.println("***********************");
    }
    
    //calling getName and pay methods for each object
    System.out.println("testing the getter methods and the pay method\n");
    for(int i = 0; i < 3; i++){
      System.out.println(employee[i].getName() + " is paid " + employee[i].pay());
    }
    
    //calling setHours method on object employee[0] to set the hours to 25
    System.out.println("testing the setter methods\n");
    System.out.println("Setting the hours worked for Alex to 25");
    employee[0].setHours(25);
    
    //print the object info on the screen by calling the toString method
    System.out.println(employee[0].toString());   
    System.out.println("\n" + employee[0].getName() + " is now paid " + employee[0].pay());
    
    //calling the setRate method on object employee[1]
    System.out.println("setting the hourly rate for Nik to 45");
    employee[1].setRate(45);
    
    //call the toString method to display the info for the object employee[1] on the screen
    System.out.println(employee[1].toString());
    System.out.println("\n" + employee[1].getName() + " is now paid " + employee[1].pay());
  }
}