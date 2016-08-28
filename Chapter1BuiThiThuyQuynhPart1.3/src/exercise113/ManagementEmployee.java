/**
 * @author: Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 2.0
 */

package exercise113;

/**
 * @description class manages the employee included business employee and production employee
 */
public class ManagementEmployee {
	
	public ManagementEmployee() {
		
	}
	
	/**
	 * @description average salary of employee
	 * @return average salary of employee
	 */
	public double averageSalary(Employee[] employees) {
		double totalSalary = 0;
		if (employees.length == 0)
			return 0;
		for (int i = 0; i < employees.length; i++) {
			totalSalary += employees[i].calSalary();
		}
		
		return totalSalary / employees.length;
	}
	
	/**
	 * @description function for get all information of array employees
	 * @return string about the information of array employees
	 */
	public String printInformation(Employee[] employees) {
		String result = "";
		for (int i = 0; i < employees.length; i++) {
			result += employees[i].toString();
			result += "-----------------------\n";
		}
		
		return result;
	}
}
