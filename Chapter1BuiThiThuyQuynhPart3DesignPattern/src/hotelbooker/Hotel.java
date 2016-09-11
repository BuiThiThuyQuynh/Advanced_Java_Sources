package hotelbooker;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Hotel class is used to manage the information
 * 	of hotel schedule.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class Hotel {

	private Date fromDate;
	private Date toDate;
	private String place;
	
	public Hotel() {
		
	}
	
	public Hotel(Date fromDate, Date toDate, String place) {
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.place = place;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	/**
	 * This method is used to get the information of a hotel schedule.
	 * @param No.
	 * @return String This is the information of hotel schedule.
	 */
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String result = "";
		
		result += sdf.format(fromDate) + "\t";
		result += sdf.format(toDate) + "\t";
		result += place + "\n";
		return result;
	}
}
