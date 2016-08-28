/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 2.0
 */

package exercise113;

/**
 * @descrition class manages the information of an employee
 */
public class Employee {
	
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
	 * @description calculating salary of employee
	 * @return salary of employee
	 */
	public double calSalary() {
		double result = coefficientsSalary * BASICSALARY + calSalaryBonus();
		return result;
	}
	
	/**
	 * @description calculating salary bonus of employee
	 * @return salary bonus of employee
	 */
	public double calSalaryBonus() {
		return 0;
	}
	
	/**
	 * @description calculating taxable salary of employee
	 * @return taxable salary of employee
	 */
	public double calTaxableSalary() {
		double result = calSalary() - TAXABLEBASICSALARY - numberOfFamily * ALLOWANCEFAMILY;
		return result > 0 ? result : 0;
	}
	
	/**
	 * @description calculating personal taxes of employee
	 * @return personal taxes of employee
	 */
	public double calPersonalTaxes() {
		double result = 0;
		double taxableSalary = calTaxableSalary();
		if (taxableSalary < PersonalTaxesRates.LEVEL2.getTaxableSalaryStart())
			result = taxableSalary * PersonalTaxesRates.LEVEL1.getTax();
		else if (taxableSalary < PersonalTaxesRates.LEVEL3.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ (taxableSalary - PersonalTaxesRates.LEVEL1.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL2.getTax();
		else if (taxableSalary < PersonalTaxesRates.LEVEL4.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ (taxableSalary - PersonalTaxesRates.LEVEL2.getTaxableSalaryEnd()) 
							* PersonalTaxesRates.LEVEL3.getTax();
		else if (taxableSalary < PersonalTaxesRates.LEVEL5.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL3.getMaxtaxableSalary() +
						+ (taxableSalary - PersonalTaxesRates.LEVEL3.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL4.getTax();
		else if (taxableSalary < PersonalTaxesRates.LEVEL6.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL3.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL4.getMaxtaxableSalary()
						+ (taxableSalary - PersonalTaxesRates.LEVEL4.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL5.getTax();
		else if (taxableSalary < PersonalTaxesRates.LEVEL7.getTaxableSalaryStart())
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL3.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL4.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL5.getMaxtaxableSalary()
						+ (taxableSalary - PersonalTaxesRates.LEVEL5.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL6.getTax();
		else 
			result = PersonalTaxesRates.LEVEL1.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL2.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL3.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL4.getMaxtaxableSalary()
						+ PersonalTaxesRates.LEVEL5.getMaxtaxableSalary() 
						+ PersonalTaxesRates.LEVEL6.getMaxtaxableSalary()
						+ (taxableSalary - PersonalTaxesRates.LEVEL6.getTaxableSalaryEnd()) 
								* PersonalTaxesRates.LEVEL7.getTax();
		
		return result;
			
	}
	
	/**
	 * @description calculating real salary of employee
	 * @return real salary of employee
	 */
	public double calRealSalary() {
		double result = calSalary() - calPersonalTaxes();
		return result > 0 ? result : 0;
	}
	
	/**
	 * @description function for get all information of a employee
	 * @return string about the information of a employee
	 */
	@Override
	public String toString() {
		String result = "Name: " + this.name + "\n";
		result += "Pay rate: " + this.coefficientsSalary + "\n";
		result += "Number of family: " + this.numberOfFamily + "\n";
		result += "Fringe benefits: " + this.allowance + "\n";
		return result;
	}
}
