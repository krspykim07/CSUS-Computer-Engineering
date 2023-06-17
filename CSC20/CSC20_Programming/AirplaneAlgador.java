/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: AirplaneAlgador
   Date written: 03/05/2022
   Self-Grade: 100
   Program #04
   Description: 
   This program helps to keep track of the list of the passengers in each plane.
   They also want to be able to do the following to list of the passengers:
	•	Display the information of all the passengers in the plane
	•	Delete a passenger from the list in a plane
	•	Add a passenger to the list of the plane if the plane hasn’t taken off
	•	Count the number of the passengers in the plane
	•	Search the list of the passengers to find a particular person in the plane
	•	display the last name of all the passengers
	
	A passenger has the following attributes 
	•	first name
	•	Last name
	•	Ticket ID
	•	Seat number 
	•	class (first class, business class, premium economy, economy) 
	
	Plane
	•	A plane has a list of the passengers.  Therefore, plane class does not extend the passenger class */

import java.util.*;

public class AirplaneAlgador {

}

class Person { //Parent-class Person

	private String name;
	private String last;
	private String ticketID;

	public Person (String name, String last, String ticketID) {
		this.name = name;
		this.last = last;
		this.ticketID = ticketID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}

	public String getName() {
		return name;
	}

	public String getLast() {
		return last;
	}

	public String getTicketID() {
		return ticketID;
	}

	public String toString() {
		String message = "Name: " + name + "\n" +
				"Last: " + last + "\n" +
				"TicketID: " + ticketID + "\n";
		return message;
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}

class Passenger extends Person {	//child class - Passenger
	private int seatNumber;
	private String classType;

	public Passenger (String first, String last, String ticketID, int seatNumber, String classType) {
		super(first, last, ticketID);
		this.seatNumber = seatNumber;
		this.classType = classType;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public String getClassType() {
		return classType;
	}

	public String toString() {
		String message = super.toString();
		message += "Seat number: " + seatNumber + "\n" +
				"Class: " + classType + "\n";
		return message;
	}

}

interface list {   
		public boolean add(Object obj);
		public Object search(Object obj);
		public boolean delete(Object obj);
		public void printLast();
		public void takeOff();
	}

class Airplane implements list{
	
	//attributes
	public static int count = 0;
	private Passenger[] plane;		// array of passengers in the plane
	private boolean takenOff;		// determine whether the plane left

	//constructor
	public Airplane (int planeSize) {
		plane = new Passenger[planeSize];
		takenOff = false;
	}
	
	// This method helps to add passenger in the array
	public boolean add(Object obj) {
		
		// check if the obj is a Passenger and the plane hasn't taken off
		if(obj instanceof Passenger && !takenOff) {
			plane[count] = (Passenger) obj;		// add the passenger in the array
			count++;							// increment count shows a passenger was added
			return true;
		}
		return false;
	}

	public Object search(Object obj) {
		
		// check the obj if its a String type
		if(!(obj instanceof String)) 
			return null;
		
		String name = (String) obj;

		// check for each passenger in the array
		for(int i = 0; i < plane.length; i++)
		{
			// check if the certain object is not empty and the name matches the search
			if(plane[i]!= null && plane[i].getLast().equalsIgnoreCase(name))
				return plane[i];   //returning the found object
		}
		return null;
	}

	// This method looks for the passenger in the list and deletes it
	public boolean delete(Object obj) {
		
		// check the obj if its a String type
		if(!(obj instanceof String)) 
			return false;
		
		String name = (String) obj;

		for(int i = 0; i < plane.length; i++) {
			if(plane[i]!= null && plane[i].getLast().equalsIgnoreCase(name)) {
				plane[i] = null;
				count--;
				return true;   //returning the found object
			}
		}

		return false;
	}

	// This method outputs the last name of every passenger
	public void printLast() {
		for (int i = 0; i < plane.length; i++) {
			if(plane[i] != null)
				System.out.println(plane[i].getLast());
		}
	}

	// This method set the takenOff variable to true indicating the plane taken off
	public void takeOff() {
		takenOff = true;
	}

	// This method returns the number of passengers in the plane
	public int getCount(){
		return count;
	}

	public String toString() {
		String message = "";
		for(int i = 0; i < plane.length; i++) {
			if(plane[i] != null)
				message += plane[i].toString() + "\n";
		}
		return message;
	}
}
	
class Driver {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		Airplane plane = new Airplane(20394);
		Passenger p1 = new Passenger("Bobby", "Smith", "123456789", 1, "First class");
		Passenger p2 = new Passenger("Johnny", "Apple", "987654321", 8, "Business class");
		Passenger p3 = new Passenger("Tom", "Jerry", "567123489", 32, "Economy class");
		Passenger p4 = new Passenger("Candy", "Cruz", "982134567", 15, "Premium Economy class");
		Passenger p5 = new Passenger("Kaloti", "Aaron", "762134589", 5, "First class");
		
		plane.add(p1);
		plane.add(p2);
		plane.add(p3);
		plane.add(p4);
		plane.takeOff();
		plane.add(p5);
		
		System.out.println("Here is the list of the passengers in this plane");
		System.out.println(plane + "\n");
		
		 System.out.println("Testing the printLast method to display the last names");
		   plane.printLast(); //prints the last name of the passenger sin the train
		   System.out.println();
		   
		   System.out.println("Testing the static method getCount");
		   System.out.println("This plane has " + plane.getCount() + " Passengers\n");
		   
		   System.out.print("Enter the last name of the passenger: ");
		   String lastName = scan.nextLine();
		   System.out.println(plane.search(lastName));
		   System.out.println();
		   
		   System.out.println("Testing the delete method");
		   System.out.print("Enter the last name of the passenger: ");
		   String last = scan.nextLine();
		   plane.delete(last);
		   System.out.println("Passenger " + last + " has been removed from the list\n");
		   
		   System.out.println("Here is the updated list");
		   System.out.println(plane);
		
	}
}


class MyDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		Airplane Plane2 = new Airplane(10);

		Passenger mom = new Passenger("Mary","Thomas","027583",5,"First class");
		Passenger dad = new Passenger("James","Thomas","027584",6,"First class");
		Passenger sister = new Passenger("Lily","Thomas","027585",7,"First class");
		Passenger brother = new Passenger("Matthew","Thomas","027586",8,"First class");
		Passenger uncle = new Passenger("Lucas","Thomas","027587",9,"First class");

		Plane2.add(mom);
		Plane2.add(dad);
		Plane2.add(sister);
		Plane2.add(brother);
		Plane2.add(uncle);

		System.out.println("Here is the list of the passengers in this plane");
		System.out.println(Plane2 + "\n");

		System.out.print("Enter the last name of the passenger you want to search: ");
		String lastName = scan.nextLine();
		System.out.println(Plane2.search(lastName));
		System.out.println();

		System.out.print("Enter the last name of the passenger you want to remove: ");
		String last = scan.nextLine();
		Plane2.delete(last);
		System.out.println("Passenger " + last + " has been removed from the list\n");

		System.out.println("Here is the updated list");
		System.out.println(Plane2);
		
		Plane2.takeOff();

		Passenger aunt = new Passenger("Anny","Thomas","027582",10,"First class");
		Plane2.add(aunt);
	}
}