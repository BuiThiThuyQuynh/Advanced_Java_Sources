/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges a transaction gold, extends from Exercise111Transaction class
 */

package exercise111;

import java.util.Date;

public class TransactionCurrency extends Transaction {

	private final double RATE = 0.001;
	
	private TypeCurrency typeCurrency;
	private TypeTransaction typeTransaction;
	
	public TransactionCurrency() {
		
	}
	
	public TransactionCurrency(String id, Date date, double price, int quantity, 
			TypeCurrency typeCurrency, TypeTransaction typeTransaction) {
		super(id, date, price, quantity);
		this.typeCurrency = typeCurrency;
		this.typeTransaction = typeTransaction;
	}

	public TypeCurrency getTypeCurrency() {
		return typeCurrency;
	}

	public void setTypeCurrency(TypeCurrency typeCurrency) {
		this.typeCurrency = typeCurrency;
	}

	public TypeTransaction getTypeTransaction() {
		return typeTransaction;
	}

	public void setTypeTransaction(TypeTransaction typeTransaction) {
		this.typeTransaction = typeTransaction;
	}
	
	/**
	 * Function: set new price for currency depend on type of transaction and type of currency
	 * Input: price
	 * Output: price of currency depend on type of currency
	 */
	@Override
	protected void setPrice(double price) {
		if (this.typeTransaction.name().equals(TypeTransaction.PURCHASE))
			super.setPrice(typeCurrency.getPricePurchase());
		else
			super.setPrice(typeCurrency.getPricePurchase());
	}
	
	/**
	 * Function: calculate amount of transaction currency
	 * Input: no
	 * Output: totals amount of purchase transaction
	 */
	public double calFeePurchase() {
		return this.quantity * this.price;
	}
	
	/**
	 * Function: calculate amount of transaction currency
	 * Input: no
	 * Output: totals amount of sale transaction
	 */
	public double calFeeSale() {
		return this.quantity * this.price + (this.quantity * this.price) * RATE;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Type of currency: " + this.getTypeCurrency().name() + "\n";
		result += "Type of transaction: " + this.getTypeTransaction().name() + "\n";
		if (this.typeTransaction.name().equals(TypeTransaction.PURCHASE))
			result += "Totals amount sale: " + this.calFeeSale() + "VND\n";
		else
			result += "Totals amount purchase: " + this.calFeePurchase() + "VND\n";
		return result;
	}
}
