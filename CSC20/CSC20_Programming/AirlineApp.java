/* Name:   Vigomar Kim Algador
   Course: CSC-20
   Title: AirplaneAlgador
   Date written: 03/04/2022
   Self-Grade: 100
   Program #05
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

public class AirlineApp {

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

class Passenger extends Person {
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
		public boolean add(Object o);
		public Object search(Object o);
		public boolean delete(Object o);
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

	public void printLast() {
		for (int i = 0; i < plane.length; i++) {
			if(plane[i] != null)
				System.out.println(plane[i].getLast());
		}
	}

	public void takeOff() {
		takenOff = true;
	}

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
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		description();

		System.out.print("Enter the plane's capacity: ");
		Airplane plane = new Airplane(scan.nextInt());
		boolean modify;
		
		do{
			modification(scan,plane);
			System.out.print("\n more options? Y or N: ");
			modify = scan.next().contains("Y");
			scan.nextLine();
		}while (modify);

		exit();
	}

	// this method helps to add a new passenger
	public static Passenger checkin(Scanner scan) {

		System.out.println("Enter the information:");
      	System.out.print("FIRST NAME: ");
      	String name = scan.nextLine();
		System.out.print("LAST NAME: ");
		String lastname = scan.nextLine();
		System.out.print("TICKET ID: ");
		String ticketID = scan.nextLine();
		System.out.print("SEAT #: ");
		int seatNumber = scan.nextInt();
		scan.nextLine();
		System.out.print("CLASS TYPE: ");
		String classType = scan.nextLine();
			
		Passenger travelPassenger = new Passenger (name,lastname,ticketID,seatNumber,classType);
		return travelPassenger;
	}

	// this method helps the user to choose options for the program
	public static void modification(Scanner scan, Airplane plane) {
		System.out.println("\n======================== PASSENGER OPTIONS =============================");
		System.out.println("(1) Show list passenger                (5) Show number of passengers     ");
		System.out.println("(2) Check in passenger                 (6) Show all last name");
		System.out.println("(3) search passenger                   (7) take off plane");
		System.out.println("(4) delete passenger  ");
		System.out.println("=========================================================================");
		

		System.out.print("\nPlease enter the number of option: ");
		while(!scan.hasNextInt()){			//checking the input data type is integer
			scan.nextLine();			//flush the input data
			System.out.print("\nPlease enter the number of option: ");
		}
		
		int option = scan.nextInt();
      	scan.nextLine();
		
		System.out.println("=========================================================================");

		switch(option){		//switch option
			case 1:		//showing the list all passengers
				System.out.println("Here is the list of the passengers in this plane");
				System.out.println(plane);
				break;
			case 2:		//adding a new passenger on the plane
				Passenger travelPassenger = (Passenger) checkin(scan);
				boolean accepting = plane.add(travelPassenger);
				if(accepting){		//outputs message that the passenger have been added
					System.out.println( "\nPassenger " + travelPassenger.getName() + " has been added!");
				}
				else{		//outputs message that the passenger cannot be added and the plane took off
					System.out.println( "\nThe plane took off");
					System.out.println( "Passenger " + travelPassenger.getName() + " cannot be added!");
				}
				break;
			case 3:		//search for specific passenger
				System.out.print("Enter the last name of the passenger: ");
				String lastName = scan.nextLine();
				Object searchPass = plane.search(lastName);
				if(searchPass != null){
					System.out.println(searchPass);
				}
				else{
					System.out.println("The last name " + lastName + " cannot find in the plane");
				}
				System.out.println();
				break;
			case 4:		//deletes a passenger in the plane
				System.out.print("Enter the last name of the passenger: ");
				String last = scan.nextLine();
				boolean deleting = plane.delete(last);
				if(deleting){		//outputs message that the passenger has been removed from the list
					System.out.println( "Passenger " + last + " has been removed from the list!");
				}
				else{		//outputs message that the passenger cannot be removed from the list
					System.out.println( "Passenger " + last + " cannot find in the plane and cannot be removed");
				}
				break;
			case 5:		//show the number of passengers
				System.out.println("This plane has " + plane.getCount() + " Passengers\n");
				break;
			case 6:		//show all of the passenger's last name
				System.out.println("Here is the list of the last name of the passengers:");
				plane.printLast();
				break;
			case 7:		//set the plane take off
				plane.takeOff();
				System.out.println("The plane successfully taken off!");
				break;
			default:	//outputs the message for wrong input
				System.out.println("Your input is not in the option!");
				break;
		}
	}

	//this method outputs the introduction message
	public static void description() {
		System.out.println("====================================================");
		System.out.println("|                  CSC20 AIRLINES                  |");
		System.out.println("====================================================");
	}

	//this method outputs the exit message
	public static void exit() {
		System.out.println("====================================================");
		System.out.println("|      Thanks for using CSC20 AIRLINES APP!        |");
		System.out.println("====================================================");
	}
}
