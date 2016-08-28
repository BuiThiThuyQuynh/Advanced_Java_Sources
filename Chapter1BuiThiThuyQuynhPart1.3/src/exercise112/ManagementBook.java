/**
 * @author Bui Thi Thuy Quynh
 * @date 23/08/2016
 * @version 2.0
 */

package exercise112;

/**
 * @description class manages the books
 */
public class ManagementBook {

	public ManagementBook() {
		
	}
	
	/**
	 * @description calculation total amount of array book
	 * @param0 array of book
	 * @return total amount of array book
	 */
	public double calFee(Book[] books) {
		double result = 0;
		for (int i = 0; i < books.length; i++) 
			result += books[i].calFee();
		
		return result;
	}
	
	/**
	 * @description calculation total price of array book
	 * @param0 array of book
	 * @return total price of array book
	 */
	public double calPrice(Book[] books) {
		double result = 0;
		for (int i = 0; i < books.length; i++) 
			result += books[i].getPrice();
		
		return result;
	}
	
	/**
	 * @description calculation average price of array book
	 * @param0 array of book
	 * @return average price of array book
	 */
	public double calAveragePrice(Book[] books) {
		if (books.length == 0)
			return 0;
		
		return calPrice(books) / books.length;
	}
	
	/**
	 * @description get all the information of array book
	 * @param0 array of book
	 * @return string about the information of array book
	 */
	public String printInformation(Book[] books) {
		String result = "";
		
		for (int i = 0; i < books.length; i++) {
			result += books[i].toString() + "\n";
			result += "---------------";
		}
		
		return result;
	}
}
