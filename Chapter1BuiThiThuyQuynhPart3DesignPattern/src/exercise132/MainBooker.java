package exercise132;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Search a schedule</h1>
 * The MainBooker program implements an application that
 * 	allows to search a schedule from multiple systems.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class MainBooker {

	/**
	 * This is the main method which makes use of
	 *  methods of BookingFacade class.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @exception NumberFormatException On number format error.
	 * @see IOException.
	 * @see NumberFormatException.
	 */
	public static void main(String[] args) {
		BookingFacade booking = new BookingFacade();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Choose type that user want to book
			System.out.println("What do you book?");
			System.out.println("1. Train");
			System.out.println("2. Hotel");
			System.out.println("3. Airline");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 3) {
				System.out.println("Only choose from 1 to 3");
				System.out.println("What do you book?");
				System.out.println("1. Train");
				System.out.println("2. Hotel");
				System.out.println("3. Airline");
				
				choose = Integer.parseInt(input.readLine());
			}
			
			// Show system that user want to book
			switch (choose) {
			case 1:
				booking.trainBooker();
				break;
			case 2:
				booking.hotelBooker();
				break;
			case 3:
				booking.airlineBooker();
				break;
			default:
				break;
			}
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
