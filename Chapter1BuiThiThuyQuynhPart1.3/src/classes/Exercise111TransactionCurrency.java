/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges a transaction gold, extends from Exercise111Transaction class
 */

package classes;

import java.util.Date;

enum TypeCurrency {
	USD(22.250, 22.335),
	EUR(24.457, 25.050),
	AUD(16.530, 17.226);
	
	private double pricePurchase;
	private double priceSale;
	
	private TypeCurrency(double pricePurchase, double priceSale) {
		this.pricePurchase = pricePurchase;
		this.priceSale = priceSale;
	}

	public double getPricePurchase() {
		return pricePurchase;
	}

	public void setPricePurchase(double pricePurchase) {
		this.pricePurchase = pricePurchase;
	}

	public double getPriceSale() {
		return priceSale;
	}

	public void setPriceSale(double priceSale) {
		this.priceSale = priceSale;
	}
}

enum TypeTransaction {
	PURCHASE,
	SALE;
}
public class Exercise111TransactionCurrency extends Exercise111Transaction {

	private TypeCurrency typeCurrency;
	private TypeTransaction typeTransaction;
	
	public Exercise111TransactionCurrency() {
		
	}
	
	public Exercise111TransactionCurrency(String id, Date date, double price, int quantity, 
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

	@Override
	protected void setPrice(double price) {
		if (this.typeTransaction.name().equals("PURCHASE"))
			super.setPrice(this.typeCurrency.getPricePurchase());
		else
			super.setPrice(this.typeCurrency.getPriceSale());
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
		return this.quantity * this.price + (this.quantity * this.price) * 0.001;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Type of currency: " + this.getTypeCurrency().name() + "\n";
		if (this.typeTransaction.name().equals("PURCHASE"))
			result += "Totals amount sale: " + this.calFeeSale() + "VND\n";
		else
			result += "Totals amount purchase: " + this.calFeePurchase() + "VND\n";
		return result;
	}
}
