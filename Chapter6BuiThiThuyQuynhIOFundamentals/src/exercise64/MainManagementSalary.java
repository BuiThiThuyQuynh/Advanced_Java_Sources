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

public class MainManagementSalary {
	
	static String filePath = "src/exercise64/employee.txt";
	static EmployeeManagement employeeMana;
	
	public static void addEmployee(BufferedReader input, String filePath) throws IOException {
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
		
		employeeMana.addEmployee(employee);
		employeeMana.writeFile(filePath);
	}
	
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
		
		String filePath = "src/exercise64/liststudent.txt";
		List<Employee> listEmployeeFile;
		
		try {
			boolean flag = true;
			employeeMana = new EmployeeManagement(filePath);
			while (flag) {
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
				
				switch (choose) {
				case "1":
					addEmployee(input, filePath);
					break;
				case "2":
					if (employeeMana.getEmployees().size() != 0) {
						listEmployeeFile = employeeMana.readFile(filePath);
						employeeMana = new EmployeeManagement(listEmployeeFile);
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
					if (employeeMana.readFile(filePath).size() != 0) {
						listEmployeeFile = employeeMana.readFile(filePath);
						employeeMana = new EmployeeManagement(listEmployeeFile);
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
					System.out.println("Application ended");
					break;
				default:
					break;
				}
			}
		}
		catch (IOException | NumberFormatException | ClassNotFoundException ex) {
			//System.out.println("Exception: " + ex);
			ex.printStackTrace();
		}
	}
}
