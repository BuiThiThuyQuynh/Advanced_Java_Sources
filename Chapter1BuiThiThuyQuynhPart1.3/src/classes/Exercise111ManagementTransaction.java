/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges the transaction included transaction gold and transaction currency
 */

package classes;

public class Exercise111ManagementTransaction {

	Exercise111TransactionGold[] listTransGold;
	Exercise111TransactionCurrency[] listTransCurrency;
	
	public Exercise111ManagementTransaction() {
		
	}
	
	public Exercise111ManagementTransaction(Exercise111TransactionGold[] listTransGold,
			Exercise111TransactionCurrency[] listTransCurrency) {
		this.listTransGold = listTransGold;
		this.listTransCurrency = listTransCurrency;
	}

	public Exercise111TransactionGold[] getListTransGold() {
		return listTransGold;
	}

	public void setListTransGold(Exercise111TransactionGold[] listTransGold) {
		this.listTransGold = listTransGold;
	}

	public Exercise111TransactionCurrency[] getListTransCurrency() {
		return listTransCurrency;
	}

	public void setListTransCurrency(Exercise111TransactionCurrency[] listTransCurrency) {
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
}
