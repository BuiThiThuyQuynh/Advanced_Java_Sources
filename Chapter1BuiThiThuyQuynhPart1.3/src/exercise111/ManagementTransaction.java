/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges the transaction included transaction gold and transaction currency
 */

package exercise111;

import java.text.DecimalFormat;

public class ManagementTransaction {

	TransactionGold[] listTransGold;
	TransactionCurrency[] listTransCurrency;
	
	public ManagementTransaction() {
		
	}
	
	public ManagementTransaction(TransactionGold[] listTransGold,
			TransactionCurrency[] listTransCurrency) {
		this.listTransGold = listTransGold;
		this.listTransCurrency = listTransCurrency;
	}

	public TransactionGold[] getListTransGold() {
		return listTransGold;
	}

	public void setListTransGold(TransactionGold[] listTransGold) {
		this.listTransGold = listTransGold;
	}

	public TransactionCurrency[] getListTransCurrency() {
		return listTransCurrency;
	}

	public void setListTransCurrency(TransactionCurrency[] listTransCurrency) {
		this.listTransCurrency = listTransCurrency;
	};
	
	/**
	 * Function: calculation totals amount of transaction gold
	 * Input: no
	 * Output: totals amount of list transaction gold
	 */
	public double calTotalsAmountGold() {
		double result = 0;
		for (int i = 0; i < listTransGold.length; i++)
			result += listTransGold[i].calFee();
		return result;
	}
	
	/**
	 * Function: averages totals amount of transaction gold
	 * Input: no
	 * Output: averages totals amount of list transaction gold
	 */
	public double averageTotalsAmountGold() {
		if (listTransGold.length == 0)
			return 0;
		return calTotalsAmountGold() / listTransGold.length;
	}
	
	/**
	 * Function: calculation totals amount of transaction currency of sale
	 * Input: no
	 * Output: totals amount of list transaction currency of sale
	 */
	public double calTotalsAmountCurrencySale() {
		double result = 0;
		for (int i = 0; i < listTransCurrency.length; i++)
			result += listTransCurrency[i].calFeeSale();
		return result;
	}
	
	/**
	 * Function: calculation totals amount of transaction currency of purchasing
	 * Input: no
	 * Output: totals amount of list transaction currency of purchasing
	 */
	public double calTotalsAmountCurrencyPurchase() {
		double result = 0;
		for (int i = 0; i < listTransCurrency.length; i++)
			result += listTransCurrency[i].calFeePurchase();
		return result;
	}
	
	/**
	 * Function: averages totals amount of transaction currency of sale
	 * Input: no
	 * Output: averages totals amount of list transaction currency of sale
	 */
	public double averageTotalsAmountCurrencySale() {
		if (listTransCurrency.length == 0)
			return 0;
		return calTotalsAmountCurrencySale() / listTransCurrency.length;
	}
	
	/**
	 * Function: averages totals amount of transaction currency of purchasing
	 * Input: no
	 * Output: averages totals amount of list transaction currency of purchasing
	 */
	public double averageTotalsAmountCurrencyPurchase() {
		if (listTransCurrency.length == 0)
			return 0;
		return calTotalsAmountCurrencyPurchase() / listTransCurrency.length;
	}
	
	/**
	 * Function: calculation totals quantity of transaction currency of sale
	 * Input: no
	 * Output: totals quantity of list transaction currency of sale
	 */
	public double calTotalsQuantityCurrencySale() {
		double result = 0;
		for (int i = 0; i < listTransCurrency.length; i++)
			result += listTransCurrency[i].getQuantity();
		return result;
	}
	
	/**
	 * Function: calculation totals quantity of transaction currency of purchasing
	 * Input: no
	 * Output: totals quantity of list transaction currency of purchasing
	 */
	public double calTotalsQuantityCurrencyPurchase() {
		double result = 0;
		for (int i = 0; i < listTransCurrency.length; i++)
			result += listTransCurrency[i].getQuantity();
		return result;
	}
	
	/**
	 * Function: calculation totals quantity of transaction gold
	 * Input: no
	 * Output: totals quantity of list transaction gold
	 */
	public double calTotalsQuantityGold() {
		double result = 0;
		for (int i = 0; i < listTransGold.length; i++)
			result += listTransGold[i].getQuantity();
		return result;
	}
	
	/**
	 * Function: the information of transaction gold
	 * Input: no
	 * Output: string to printing
	 */
	public String printTransacGold() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		
		String result = "======= LIST OF TRANSACTION GOLD ==========\n";
		for (int i = 0; i < listTransGold.length; i++) {
			result += listTransGold[i].toString();
			result += "----------------------\n";
		}
		
		result += "===========================\n";
		result += "Total quantity: " + decimalFormat.format(this.calTotalsQuantityGold()) + "\n";
		result += "Average amount: " + decimalFormat.format(this.averageTotalsAmountGold()) + "\n";		
		return result;
	}
	
	/**
	 * Function: the information of transaction currency
	 * Input: no
	 * Output: string to printing
	 */
	public String printTransacCurrency() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		
		String result = "======= LIST OF TRANSACTION CURRENCY ==========\n";
		for (int i = 0; i < listTransCurrency.length; i++) {
			result += listTransCurrency[i].toString();
			result += "----------------------\n";
		}
		
		result += "===========================\n";
		result += "Total quantity: " + decimalFormat.format(
				this.calTotalsAmountCurrencyPurchase() + this.calTotalsAmountCurrencySale()) + "\n";
		result += "Average amount: " + decimalFormat.format(
				(this.averageTotalsAmountCurrencyPurchase() + this.averageTotalsAmountCurrencySale()) / 2) + "\n";		
		return result;
	}
}
