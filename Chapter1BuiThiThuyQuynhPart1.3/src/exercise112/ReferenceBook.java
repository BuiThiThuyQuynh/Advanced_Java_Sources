/**
 * @author Bui Thi Thuy Quynh
 * @date 23/08/2016
 * @version 1.0
 */

package exercise112;

import java.util.Date;

/**
 * @description class manages the information of a reference book, extends from Book
 */
public class ReferenceBook extends Book {

	private double tax;
	
	public ReferenceBook() {
		
	}
	
	public ReferenceBook(String id, String name, Date dateEntered,
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
	 * @description function for calculating fee of a reference book
	 * @return fee of a reference book
	 */
	public double calFee() {
		double result = this.quantity * this.price + (this.quantity * this.quantity) * this.tax;
		return result;
	}
	
	/**
	 * @description function for get all information of a reference book
	 * @return string about the information of a reference book
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Tax: " + this.tax;
		return result;
	}
}
