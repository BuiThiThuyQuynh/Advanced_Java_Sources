/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 2.0
 */

package exercise113;

/**
 * @description class manages the information of an production employee, extends from Employee
 */
public class ProductionEmployee extends Employee {

	private final int PRODUCTLEVEL = 1000;
	private final double BONUSRATE = 0.05;
	
	private double quantityProduct;
	
	public ProductionEmployee() {
		
	}
	
	public ProductionEmployee(String name, double coefficientsSalary, int numberOfFamily, 
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
	 * @description calculating salary bonus of employee
	 * @return salary bonus of employee
	 */
	@Override
	public double calSalaryBonus() {
		return (this.quantityProduct - this.PRODUCTLEVEL) * this.BONUSRATE;
	}
	
	/**
	 * @description function for get all information of a production employee
	 * @return string about the information of a production employee
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Quantity product:" + this.quantityProduct + "\n";
		return result;
	}
}
