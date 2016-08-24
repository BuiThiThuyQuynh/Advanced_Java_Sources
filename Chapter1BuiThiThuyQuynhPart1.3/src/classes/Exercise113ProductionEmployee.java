/**
 * Author: Bui Thi Thuy Quynh
 * Date: 24/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an production employee, extends from Exercise113Employee
 */

package classes;

public class Exercise113ProductionEmployee extends Exercise113Employee {

	private final int PRODUCTLEVEL = 1000;
	private final double BONUSRATE = 0.05;
	
	private double quantityProduct;
	
	public Exercise113ProductionEmployee() {
		
	}
	
	public Exercise113ProductionEmployee(String name, double coefficientsSalary, int numberOfFamily, 
			double allowance, double quantityProduct) {
		super(name, coefficientsSalary, numberOfFamily, allowance);
		this.quantityProduct = quantityProduct;
	}
	
	public double getQuantityProduct() {
		return quantityProduct;
	}

	public void setQuantityProduct(double quantityProduct) {
		this.quantityProduct = quantityProduct;
	}

	/**
	 * Function: calculation salary bonus
	 * Input: no
	 * Output: salary bonus of production employee
	 */
	public double calSalaryBonus() {
		return (this.quantityProduct - this.PRODUCTLEVEL) * this.BONUSRATE;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Quantity product:" + this.quantityProduct + "\n";
		return result;
	}
	
	@Override
	public double calSalary() {
		double result = super.calSalary() + this.calSalaryBonus();
		return result;
	}
}
