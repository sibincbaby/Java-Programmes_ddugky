
public class Booking {
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	String date;
	static int roomno=0;
	
	int acFee;
	int cotFee;
	int cableFee;
	int wifiFee;
	int laundryFee;
	int totalCharge;

	void book(String ac, String cot, String cable, String wifi, String laundry, String date) {
		this.ac=ac;
		this.cot=cot;
		this.cable=cable;
		this.wifi=wifi;
		this.laundry=laundry;
		this.date=date;
	
		if(ac.equalsIgnoreCase("AC"))
		acFee=1000;
		else if(ac.equalsIgnoreCase("nAC"))
			acFee=750;
		if(cot.equalsIgnoreCase("Single"))
			cotFee=0;
		else if(cot.equalsIgnoreCase("Double"))
			cotFee=350;
		if(cable.equalsIgnoreCase("C")) {
			cableFee=50;
			this.cable="Cable connection enabled";
		}
		else if(cable.equalsIgnoreCase("nC")){
			cableFee=0;
		this.cable="Cable connection Not enabled";
	}
		if(wifi.equalsIgnoreCase("W")) {
			wifiFee=200;
			this.wifi="Wi-Fi enabled";
		}
		else if(wifi.equalsIgnoreCase("nW")){
			wifiFee=0;
			this.wifi="Wi-Fi Not enabled";
		}
		if(laundry.equalsIgnoreCase("L")) {
			laundryFee=100;
		this.laundry="with laundry service";
		}
		else if(laundry.equalsIgnoreCase("nL")){
			laundryFee=0;
			this.laundry="without laundry service";
		}
		totalCharge=acFee+cotFee+cableFee+wifiFee+laundryFee;
	
	}

	void bookdisplay() {
		System.out.println("The total charge is Rs. "+ totalCharge +"\nThe services choosen are");
		System.out.println(cot+" cot"+ac+" room");
		System.out.println(cable);
		System.out.println(wifi);
		System.out.println(laundry);
		//System.out.println(date);
		System.out.println(totalCharge);
		
	
	}
	int booked[]= new int[25];
	
	int i;
	int roomnum() {
		roomno++;
			booked[roomno]=1;
		return roomno;
	}
	boolean CheckStatus(int roomID) {
	
		if(booked[roomID]==1) {
	     return true;
		}
		else
			return false;
	}
}
