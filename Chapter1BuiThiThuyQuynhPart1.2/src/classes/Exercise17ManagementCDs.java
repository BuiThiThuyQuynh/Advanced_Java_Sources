/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages the CDs
 */

package classes;

import java.text.DecimalFormat;

public class Exercise17ManagementCDs {
	
	private Exercise17CD[] cds;

	public Exercise17ManagementCDs() {
		
	}

	public Exercise17ManagementCDs(Exercise17CD[] cds) {
		this.cds = cds;
	}

	public Exercise17CD[] getCds() {
		return cds;
	}

	public void setCds(Exercise17CD[] cds) {
		this.cds = cds;
	}
	
	/**
	 * Function: calculating summary price of CDs
	 * Input: no
	 * Output: summary price of CDs
	 */
	public double calSummaryPriceOfCDs() {
		double result = 0;
		for (int i = 0; i < cds.length; i++) {
			result += cds[i].getPrice();
		}
		
		return result;
	}
	
	/**
	 * Function: print the information of CDs and totals of them
	 * Input: no
	 * Output: string about information of CDs and totals of them
	 */
	@Override
	public String toString() {
		String result = "";
		DecimalFormat formatter = new DecimalFormat("#,###");
		
		System.out.println("================ LIST OF CDs ===============");
		for (int i = 0; i < cds.length; i++) {
			result += cds[i].toString();
		}
		result += "Totals of CDS: " + formatter.format(calSummaryPriceOfCDs());
		
		return result;
	}
}
