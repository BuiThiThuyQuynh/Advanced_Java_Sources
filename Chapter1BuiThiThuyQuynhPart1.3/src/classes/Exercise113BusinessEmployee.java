/**
 * Author: Bui Thi Thuy Quynh
 * Date: 24/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an business employee, extends from Exercise113Employee
 */

package classes;

public class Exercise113BusinessEmployee extends Exercise113Employee {

	private double payBusinessMonth;
	private double businessPayRate;
	
	public Exercise113BusinessEmployee() {
		
	}
	
	public Exercise113BusinessEmployee(String name, double coefficientsSalary, int numberOfFamily, double allowance,
				double payBusinessMonth, double businessPayRate) {
		super(name, coefficientsSalary, numberOfFamily, allowance);
		this.payBusinessMonth = payBusinessMonth;
		this.businessPayRate = businessPayRate;
	}

	public double getPayBusinessMonth() {
		return payBusinessMonth;
	}

	public void setPayBusinessMonth(double payBusinessMonth) {
		this.payBusinessMonth = payBusinessMonth;
	}

	public double getBusinessPayRate() {
		return businessPayRate;
	}

	public void setBusinessPayRate(double businessPayRate) {
		this.businessPayRate = businessPayRate;
	}
	
	/**
	 * Function: calculation salary bonus
	 * Input: no
	 * Output: salary bonus of business employee
	 */
	public double calSalaryBonus() {
		return this.payBusinessMonth * this.businessPayRate;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Business salary of month:" + this.payBusinessMonth + "\n";
		result += "Business salary rate of month:" + this.businessPayRate + "\n";
		return result;
	}
	
	@Override
	public double calSalary() {
		double result = super.calSalary() + this.calSalaryBonus();
		return result;
	}
}
