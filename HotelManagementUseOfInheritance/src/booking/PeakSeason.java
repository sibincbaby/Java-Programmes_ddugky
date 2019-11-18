package booking;

import java.io.IOException;

public class PeakSeason extends Booking{
	private int month;
	private int peakCharges;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getPeakCharges() {
		return peakCharges;
	}
	public void setPeakCharges(int peakCharges) {
		this.peakCharges = peakCharges;
	}
	
///////////////////////////
	
public  double roomBooking(int persons, int totalDays, double tariff, String roomType,int month,int peakCharges) throws NumberFormatException, IOException {
	
		double normalCharge=super.roomBooking(persons, totalDays, tariff, roomType);
		double totalChargePeak=normalCharge*this.getPeakCharges();
		return totalChargePeak;
	}
}
