/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 2.0
 */

package exercise111;

/**
 * @description enum for type of gold
 */
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
