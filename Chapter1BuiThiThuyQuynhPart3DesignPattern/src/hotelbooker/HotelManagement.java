package hotelbooker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercise132.Place;

/**
 * The HotelManagement class is used to manage the information
 * 	of multiple hotel schedules.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class HotelManagement {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Place places = new Place();
	private List<Hotel> hotels;
	
	/**
	 * This method is used to initialize HotelManagement class and
	 * 	set default value for list hotel schedules.
	 * @param No.
	 * @return String This is the information of hotel schedule.
	 */
	public HotelManagement() throws ParseException {
		hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel(sdf.parse("10/09/2016"), sdf.parse("16/09/2016"), places.getPlaces().get(0)));
		hotels.add(new Hotel(sdf.parse("10/09/2016"), sdf.parse("15/09/2016"), places.getPlaces().get(1)));
		hotels.add(new Hotel(sdf.parse("10/09/2016"), sdf.parse("17/09/2016"), places.getPlaces().get(2)));
		hotels.add(new Hotel(sdf.parse("10/09/2016"), sdf.parse("15/09/2016"), places.getPlaces().get(1)));
		hotels.add(new Hotel(sdf.parse("12/09/2016"), sdf.parse("19/09/2016"), places.getPlaces().get(3)));
		hotels.add(new Hotel(sdf.parse("11/09/2016"), sdf.parse("12/09/2016"), places.getPlaces().get(0)));
	}

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	/**
	 * This method is used to search list hotel schedules can book
	 * 	from input of user.
	 * @param fromDate This is from date of hotel.
	 * @param toDate This is to date of hotel.
	 * @param place This is place of hotel.
	 * @return String This is the information of hotel schedule.
	 */
	public List<Hotel> searchHotel(Date fromDate, Date toDate, String place) {
		List<Hotel> result = new ArrayList<Hotel>();
		
		for (Hotel item : hotels) {
			if (fromDate.compareTo(item.getFromDate()) >= 0 && 
					toDate.compareTo(item.getToDate()) < 0 && place.equals(item.getPlace()))
				result.add(item);
		}
		
		return result;
	}
}
