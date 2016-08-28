/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 2.0
 */

package exercise113;

/**
 * @description class manages the information of an business employee, extends from Employee class
 */
public class BusinessEmployee extends Employee {

	private double payBusinessMonth;
	private double businessPayRate;
	
	public BusinessEmployee() {
		
	}
	
	public BusinessEmployee(String name, double coefficientsSalary, int numberOfFamily, double allowance,
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
	 * @description calculating salary bonus of employee
	 * @return salary bonus of employee
	 */
	public double calSalaryBonus() {
		return this.payBusinessMonth * this.businessPayRate;
	}
	
	/**
	 * @description function for get all information of a production employee
	 * @return string about the information of a production employee
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Business salary of month:" + this.payBusinessMonth + "\n";
		result += "Business salary rate of month:" + this.businessPayRate + "\n";
		return result;
	}
}
