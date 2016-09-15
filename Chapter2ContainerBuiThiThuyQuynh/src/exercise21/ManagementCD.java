package exercise21;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of list CDs
 */
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
	 * @description calculating summary price of CDs
	 * @return summary price of CDs
	 */
	public double calSummaryPriceOfCDs() {
		double result = 0;
		for (int i = 0; i < cds.size(); i++) {
			result += cds.get(i).getPrice();
		}
		
		return result;
	}
	
	/**
	 * @description get list CDs and total amount of them
	 * @return string about list CDs and total amount of them
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
