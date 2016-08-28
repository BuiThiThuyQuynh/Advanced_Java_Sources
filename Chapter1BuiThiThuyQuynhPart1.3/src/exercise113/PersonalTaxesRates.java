/**
 * @author Bui Thi Thuy Quynh
 * @date 29/08/2016
 * @version 1.0
 */

package exercise113;

/**
 * @description enum for personal taxes rates
 */
public enum PersonalTaxesRates {

	LEVEL1(0, 5000000, 0.05, 250000),
	LEVEL2(5000001, 10000000, 0.1, 500000),
	LEVEL3(10000001, 18000000, 0.15, 1200000),
	LEVEL4(18000001, 32000000, 0.2, 2800000),
	LEVEL5(32000001, 52000000, 0.25, 5000000),
	LEVEL6(52000001, 80000000, 0.3, 8400000),
	LEVEL7(80000001, 0.35);
	
	private double taxableSalaryStart;
	private double taxableSalaryEnd;
	private double tax;
	private double maxtaxableSalary;
	
	private PersonalTaxesRates(double taxableSalaryStart, double taxableSalaryEnd, double tax,
			double maxtaxableSalary) {
		this.taxableSalaryStart = taxableSalaryStart;
		this.taxableSalaryEnd = taxableSalaryEnd;
		this.tax = tax;
		this.maxtaxableSalary = maxtaxableSalary;
	}

	private PersonalTaxesRates(double taxableSalaryStart, double tax) {
		this.taxableSalaryStart = taxableSalaryStart;
		this.tax = tax;
	}

	public double getTaxableSalaryStart() {
		return taxableSalaryStart;
	}

	public void setTaxableSalaryStart(double taxableSalaryStart) {
		this.taxableSalaryStart = taxableSalaryStart;
	}

	public double getTaxableSalaryEnd() {
		return taxableSalaryEnd;
	}

	public void setTaxableSalaryEnd(double taxableSalaryEnd) {
		this.taxableSalaryEnd = taxableSalaryEnd;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getMaxtaxableSalary() {
		return maxtaxableSalary;
	}

	public void setMaxtaxableSalary(double maxtaxableSalary) {
		this.maxtaxableSalary = maxtaxableSalary;
	}
}
