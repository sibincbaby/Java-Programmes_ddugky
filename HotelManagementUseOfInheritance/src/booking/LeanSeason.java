package booking;

import java.io.IOException;

public class LeanSeason extends Booking{

	private int discount;

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	//////////////////
	
	public  double roomBooking(int persons, int totalDays, double tariff, String roomType,int month,int discount) throws NumberFormatException, IOException {

		double normalCharge=super.roomBooking(persons, totalDays, tariff, roomType);
		double discountAmount = normalCharge*(discount/100.0);
		double totalChargeLean=normalCharge-discountAmount;
		return totalChargeLean;
	}
}
