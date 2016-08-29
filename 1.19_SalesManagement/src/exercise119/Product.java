/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

import java.text.DecimalFormat;

/**
 * @description class manages the information of a product
 */
public class Product {

	private String name;
	private double price;

	public Product(){

	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * @description get information of product
	 * @return string about the information of product
	 */
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		String result = this.name + "\t\t" + decimalFormat.format(this.price) + "\t\t";
		return result;
	}
}