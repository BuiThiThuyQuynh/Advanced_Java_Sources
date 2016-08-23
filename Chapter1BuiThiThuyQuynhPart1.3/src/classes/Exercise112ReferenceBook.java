/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 *  Class manges the information of a reference book, extends from Exercise112Book
 */

package classes;

import java.util.Date;

public class Exercise112ReferenceBook extends Exercise112Book {

	private double tax;
	
	public Exercise112ReferenceBook() {
		
	}
	
	public Exercise112ReferenceBook(String id, String name, Date dateEntered,
			double price, int quantity, String publishingCompany, double tax) {
		super(id, name, dateEntered, price, quantity, publishingCompany);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	/**
	 * Function: calculation amount of reference book
	 * Input: no
	 * Output: totals amount of reference book
	 */
	public double calFee() {
		double result = this.quantity * this.price + (this.quantity * this.quantity) * this.tax;
		return result;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Tax: " + this.tax;
		return result;
	}
}
