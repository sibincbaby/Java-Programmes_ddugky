
package bookingpack;
import customer.Customer;
import registerpack.Register;
import room.Room;

public class Booking extends Register {
	int totalCharge;
	//Room room = new Room();
	static int i2=0;
	static Room ArrBook[]=new Room[50];
	public void booking(String ac,String cot,String cable,String wifi,String laundry,int date) {
		Room room = new Room();
		room.setAc(ac);
		room.setCot(cot);
		room.setCable(cable);
		room.setWifi(wifi);
		room.setLaundry(laundry);
		room.setDate(date);
		
		ArrBook[++i2]=room;
		
		
		//
		System.out.println("End of booking function");
		this.book(i2);
		//
	
		
		
		
		System.out.println("Thank you for Booking");
		System.out.println("Your details are:");
		this.bookingDisplay();
	}
	
	public void book(int i2) {
		if(ArrBook[i2].getAc().equalsIgnoreCase("AC"))
			ArrBook[i2].setAcFee(1000);
			else if(ArrBook[i2].getAc().equalsIgnoreCase("nAC"))
				ArrBook[i2].setAcFee(750);
		if(ArrBook[i2].getCot().equalsIgnoreCase("Single"))
			ArrBook[i2].setCot("Single");
		else if(ArrBook[i2].getCot().equalsIgnoreCase("Double"))
			ArrBook[i2].setCotFee(350);
		if(ArrBook[i2].getCable().equalsIgnoreCase("C")) {
			ArrBook[i2].setCableFee(50);
			ArrBook[i2].setCable("Cable connection enabled");
		}
		else if(ArrBook[i2].getCable().equalsIgnoreCase("nC")){
			ArrBook[i2].setCableFee(0);
			ArrBook[i2].setCable("Cable connection Not enabled");
	}
		if(ArrBook[i2].getWifi().equalsIgnoreCase("W")) {
			ArrBook[i2].setWifiFee(200);
			ArrBook[i2].setWifi("Wi-Fi enabled");
		}
		else if(ArrBook[i2].getWifi().equalsIgnoreCase("nW")){
			ArrBook[i2].setWifiFee(0);
			ArrBook[i2].setWifi("Wi-Fi Not enabled");
		}
		if(ArrBook[i2].getLaundry().equalsIgnoreCase("L")) {
			ArrBook[i2].setLaundryFee(100);
			ArrBook[i2].setLaundry("with laundry service");
		}
		else if(ArrBook[i2].getLaundry().equalsIgnoreCase("nL")){
			ArrBook[i2].setLaundryFee(0);
			ArrBook[i2].setLaundry("without laundry service");
		}
		totalCharge=ArrBook[i2].getAcFee()+ArrBook[i2].getCotFee()+ArrBook[i2].getCableFee()+ArrBook[i2].getWifiFee()+ArrBook[i2].getLaundryFee();
		
		System.out.println("End of book function");
			
			System.out.println("End of book function");
		
		
	}
	
	
	private void bookingDisplay() {
		System.out.println("The total charge is Rs. "+ totalCharge +"\nThe services choosen are");
		System.out.println(ArrBook[i2].getCot()+" cot "+ArrBook[i2].getAc()+" room");
		System.out.println(ArrBook[i2].getCable());
		System.out.println(ArrBook[i2].getWifi());
		System.out.println(ArrBook[i2].getLaundry());
		System.out.println("On date "+ArrBook[i2].getDate());
		System.out.println("Total Amount payable Rs."+totalCharge);
		
		System.out.println("End of bookingDisplay");
	}
static int bookedRoom[] = new int[25];
static int bookedCust[] = new int[25];
static int bookedDate[] = new int[25];
static int roomno=0;	
int booked[]= new int[25];
	
	static int index3=0;
	public int confirmBook(int date,int custId2,String name) {
		roomno++;
		ArrBook[i2].setRoomNum(roomno);
		ArrBook[i2].setCustId(custId2);
		ArrBook[i2].setFirstName(name);
		booked[roomno]=1;
		bookedRoom[index3]=roomno;
		bookedDate[index3]=date;
		bookedCust[index3]=i2;
		
		index3++;
		
		return roomno;
	}
///check status method	
public boolean CheckStatus(int roomID) {
		//if(ArrBook[roomID].getRoomNum()==roomID) {
		if(booked[roomID]==1) {
	     return true;
		}
		
		else {
			//System.out.println(ArrBook[roomID].getRoomNum());
			return false;
			
		}
	}

public void findBookings2(int startDate, int endDate) {
	int index=1;
	System.out.println("Date  Room No.  Customer ID        Name");
	do {
		
	if((ArrBook[index].getDate()>=startDate)&&(ArrBook[index].getDate()<=endDate)) {
		//System.out.println("Hellotest inside");
		System.out.println("  "+ArrBook[index].getDate()+"     "+ArrBook[index].getRoomNum()+"           "+ArrBook[index].getCustId()+"           "+ArrBook[index].getFirstName());
	}index++;
	}while(index<=index3);
}
	
}
