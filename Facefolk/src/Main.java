
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	//static int roomno=0;
	public static void main(String[] args) throws IOException {
		String i,i2;
		
		
		//////////For User Registration////////////
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		//////////For Booking Rooms//////////////
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		String date;

		
		Booking customer = new Booking();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			
		//Reading Reg Customer/////	
		System.out.println("Enter the customer name");
		name=br.readLine();
		System.out.println("Address?");
		address=br.readLine();
		System.out.println("Contact number?");
		contactNumber=br.readLine();
		System.out.println("Email?");
		email=br.readLine();
		System.out.println("Proof type?");
		proofType=br.readLine();
		System.out.println("Proof ID?");
		proofID=br.readLine();
		
		
		Register obj1 = new Register();
		obj1.register(name,address,contactNumber,email,proofType,proofID);
		obj1.display();
		System.out.println("Do you want to continue (yes/no)");
		 i=br.readLine();
		 }while(i.equals("yes"));
/////////////////////////////////////////////////////////////////////////////////////////
		
		if(i.equals("no")) {
			
			while(true) {
			System.out.println("Menu");
			System.out.println("1. Book\n2. Check Status\n3. Exit");
			System.out.println("Enter your choice");
			int ch = Integer.parseInt(br.readLine());
			
			
		switch(ch) {
		
			case 1:{
				do {
				//Reading Booking preference/////
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
				System.out.println("Enter which date you need to book(DD-MM-YYYY)");
				date=br.readLine();
				
				//Booking customer = new Booking();
				customer.book(ac,cot,cable,wifi,laundry,date);
				customer.bookdisplay();
				//customer.roomnum();
				System.out.println("Do you want to proceed (yes/no)");
			i2=br.readLine();	
			}while(i2.equals("no"));
				if(i2.equals("yes")) {
				System.out.println("Thankyou for booking.Your room number is"+customer.roomnum());

			}
			break;
			}
			case 2 :{
				System.out.println("Check Status:\nEnter room number");
				int roomnum = Integer.parseInt(br.readLine());
				boolean check=customer.CheckStatus(roomnum);
				if(check)
					System.out.println("Room number "+roomnum+" is booked.");
				else
					System.out.println("Room number "+roomnum+" is not booked.");
				break;
			}
			case 3 :{
				System.exit(0);
				break;
		}
		}
		}
		
	}
	}

}
