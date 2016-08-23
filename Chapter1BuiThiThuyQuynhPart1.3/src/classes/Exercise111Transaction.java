/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges a transaction
 */

package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise111Transaction {

	protected String id;
	protected Date date;
	protected double price;
	protected int quantity;
	
	public Exercise111Transaction() {
		
	}

	public Exercise111Transaction(String id, Date date, double price, int quantity) {
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
	
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String result = "ID: " + this.id + "\n";
		result += "Date of trnsaction: " + dateFormat.format(this.date) + "\n";
		result += "Price: " + this.price + "\n";
		result += "Quantity: " + this.quantity + "\n";
		return result;
	}
}
