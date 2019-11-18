package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import bookingpack.Booking;
import customer.Customer;
import registerpack.Register;
public class Main {

	static int id=0;
	static String firstName;
	public static void main(String[] args) throws IOException {
		//Customer[] customer = new Customer[100];
		//String firstName;
		//ArrayList<String> cars = new ArrayList<String>();
		String middleName;
		String lastName;
		String address;
		String contact;
		String email;
		String proofType;
		String proofId;
		String choice;
		int check2=0;
		//For booking
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int date=0;
		int startDate=0;
		int endDate=0;
		Register register = new Register();
		Booking booking = new Booking();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Reading inputs
		while(true) {
			System.out.println("Enter your choice \n1)Registration\n2)Booking\n3)Check Status\n4)Email Updation\n5)All Bookings\n6)All Customers\n7)Exit ");
		
		choice=br.readLine();
	switch(choice) {
	
	case "1":
		System.out.println("Enter your first name");
		firstName=br.readLine();
		System.out.println("Enter your middle name");
		middleName=br.readLine();
		System.out.println("Enter your last name");
		lastName=br.readLine();
		System.out.println("Enter your address");
		address=br.readLine();
		System.out.println("Enter your email");
		email=br.readLine();
		System.out.println("Enter your contact number");
		contact=br.readLine();
		System.out.println("Enter your proof type");
		proofType=br.readLine();
		System.out.println("Enter your proof ID");
		proofId=br.readLine();
		
		
		
		register.register(firstName, middleName, lastName,address, contact, email,proofType,proofId);
		System.out.println("And your customer ID is :");
		id=register.customerId();
		System.out.println(id);
		System.out.println("Do you want to book room");
		String ch1 =br.readLine();
		if(ch1.equalsIgnoreCase("yes")) {
			check2++;
			}
		else if(ch1.equalsIgnoreCase("no")) {
			
			check2++;
		break;
		}
		
	case "2":
		if(check2==0) {
			System.out.println("Please Register before Booking!!\nSelect option 1 from the menu to register you as a customer");
			break;
		}
		else {
		System.out.println("Booking:\r\n" + "Please choose the services required.\r\n" + "AC/non-AC(AC/nAC)\r\n" + "");
		ac=br.readLine();
		System.out.println("Cot(Single/Double)");
		cot=br.readLine();
		System.out.println("With cable connection/without cable connection(C/nC)");
		cable=br.readLine();
		System.out.println("Wi-Fi needed or not(W/nW)");
		wifi=br.readLine();
		System.out.println("Laundry service needed or not(L/nL)");
		laundry=br.readLine();
		System.out.println("Enter date");
		date=Integer.parseInt(br.readLine());
		booking.booking(ac,cot,cable,wifi,laundry,date);
		System.out.println("Do you want to proceed with booking");
		String ch2 =br.readLine();
		if(ch2.equalsIgnoreCase("yes")) {
			System.out.println("helloTest2");
	      System.out.println("Thankyou for booking room number : "+booking.confirmBook(date,id,firstName)+" with your customer id "+id);		
		}
		else if(ch2.equalsIgnoreCase("no")) {
			
			
		}
		check2=0;	
		}
		break;
		
	case "3":
	
		System.out.println("Check Status:\nEnter room number");
		int roomnum = Integer.parseInt(br.readLine());
		boolean check=booking.CheckStatus(roomnum);
		if(check)
			System.out.println("Room number "+roomnum+" is booked.");
		else
			System.out.println("Room number "+roomnum+" is free to book.");
		break;
		
		
	case "4":
		System.out.println("Enter the customer ID");
		int cusId=Integer.parseInt(br.readLine());
		System.out.println("Enter the new Email ID");
		String newMail=br.readLine();
		register.updateMail(cusId,newMail);
		System.out.println("New Email ID updated");
		break;
		
	case"5":
		
		System.out.println("Enter the start date");
		startDate=Integer.parseInt(br.readLine());
		System.out.println("Enter the end date");
		endDate=Integer.parseInt(br.readLine());
		System.out.println("Your bookings for the given dates are:");
		booking.findBookings2(startDate,endDate);
		break;
		
	case"6":register.displayAll(id);
		
		
		
		break;
		
	case"7":
		System.exit(0);
		
		default:System.out.println("Enter a valid choice");
	
	
	
	}
		}
		
		
	}
}
