/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an employee
 */

package exercise64;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * Enum for personal income tax grades
 */
enum PersonalTaxesRates {
	
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

@SuppressWarnings("serial")
public class Employee implements Serializable {
	
	private final double BASICSALARY = 1260000;
	private final double TAXABLEBASICSALARY = 9000000;
	private final double ALLOWANCEFAMILY = 3600000;
	
	private String name;
	private double coefficientsSalary;
	private int numberOfFamily;
	private double allowance;
	
	public Employee() {
		
	}
	
	public Employee(String name, double coefficientsSalary, int numberOfFamily, double allowance) {
		this.name = name;
		this.coefficientsSalary = coefficientsSalary;
		this.numberOfFamily = numberOfFamily;
		this.allowance = allowance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}
	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public int getNumberOfFamily() {
		return numberOfFamily;
	}
	
	public void setNumberOfFamily(int numberOfFamily) {
		this.numberOfFamily = numberOfFamily;
	}
	
	public double getAllowance() {
		return allowance;
	}
	
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	/**
	 * Function: calculating salary of employee
	 * Input: No
	 * Output: salary of employee
	 */
	public double calSalary() {
		double result = coefficientsSalary * BASICSALARY + allowance;
		return result;
	}
	
	/**
	 * Function: calculating taxable salary of employee
	 * Input: No
	 * Output: taxable salary of employee
	 */
	public double calTaxableSalary() {
		double result = calSalary() - TAXABLEBASICSALARY - numberOfFamily * ALLOWANCEFAMILY;
		return result;
	}
	
	/**
	 * Function: calculating personal taxes of employee
	 * Input: No
	 * Output: personal taxes of employee
	 */
	public double calPersonalTaxes() {
		double result = 0;
		if (calTaxableSalary() < PersonalTaxesRates.LEVEL2.getTaxableSalaryStart())
			result = calTaxableSalary() * PersonalTaxesRates.LEVEL1.getTax();
		else if (calTaxableSalary() < PersonalTaxesRates.LEVEL3.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ (calTaxableSalary() - PersonalTaxesRates.LEVEL1.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL2.getTax();
		else if (calTaxableSalary() < PersonalTaxesRates.LEVEL4.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ (calTaxableSalary() - PersonalTaxesRates.LEVEL2.getTaxableSalaryEnd()) 
							* PersonalTaxesRates.LEVEL3.getTax();
		else if (calTaxableSalary() < PersonalTaxesRates.LEVEL5.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL3.getMaxtaxableSalary() +
						+ (calTaxableSalary() - PersonalTaxesRates.LEVEL3.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL4.getTax();
		else if (calTaxableSalary() < PersonalTaxesRates.LEVEL6.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL3.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL4.getMaxtaxableSalary()
						+ (calTaxableSalary() - PersonalTaxesRates.LEVEL4.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL5.getTax();
		else if (calTaxableSalary() < PersonalTaxesRates.LEVEL7.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL3.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL4.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL5.getMaxtaxableSalary()
						+ (calTaxableSalary() - PersonalTaxesRates.LEVEL5.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL6.getTax();
		else 
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL3.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL4.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL5.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL6.getMaxtaxableSalary()
						+ (calTaxableSalary() - PersonalTaxesRates.LEVEL6.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL7.getTax();
		
		return result;
			
	}
	
	/**
	 * Function: calculating real salary of employee
	 * Input: No
	 * Output: real salary of employee
	 */
	public double calRealSalary() {
		double result = calSalary() - calPersonalTaxes();
		return result;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###.00");
		String result = name + "\t" + coefficientsSalary + "\t" 
				+ numberOfFamily + "\t" + allowance
				+ df.format(calSalary()) + "\t"
				+ df.format(calTaxableSalary()) + "\t" 
				+ df.format(calPersonalTaxes()) + "\t" 
				+ df.format(calRealSalary()) + "\n";
		return result;
	}
}
