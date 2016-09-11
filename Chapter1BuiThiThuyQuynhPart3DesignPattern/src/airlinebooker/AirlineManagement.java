package airlinebooker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercise132.Place;

/**
 * The AirlineManagement class is used to manage the information
 * 	of multiple airline schedules.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class AirlineManagement {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Place places = new Place();
	private List<Airline> airlines;
	
	/**
	 * This method is used to initialize AirlineManagement class and
	 * 	set default value for list airline schedules.
	 * @param No.
	 * @return String This is the information of airline schedule.
	 */
	public AirlineManagement() throws ParseException {
		airlines = new ArrayList<Airline>();
		airlines.add(new Airline(sdf.parse("10/09/2016"), "10:30", places.getPlaces().get(0)));
		airlines.add(new Airline(sdf.parse("10/09/2016"), "00:30", places.getPlaces().get(1)));
		airlines.add(new Airline(sdf.parse("10/09/2016"), "14:30", places.getPlaces().get(2)));
		airlines.add(new Airline(sdf.parse("10/09/2016"), "08:00", places.getPlaces().get(1)));
		airlines.add(new Airline(sdf.parse("12/09/2016"), "10:30", places.getPlaces().get(3)));
		airlines.add(new Airline(sdf.parse("11/09/2016"), "18:30", places.getPlaces().get(0)));
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	/**
	 * This method is used to search list airline schedules can book
	 * 	from input of user.
	 * @param dapartureDate This is departure date of airline.
	 * @param time This is time departure of airline.
	 * @param place This is place of airline.
	 * @return String This is the information of airline schedule.
	 */
	public List<Airline> searchAirline(Date dapartureDate, String time, String place) {
		List<Airline> result = new ArrayList<Airline>();
		
		for (Airline item : airlines) {
			if (dapartureDate.compareTo(item.getDepartureDate()) >= 0 && 
			time.equals(item.getTime()) && place.equals(item.getPlace()))
				result.add(item);
		}
		
		return result;
	}
}
