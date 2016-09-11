package airlinebooker;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Airline class is used to manage the information
 * 	of airline schedule.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class Airline {

	private Date departureDate;
	private String time;
	private String place;
	
	public Airline() {
		
	}

	public Airline(Date departureDate, String time, String place) {
		this.departureDate = departureDate;
		this.time = time;
		this.place = place;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	/**
	 * This method is used to get the information of a airline schedule.
	 * @param No.
	 * @return String This is the information of airline schedule.
	 */
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String result = "";
		
		result += sdf.format(departureDate) + "\t";
		result += time + "\t";
		result += place + "\n";
		return result;
	}
}
