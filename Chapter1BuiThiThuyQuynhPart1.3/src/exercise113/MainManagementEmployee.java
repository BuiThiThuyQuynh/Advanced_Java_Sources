/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 2.0
 */

package exercise113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @description class handles for BusinessEmployee class, ProductionEmployee, Employee class class and ManagementEmployee class
 */
public class MainManagementEmployee {
	
	/**
	 * @description function for printing the information of array employees
	 */
	public static void printInformation(ManagementEmployee employees, ProductionEmployee[] procEmployees, BusinessEmployee[] businessEmployee) {
		DecimalFormat format = new DecimalFormat("#,###");
		System.out.println("========== INFORMATION OF PRODUCTION EMPLOYEES ===========");
		System.out.print(employees.printInformation(procEmployees));
		System.out.println("========== INFORMATION OF REFERENCE BOOKS ===========");
		System.out.print(employees.printInformation(businessEmployee));
		System.out.println("======================");
		System.out.println("Average salary of production employees: " + format.format(employees.averageSalary(procEmployees)));
		System.out.println("Average salary of business employees: " + format.format(employees.averageSalary(businessEmployee)));
	}

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		BusinessEmployee[] listBusinessEmployee = new BusinessEmployee[0];
		ProductionEmployee[] listProductionEmployee = new ProductionEmployee[0];
		ManagementEmployee managementEmployee = new ManagementEmployee();
		
		BusinessEmployee businessEmployee;
		ProductionEmployee productionEmployee;
		
		boolean flag = true;
		try {
			/**
			 * enter the general information of a employee and allow entering again
			 */
			while (flag) {
				System.out.println("Enter full name of employee: ");
				String name = input.readLine();
				
				System.out.println("Enter coefficients salary: ");
				double coefficientsSalary = Double.parseDouble(input.readLine());
				
				while (coefficientsSalary < 0) {
					System.out.println("Coefficients salary must be greater than or equal to 0");
					System.out.println("Enter coefficients salary: ");
					coefficientsSalary = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Enter numbers of family: ");
				int numberOfFamily = Integer.parseInt(input.readLine());
				
				while (numberOfFamily < 0) {
					System.out.println("Numbers of family must be greater than or equal to 0");
					System.out.println("Enter numbers of family: ");
					numberOfFamily = Integer.parseInt(input.readLine());
				}
				
				System.out.println("Enter fringe benefits : ");
				double allowance = Double.parseDouble(input.readLine());
				
				while (allowance < 0) {
					System.out.println("Fringe benefits must be greater than or equal to 0");
					System.out.println("Enter fringe benefits : ");
					allowance = Double.parseDouble(input.readLine());
				}
				
				/**
				 * choose type of employee and enter the specific information
				 */
				System.out.println("CHOOSE TYPE OF EMPLOYEE");
				System.out.println("1. Business Employee");
				System.out.println("2. Production Employee");
				int choose = Integer.parseInt(input.readLine());
				while (choose !=1 && choose != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("CHOOSE TYPE OF EMPLOYEE");
					System.out.println("1. Business Employee");
					System.out.println("2. Production Employee");
					choose = Integer.parseInt(input.readLine());
				}

				switch (choose) {
					case 1:
						System.out.println("Enter business salary of month:");
						double payBusinessMonth = Double.parseDouble(input.readLine());
						
						while (payBusinessMonth < 0) {
							System.out.println("Business salary of month must be greater than or equal to 0");
							System.out.println("Enter business salary of month:");
							payBusinessMonth = Double.parseDouble(input.readLine());
						}
						
						System.out.println("Enter business salary rate of month:");
						double businessPayRate = Double.parseDouble(input.readLine());
						
						while (businessPayRate < 0) {
							System.out.println("Business salary rate of month must be greater than or equal to 0");
							System.out.println("Enter business salary rateof month:");
							businessPayRate = Double.parseDouble(input.readLine());
						}
						
						listBusinessEmployee = Arrays.copyOf(listBusinessEmployee, listBusinessEmployee.length + 1);
						businessEmployee = new BusinessEmployee(name, coefficientsSalary, 
											numberOfFamily, allowance, payBusinessMonth, businessPayRate);
						listBusinessEmployee[listBusinessEmployee.length - 1] = businessEmployee;
						
						break;
					case 2:
						System.out.println("Enter quantity product:");
						int quantityProduct = Integer.parseInt(input.readLine());
						
						while (quantityProduct <= 0) {
							System.out.println("Quantity product must be greater than 0");
							System.out.println("Enter quantity product:");
							quantityProduct = Integer.parseInt(input.readLine());
						}
						
						listProductionEmployee = Arrays.copyOf(listProductionEmployee, listProductionEmployee.length + 1);
						productionEmployee = new ProductionEmployee(name, coefficientsSalary,
													numberOfFamily, allowance, quantityProduct);
						listProductionEmployee[listProductionEmployee.length - 1] = productionEmployee;
						
						break;
				}
				
				/**
				 * printing list computer entered
				 */
				printInformation(managementEmployee, listProductionEmployee, listBusinessEmployee);
				
				/**
				 * ask if user want to add new computer
				 */
				int flagAddEmployee = 0;
				while (flagAddEmployee == 0) {
					System.out.println("Are you add a new computer [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flagAddEmployee = 1;
						break;
					case "n":
					case "N":
						flagAddEmployee = 2;
						flag = false;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flagAddEmployee == 1) {
					continue;
				}
				else {
					System.out.println("The end");
					break;
				}
			}
			
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
