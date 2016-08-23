/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 *  Class manges the information of a textbook, extends from Exercise112Book
 */

package classes;

import java.util.Date;

public class Exercise112TextBook extends Exercise112Book {

	private String status;
	
	public Exercise112TextBook() {
		
	}
	
	public Exercise112TextBook(String id, String name, Date dateEntered,
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
	 * Function: calculation amount of textbook
	 * Input: no
	 * Output: totals amount of textBook
	 */
	public double calFee() {
		if (this.status == "new")
			return this.quantity * this.price;
		return this.quantity * this.price * 0.5;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Status: " + this.status;
		return result;
	}
}
