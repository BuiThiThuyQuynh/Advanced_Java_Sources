/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges a transaction gold, extends from Exercise111Transaction class
 */

package classes;

import java.util.Date;

enum TypeGold {
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

public class Exercise111TransactionGold extends Exercise111Transaction {
	
	private TypeGold typeGold;
	
	public Exercise111TransactionGold() {
		
	}
	
	public Exercise111TransactionGold(String id, Date date, double price, int quantity, TypeGold typeGold) {
		super(id, date, price, quantity);
		this.typeGold = typeGold;
	}

	public TypeGold getTypeGold() {
		return typeGold;
	}
	
	@Override
	protected void setPrice(double price) {
		super.setPrice(this.typeGold.getPrice());
	}
	
	/**
	 * Function: calculate amount of transaction gold
	 * Input: no
	 * Output: totals amount of transaction
	 */
	public double calFee() {
		return this.quantity * this.price;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Type of GOLD: " + this.getTypeGold().name() + "\n";
		result += "Totals amount: " + this.calFee() + "VND\n";
		return result;
	}
}
