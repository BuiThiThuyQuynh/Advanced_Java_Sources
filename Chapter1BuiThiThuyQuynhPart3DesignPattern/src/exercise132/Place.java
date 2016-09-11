package exercise132;

import java.util.ArrayList;
import java.util.List;

/**
 * The Place class is used to manage a list places.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class Place {

	private List<String> places;
	
	/**
	 * This method is used to initialize Place class and
	 * 	set default value for list places.
	 * @param No.
	 * @return String This is the information of train schedule.
	 */
	public Place() {
		places = new ArrayList<String>();
		places.add("Ho Chi Minh");
		places.add("Nha Trang");
		places.add("Ha Noi");
		places.add("Da Nang");
	}
	
	public void addPlace(String place) {
		places.add(place);
	}
	
	public List<String> getPlaces() {
		return places;
	}

	public void setPlaces(List<String> places) {
		this.places = places;
	}

	/**
	 * This method is used to get the information of places.
	 * @param No.
	 * @return String This is the information of places.
	 */
	@Override
	public String toString() {
		String result = "";
		
		int n = places.size();
		for (int i = 0; i < n; i++) {
			result += (i + 1) + ". " + places.get(i) + "\n";
		}
		return result;
	}
}
