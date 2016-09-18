/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise16Employee class
 */

package exercise64;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class handles list employees which was read from text file.
 */
public class MainManagementSalary {
	
	static String filePath = "src/exercise64/employee.txt";
	static EmployeeManagement employeeMana;
	
	/**
	 * This method is used to add new employee object to file.
	 * @param input
	 * @param filePath This is path of text file.
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void addEmployee(BufferedReader input, String filePath) throws IOException, ClassNotFoundException {
		// Enter the information of employee.
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
		
		System.out.println("Enter allowance: ");
		double allowance = Double.parseDouble(input.readLine());
		
		while (allowance < 0) {
			System.out.println("Allowance must be greater than or equal to 0");
			System.out.println("Enter allowance: ");
			allowance = Double.parseDouble(input.readLine());
		}
		
		Employee employee = new Employee(name, coefficientsSalary, 
				numberOfFamily, allowance);
		
		// Add employee to list employee and write it to file.
		employeeMana.addEmployee(employee);
		employeeMana.writeFile(filePath);
		System.out.println(employeeMana.toString());
	}
	
	/**
	 * This method is used to search a employee
	 * @param input
	 * @param employees This is class manages list employee.
	 * @throws IOException
	 */
	public static void searchEmployee(BufferedReader input,
			EmployeeManagement employees) throws IOException {
		System.out.println("Enter key word (name of employee): ");
		String name = input.readLine();
		
		List<Employee> searchResult = employees.searchEmployee(name);
		
		System.out.println("======= Search result ==========");
		searchResult.stream().forEach(System.out::println);
		
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(
				new InputStreamReader(System.in));
		
		try {
			boolean flag = true;
			employeeMana = new EmployeeManagement(filePath);
			while (flag) {
				// Show menu for user choose
				System.out.println("1. Add new employee");
				System.out.println("2. View list employee");
				System.out.println("3. Search employee by name");
				System.out.println("4. Exit");
				
				String choose = input.readLine();
				while (!"1".equals(choose) && !"2".equals(choose)
						&& !"3".equals(choose) && !"4".equals(choose)) {
					System.out.println("Choose again");
					System.out.println("1. Add new employee");
					System.out.println("2. View list employee");
					System.out.println("3. Search employee by name");
					System.out.println("4. Exit");
					
					choose = input.readLine();
				}
				
				// Display user's choice
				switch (choose) {
				case "1":
					addEmployee(input, filePath);
					break;
				case "2":
					if (employeeMana.getEmployees().size() != 0) {
						System.out.println(employeeMana.toString());
					}
					else {
						System.out.println("Do you want to add employee?");
						System.out.println("1. Yes");
						System.out.println("2. No");
						
						String temp = input.readLine();
						while (!"1".equals(temp) && !"2".equals(temp)) {
							System.out.println("Choose again");
							System.out.println("Do you want to add employee?");
							System.out.println("1. Yes");
							System.out.println("2. No");
							
							temp = input.readLine();
						}
						switch (temp) {
						case "1":
					 		addEmployee(input, filePath);
							break;
						case "2":
						default:
							break;
						}
						
					}
					break;
				case "3":
					if (employeeMana.getEmployees().size() != 0) {
						searchEmployee(input, employeeMana);
					}
					else {
						System.out.println("Do you want to add employee?");
						System.out.println("1. Yes");
						System.out.println("2. No");
						
						String temp = input.readLine();
						while (!"1".equals(temp) && !"2".equals(temp)) {
							System.out.println("Choose again");
							System.out.println("Do you want to add employee?");
							System.out.println("1. Yes");
							System.out.println("2. No");
							
							temp = input.readLine();
						}
						switch (temp) {
						case "1":
							addEmployee(input, filePath);
							break;
						case "2":
						default:
							break;
						}
						
					}
					break;
				case "4":
					flag = false;
					employeeMana.writeFile(filePath);
					System.out.println("Application ended");
					break;
				default:
					break;
				}
			}
		}
		catch (IOException | NumberFormatException | ClassNotFoundException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
