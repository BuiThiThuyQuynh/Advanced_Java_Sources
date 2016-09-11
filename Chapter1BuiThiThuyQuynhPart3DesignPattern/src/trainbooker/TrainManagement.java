package trainbooker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercise132.Place;

/**
 * The TrainManagement class is used to manage the information
 * 	of multiple train schedules.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class TrainManagement {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Place places = new Place();
	
	private List<Train> trains;
	
	/**
	 * This method is used to initialize TrainManagement class and
	 * 	set default value for list train schedules.
	 * @param No.
	 * @return String This is the information of train schedule.
	 */
	public TrainManagement() throws ParseException {
		trains = new ArrayList<Train>();
		trains.add(new Train(sdf.parse("10/09/2016"), "10:30", places.getPlaces().get(0)));
		trains.add(new Train(sdf.parse("10/09/2016"), "00:30", places.getPlaces().get(1)));
		trains.add(new Train(sdf.parse("10/09/2016"), "14:30", places.getPlaces().get(2)));
		trains.add(new Train(sdf.parse("10/09/2016"), "08:00", places.getPlaces().get(1)));
		trains.add(new Train(sdf.parse("12/09/2016"), "10:30", places.getPlaces().get(3)));
		trains.add(new Train(sdf.parse("11/09/2016"), "18:30", places.getPlaces().get(0)));
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	/**
	 * This method is used to search list train schedules can book
	 * 	from input of user.
	 * @param dapartureDate This is departure date of train.
	 * @param time This is time departure of train.
	 * @param place This is place of train.
	 * @return String This is the information of train schedule.
	 */
	public List<Train> searchTrain(Date dapartureDate, String time, String place) {
		List<Train> result = new ArrayList<Train>();
		
		for (Train item : trains) {
			if (dapartureDate.compareTo(item.getDepartureDate()) >= 0 && 
					time.equals(item.getTime()) && place.equals(item.getPlace()))
				result.add(item);
		}
		
		return result;
	}
}
