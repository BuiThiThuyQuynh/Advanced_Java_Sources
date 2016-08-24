/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manages the information of a type of computer
 */

package exercise19;

import java.text.DecimalFormat;

public class Computer {

	protected String id;
	protected double price;
	protected String manufactory;
	protected int quantity;
	
	public Computer() {
		
	}
	
	public Computer(String id, double price, String manufactory, int quantity) {
		this.id = id;
		this.price = price;
		this.manufactory = manufactory;
		this.quantity = quantity;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getManufactory() {
		return manufactory;
	}
	
	public void setManufactory(String manufactory) {
		this.manufactory = manufactory;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Fucntion: calculation fee of computer
	 * Input: no
	 * Output: totals amount of computer
	 */
	public double calFee() {
		return this.price * this.quantity;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###");
		String result = "ID: " + this.id + "\n";
		
		result += "Price: " + format.format(this.price) + "USD\n";
		result += "Manufactory: " + this.manufactory + "\n";
		return result;
	}
	
}
