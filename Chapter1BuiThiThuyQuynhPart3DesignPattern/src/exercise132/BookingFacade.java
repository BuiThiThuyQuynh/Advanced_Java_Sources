package exercise132;

import airlinebooker.AirlineBooker;
import hotelbooker.HotelBooker;
import trainbooker.TrainBooker;

/**
 * The BookingFacade class is used to integrate 
 * 	AirlineBookrer, TrianBooker and HotelBooker to a systems.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-10
 */
public class BookingFacade {

	private AirlineBooker airlineBooker;
	private TrainBooker trainBooker;
	private HotelBooker hotelBooker;
	
	public BookingFacade() {
		airlineBooker = new AirlineBooker();
		trainBooker = new TrainBooker();
		hotelBooker = new HotelBooker(); 
	}
	
	/**
	 * This method is used to call airline booker system.
	 * @param No.
	 * @return Nothing.
	 */
	public void airlineBooker() {
		airlineBooker.booker();
	}
	
	/**
	 * This method is used to call train booker system.
	 * @param No.
	 * @return Nothing.
	 */
	public void trainBooker() {
		trainBooker.booker();
	}
	
	/**
	 * This method is used to call hotel booker system.
	 * @param No.
	 * @return Nothing.
	 */
	public void hotelBooker() {
		hotelBooker.booker();
	}
}
