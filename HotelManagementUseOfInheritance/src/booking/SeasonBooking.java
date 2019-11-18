package booking;

public class SeasonBooking extends Booking{
	
public  double roomBooking(int persons, int totalDays, double tariff, String roomType) {
	System.out.println("Child Class method");
		
		//return super.roomBooking(persons, totalDays, tariff, roomType);
	return tariff;
		
		
	}

}
