package exercise92;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Bui Thi Thuy Quynh
 * @since 13/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of list CDs
 */
public class ManagementCD {
	
	private List<CD> cds = new ArrayList<CD>();
	private String language;

	public ManagementCD() {
		
	}

	public ManagementCD(List<CD> cds) {
		this.cds = cds;
	}

	public List<CD> getCds() {
		return cds;
	}

	public void setCds(List<CD> cds) {
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
	
	public String getLanguage() {
		return language;
	}
	

	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @description get list CDs and total amount of them
	 * @return string about list CDs and total amount of them
	 */
	@Override
	public String toString() {
		Locale currentLocal = new Locale("en", "US");
		ResourceBundle message = ResourceBundle.getBundle(language, currentLocal);
		
		String result = "";
		DecimalFormat formatter = new DecimalFormat("#,###");
	
		System.out.println("================ " + message.getString("listName") + "===============");
		for (int i = 0; i < cds.size(); i++) {
			result += cds.get(i).toString();
		}
		result += message.getString("total") + ": " + formatter.format(calSummaryPriceOfCDs());
		
		return result;
	}
}
