/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise19;

import java.text.DecimalFormat;

/**
 * @description class manages the information of a type of computer
 */
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
	 * @description function for calculation fee of a type of computer
	 * @return total amount of a type of computer
	 */
	public double calFee() {
		return this.price * this.quantity;
	}
	
	/**
	 * @description function for printing the information of a type of computer
	 * @return string about information of a type of computer
	 */
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###");
		String result = "ID: " + this.id + "\n";
		
		result += "Price: " + format.format(this.price) + "USD\n";
		result += "Manufactory: " + this.manufactory + "\n";
		return result;
	}
	
}
