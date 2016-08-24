/**
 * Author: Bui Thi Thuy Quynh
 * Date: 24/08/2016
 * Version: 1.0
 * 
 *  Class manages the employee included business employee and production employee
 */

package exercise113;

public class ManagementEmployee {

	BusinessEmployee[] listBusinessEmployee;
	ProductionEmployee[] listProductionEmployee;
	
	public ManagementEmployee() {
		
	}

	public ManagementEmployee(BusinessEmployee[] listBusinessEmployee,
			ProductionEmployee[] listProductionEmployee) {
		this.listBusinessEmployee = listBusinessEmployee;
		this.listProductionEmployee = listProductionEmployee;
	}

	public BusinessEmployee[] getListBusinessEmployee() {
		return listBusinessEmployee;
	}

	public void setListBusinessEmployee(BusinessEmployee[] listBusinessEmployee) {
		this.listBusinessEmployee = listBusinessEmployee;
	}

	public ProductionEmployee[] getListProductionEmployee() {
		return listProductionEmployee;
	}

	public void setListProductionEmployee(ProductionEmployee[] listProductionEmployee) {
		this.listProductionEmployee = listProductionEmployee;
	}
	
	/**
	 * Function: average salary of business employee
	 * Input: no
	 * Output: average salary of business employee
	 */
	public double averageSalaryBusinessEmployee() {
		double totalSalary = 0;
		if (listBusinessEmployee.length == 0)
			return 0;
		for (int i = 0; i < listBusinessEmployee.length; i++) {
			totalSalary += listBusinessEmployee[i].calSalary();
		}
		
		return totalSalary / listBusinessEmployee.length;
	}
	
	/**
	 * Function: average salary of production employee
	 * Input: no
	 * Output: average salary of production employee
	 */
	public double averageSalaryProductionEmployee() {
		double totalSalary = 0;
		if (listProductionEmployee.length == 0)
			return 0;
		for (int i = 0; i < listProductionEmployee.length; i++) {
			totalSalary += listProductionEmployee[i].calSalary();
		}
		
		return totalSalary / listProductionEmployee.length;
	}
	
	@Override
	public String toString() {
		String result = "========= LIST OF BUSINESS EMPLOYEE ============";
		for (int i = 0; i < listBusinessEmployee.length; i++) {
			result += listBusinessEmployee[i].toString();
			result += "-----------------------\n";
		}
		
		result += "========= LIST OF PRODUCTION EMPLOYEE ============";
		for (int i = 0; i < listProductionEmployee.length; i++) {
			result += listProductionEmployee[i].toString();
			result += "-----------------------\n";
		}
		
		result += "============================\n";
		result += "Average salary of business employee: " + this.averageSalaryBusinessEmployee() + "\n";
		result += "Average salary of production employee: " + this.averageSalaryProductionEmployee() + "\n";
		return result;
	}
}
