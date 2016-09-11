package airlinebooker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import exercise132.Place;

/**
 * The AirlineBooker class is used to search list airline schedules that can book
 * 	from the information of user input and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class AirlineBooker {
	
	/**
	 * This method is used to print search result from input of user
	 *	and prints the output on the screen.
	 * @param dapartureDate This is departure date of airline.
	 * @param time This is time departure of airline.
	 * @param place This is place of airline.
	 * @return Nothing.
	 */
	public static void printList(Date departureDate, String time, String place) throws ParseException {
		AirlineManagement management = new AirlineManagement();
		
		List<Airline> searchResult = management.searchAirline(departureDate, time, place);
		
		int n = searchResult.size();
		System.out.println("===== List airline schedule can book =========");
		System.out.println("Departure date\tTime\tPlace");
		for (int i = 0; i < n; i++) {
			System.out.print(searchResult.get(i).toString());
		}
	}

	/**
	 * This method is used to input the information of airline schedule
	 *  and prints search result on the screen.
	 * @param No.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @exception NumberFormatException On number format error.
	 * @exception ParseException On parse date error
	 * @see IOException.
	 * @see NumberFormatException.
	 * @see ParseExcepdtion.
	 */
	public void booker() {
	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Place places = new Place();
		try {
			// Input the information for search airline schedule.
			System.out.println("===== Airline Booker ======");
			System.out.println("Enter departure date (dd/MM/yyyy): ");
			String date = input.readLine();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			dateFormat.setLenient(false);
			
			Date departureDate = dateFormat.parse(date);
			
			System.out.println("Enter time: ");
			String time = input.readLine();
			
			System.out.println("Place: ");
			System.out.println(places.toString());
			int choose = Integer.parseInt(input.readLine());
			
			while (choose <= 0 || choose > places.getPlaces().size()) {
				System.out.println("Please choose from 1 to " 
						+ places.getPlaces().size());
				System.out.println("Place: ");
				System.out.println(places.toString());
				choose = Integer.parseInt(input.readLine());
			}
			
			String place = places.getPlaces().get(choose - 1);
			
			// Prints search result on the screen.
			printList(departureDate, time, place);
			
			
		}
		catch (IOException | NumberFormatException | ParseException ex) {
			System.out.println("Exception: " + ex);
		}
	}

}
