/**
 * @author Bui Thi Thuy Quynh
 * @date 23/08/2016
 * @version 2.0
 */

package exercise112;

import java.util.Date;

/**
 * @description class manages the information of a textbook, extends from Book
 */
public class TextBook extends Book {

	private String status;
	
	public TextBook() {
		
	}
	
	public TextBook(String id, String name, Date dateEntered,
			double price, int quantity, String publishingCompany, String status) {
		super(id, name, dateEntered, price, quantity, publishingCompany);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * @description function for calculating fee of a textbook
	 * @return fee of a textbook
	 */
	public double calFee() {
		if ("new".equals(this.status))
			return this.quantity * this.price;
		return this.quantity * this.price * 0.5;
	}
	
	/**
	 * @description function for get all information of a textbook
	 * @return string about the information of a textbook
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Status: " + this.status;
		return result;
	}
}
