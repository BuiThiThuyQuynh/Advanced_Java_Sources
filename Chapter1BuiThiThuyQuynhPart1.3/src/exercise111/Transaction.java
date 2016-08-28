/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise111;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description class manages the information of a transaction
 */
public class Transaction {

	protected String id;
	protected Date date;
	protected double price;
	protected int quantity;
	
	public Transaction() {
		
	}

	public Transaction(String id, Date date, double price, int quantity) {
		this.id = id;
		this.date = date;
		this.price = price;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * @description function for calculating total amount of transaction
	 * @return totals amount of transaction
	 */
	public double calFee() {
		return 0;
	}
	
	/**
	 * @description function for get all information of a transaction
	 * @return string about the information of a transaction
	 */
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String result = "ID: " + this.id + "\n";
		result += "Date of transaction: " + dateFormat.format(this.date) + "\n";
		result += "Price: " + this.price + "\n";
		result += "Quantity: " + this.quantity + "\n";
		return result;
	}
}
