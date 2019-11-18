package main;
import java.io.IOException;
import booking.Booking;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Booking book = new Booking();
		while(true) {
			book.getDetails();
		}
		
	}
}
