package registerpack;
import java.util.ArrayList;
import java.util.Iterator;

import customer.Customer;

public class Register {
	static int i=0;
	static int index=0;
	public static Customer Arr[]=new Customer[50];
	//Customer customer = new Customer();
	
	public void register(String firstName,String middleName,String lastName,String address,String contact,String email,String proofType,String proofId) {
		Customer customer = new Customer();
		
		customer.setFirstName(firstName);
		customer.setMiddleName(middleName);
		customer.setLastName(lastName);
		customer.setAddress(address);
		customer.setEmail(email);
		customer.setContact(contact);
		customer.setProofType(proofType);
		customer.setProofID(proofId);
		i++;
		Arr[i]=customer;
		System.out.println("Thank you for Registering");
		System.out.println("Your details are:");
		//saveCusObj(customer);
		this.display(i);
	}
	

	public void display(int i) {
		System.out.println("Thank you for Registering Your details as follows:");
		System.out.println("Name: "+Arr[i].getFirstName()+" "+Arr[i].getMiddleName()+" "+Arr[i].getLastName());
		System.out.println("Address: "+Arr[i].getAddress());
		System.out.println("Email: "+Arr[i].getEmail());
		System.out.println("Contact: "+Arr[i].getContact());
		System.out.println("Proof Type: "+Arr[i].getProofType());
		System.out.println("Proof ID: "+Arr[i].getProofID());
		
	}
	
	static int cusId=0;
	static int cusArray[]=new int[100];
	public int customerId() {
	
		cusArray[cusId]=++cusId;
		Arr[i].setCustId(cusId);
		return cusId;
	}

	public void updateMail(int cusId2, String newMail) {
		
		Arr[cusId2].setEmail(newMail);
		
	}

	public void displayAll(int limit) {
		
		for(int index=1;index<=limit;index++) {
			System.out.println(index+" "+Arr[index].getFirstName()+"  "+Arr[index].getEmail());			
		}
		
	}
}

