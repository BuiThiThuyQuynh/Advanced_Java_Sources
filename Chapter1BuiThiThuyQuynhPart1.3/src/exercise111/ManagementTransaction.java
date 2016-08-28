/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise111;

import java.text.DecimalFormat;

/**
 * @description class manages the transaction included transaction gold and transaction currency
 */
public class ManagementTransaction {

	public ManagementTransaction() {
		
	}
	
	/**
	 * @description calculation total amount of array transaction
	 * @param0 array of transaction
	 * @return total amount of array transaction
	 */
	public double calTotalsAmount(Transaction[] transactions) {
		double result = 0;
		for (int i = 0; i < transactions.length; i++)
			result += transactions[i].calFee();
		return result;
	}
	
	/**
	 * @description calculating averages totals amount of array transaction
	 * @param0 array of transaction
	 * @return averages totals amount of array transaction
	 */
	public double averageTotalsAmount(Transaction[] transactions) {
		if (transactions.length == 0)
			return 0;
		return calTotalsAmount(transactions) / transactions.length;
	}
	
	/**
	 * @description calculation total quantity of transaction
	 * @param0 array of transaction
	 * @return total quantity of list transaction
	 */
	public double calTotalsQuantity(Transaction[] transactions) {
		double result = 0;
		for (int i = 0; i < transactions.length; i++)
			result += transactions[i].getQuantity();
		return result;
	}
	
	/**
	 * @description get all the information of array transaction
	 * @param0 array of transaction
	 * @return string about the information of array transaction
	 */
	public String printTransaction(Transaction[] transactions) {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		
		String result = "";
		for (int i = 0; i < transactions.length; i++) {
			result += transactions[i].toString();
			result += "----------------------\n";
		}
		
		result += "===========================\n";
		result += "Total quantity: " + decimalFormat.format(this.calTotalsQuantity(transactions)) + "\n";
		result += "Average amount: " + decimalFormat.format(this.averageTotalsAmount(transactions)) + "\n";		
		return result;
	}
	
}
