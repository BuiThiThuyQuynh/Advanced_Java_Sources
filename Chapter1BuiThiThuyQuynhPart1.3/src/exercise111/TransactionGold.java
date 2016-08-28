/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise111;

import java.util.Date;

/**
 * @description class manages a transaction gold, extends from Transaction class
 */
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
	 * @description function for calculating total amount of transaction gold
	 * @return totals amount of transaction gold
	 */
	public double calFee() {
		return this.quantity * this.price;
	}
	
	/**
	 * @description function for get all the information a=of transaction gold
	 * @return string about the information of a transaction gold
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Type of GOLD: " + this.typeGold.name() + "\n";
		result += "Totals amount: " + this.calFee() + "VND\n";
		return result;
	}
}
