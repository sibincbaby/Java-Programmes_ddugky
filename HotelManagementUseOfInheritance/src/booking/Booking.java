package booking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booking {
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(int total_Days) {
		this.totalDays = total_Days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	int persons;
	int totalDays;
	double tariff;
	String roomType;
	
	///////////////////////////
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void getDetails() throws NumberFormatException, IOException {
		System.out.println("   ****Booking*****");
		System.out.println("Enter the number of persons");
		setPersons(Integer.parseInt(br.readLine()));
		System.out.println("Enter the total number of days");
		setTotalDays(persons=Integer.parseInt(br.readLine()));
		System.out.println("Enter the tariff per day");
		setTariff(Double.parseDouble(br.readLine()));
		System.out.println("Enter the room type(Ac/nAc");
		setRoomType(br.readLine());
		System.out.println("Enter the month");
		PeakSeason book = new PeakSeason();
		LeanSeason book2 = new LeanSeason();
		book.setMonth(Integer.parseInt(br.readLine()));
		///////////////////
		String season=null;
		switch(book.getMonth()) {
		case 4:
		case 5:
		case 6:
		case 9:
		case 11:
		case 12:season="peak";
		break;
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 10:
		season="lean";
		break;
		default: System.out.println("The month is not a valid one,Enter the details again!!");
		getDetails();
		}
		
		//////////////////
		//if((book.getMonth()==4) ||(book.getMonth()==5)||(book.getMonth()==6)||(book.getMonth()==9)||(book.getMonth()==11)||(book.getMonth()==12)){
			if(season.equals("peak")) {
				System.out.println("  **Peak Season**");
			System.out.println("Enter the Peak Charges");
			book.setPeakCharges(Integer.parseInt(br.readLine()));
			
			
			double charge=book.roomBooking(getPersons(), getTotalDays(), getTariff(), getRoomType(),book.getMonth(),book.getPeakCharges());
			System.out.println("Total amount to pay is Rs. "+charge);
		}
		
		//else if((book.getMonth()==1)||(book.getMonth()==2)|| (book.getMonth()==3) || (book.getMonth()==7) || (book.getMonth()==8) ||(book.getMonth()==9)|| (book.getMonth()==10)){
		else if(season.equals("lean")) {
			System.out.println("  **Lean Season**");
			System.out.println("Enter the Discount");
			book2.setDiscount(Integer.parseInt(br.readLine()));
			double charge=book2.roomBooking(getPersons(), getTotalDays(), getTariff(), getRoomType(),book.getMonth(),book2.getDiscount());
			System.out.println("Total amount to pay is Rs. "+charge);
	}
		
	}
	
	public  double roomBooking(int persons, int totalDays, double tariff, String roomType) {
		//System.out.println("Parent Class method");
		double normalCharge=persons*totalDays*tariff;
		return normalCharge;
	}
	

}
