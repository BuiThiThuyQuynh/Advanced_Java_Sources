/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges a transaction gold, extends from Exercise111Transaction class
 */

package exercise111;

import java.util.Date;

public class TransactionGold extends Transaction {
	
	private TypeGold typeGold;
	
	public TransactionGold() {
		
	}
	
	public TransactionGold(String id, Date date, double price, int quantity, TypeGold typeGold) {
		super(id, date, price, quantity);
		this.typeGold = typeGold;
	}
	
	public TypeGold getTypeGold() {
		return typeGold;
	}

	public void setTypeGold(TypeGold typeGold) {
		this.typeGold = typeGold;
	}
	
	/**
	 * Function: set price for gold
	 * Input: new price
	 * Output: no
	 */
//	@Override
//	protected void setPrice(double price) {
//		super.setPrice(typeGold.getPrice());
//	}

	/**
	 * Function: calculate amount of transaction gold
	 * Input: no
	 * Output: totals amount of transaction
	 */
	public double calFee() {
		return this.quantity * this.price;
	}
	
	/**
	 * Function: the information for printing
	 * Input: no
	 * Output: string to printing
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Type of GOLD: " + this.typeGold.name() + "\n";
		result += "Totals amount: " + this.calFee() + "VND\n";
		return result;
	}
}
