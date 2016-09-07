/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages the CDs
 */

package exercise21;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ManagementCD {
	
	private ArrayList<CD> cds = new ArrayList<CD>();

	public ManagementCD() {
		
	}

	public ManagementCD(ArrayList<CD> cds) {
		this.cds = cds;
	}

	public ArrayList<CD> getCds() {
		return cds;
	}

	public void setCds(ArrayList<CD> cds) {
		this.cds = cds;
	}
	
	/**
	 * Function: calculating summary price of CDs
	 * Input: no
	 * Output: summary price of CDs
	 */
	public double calSummaryPriceOfCDs() {
		double result = 0;
		for (int i = 0; i < cds.size(); i++) {
			result += cds.get(i).getPrice();
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
		Collections.sort(cds);
		System.out.println("================ LIST OF CDs ===============");
		for (int i = 0; i < cds.size(); i++) {
			result += cds.get(i).toString();
		}
		result += "Totals of CDS: " + formatter.format(calSummaryPriceOfCDs());
		
		return result;
	}
}
