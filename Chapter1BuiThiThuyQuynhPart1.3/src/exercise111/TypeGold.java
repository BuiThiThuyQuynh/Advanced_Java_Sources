/**
 * Author: Bui Thi Thuy Quynh
 * Date: 24/08/2016
 * Version: 1.0
 * 
 *  Enum for type of gold
 */

package exercise111;

public enum TypeGold {
	
	GOLD18K(27.325),
	GOLD24K(36.23),
	GOLDSJC(36.63);
	
	private double price;
	
	private TypeGold(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
