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
	 * @description set new price for currency depend on type of transaction and type of currency
	 * @param0 price of currency
	 * @return new price of currency (depend on type of currency)
	 */
	@Override
	protected void setPrice(double price) {
		if (TypeTransaction.PURCHASE.equals(this.typeTransaction.name()))
			super.setPrice(typeCurrency.getPricePurchase());
		else
			super.setPrice(typeCurrency.getPricePurchase());
	}
	
	/**
	 * @description function for calculating total amount of transaction currency
	 * @return totals amount of transaction currency
	 */
	public double calFee() {
		if (TypeTransaction.PURCHASE.equals(this.typeTransaction))
			return this.quantity * this.price;
		return this.quantity * this.price + (this.quantity * this.price) * RATE;
	}
	
	/**
	 * @description function for get all the information a=of transaction currency
	 * @return string about the information of a transaction currency
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Type of currency: " + this.getTypeCurrency().name() + "\n";
		result += "Type of transaction: " + this.getTypeTransaction().name() + "\n";
		result += "Totals amount: " + this.calFee() + "VND\n";
		return result;
	}
}
