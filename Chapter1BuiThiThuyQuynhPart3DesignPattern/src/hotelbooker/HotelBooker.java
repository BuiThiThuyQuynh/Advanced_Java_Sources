package hotelbooker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import exercise132.Place;

/**
 * The HotelBooker class is used to search list hotel schedules that can book
 * 	from the information of user input and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class HotelBooker {
	
	/**
	 * This method is used to print search result from input of user
	 *	and prints the output on the screen.
	 * @param fromdate This is from date of hotel's room.
	 * @param toDate This is to date of hotel's room.
	 * @param place This is place of hotel.
	 * @return Nothing.
	 */
	public static void printList(Date fromDate, Date toDate, String place) throws ParseException {
		HotelManagement management = new HotelManagement();
		
		List<Hotel> searchResult = management.searchHotel(fromDate, toDate, place);
		
		int n = searchResult.size();
		System.out.println("===== List hotel schedule can book =========");
		System.out.println("From date\tTo date\t\tPlace");
		for (int i = 0; i < n; i++) {
			System.out.print(searchResult.get(i).toString());
		}
	}

	/**
	 * This method is used to input the information of hotel schedule
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
			// Input the information for search hotel schedule.
			System.out.println("===== Hotel booker ======");
			System.out.println("Enter from date (dd/MM/yyyy): ");
			String date = input.readLine();
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			dateFormat.setLenient(false);
			
			Date fromDate = dateFormat.parse(date);
			
			System.out.println("Enter to date (dd/MM/yyyy): ");
			date = input.readLine();
			
			Date toDate = dateFormat.parse(date);
			
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
			printList(fromDate, toDate, place);
			
			
		}
		catch (IOException | NumberFormatException | ParseException ex) {
			System.out.println("Exception: " + ex);
		}
	}

}
