package exercise25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class handles for others classes about management employee
 */
public class MainManagementEmployee {

	/**
	 * @description function show menu for user choose
	 * @param input
	 * @param managementEmployee
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void showMenu(final BufferedReader input, 
			final ManagementEmployee managementEmployee) 
					throws NumberFormatException, IOException {
		// Show menu
		System.out.println("======== MENU ==========");
		System.out.println("1. View list employee");
		System.out.println("2. Add employee");
		System.out.println("3. Exit");
		
		// Check choosing of user and show information for corresponding action 
		int choose = Integer.parseInt(input.readLine());
		final int chooseEnd = 3;
		while (choose <= 0 || choose > chooseEnd) {
			System.out.println("Please choose from 1 to 3");
			System.out.println("1. View list employee");
			System.out.println("2. Add employee");
			System.out.println("3. Exit");
			choose = Integer.parseInt(input.readLine());
		}
		
		switch (choose) {
		case 1:
			viewListEmployee(managementEmployee, input);
			break;
		case 2:
			addEmployee(managementEmployee, input);
			break;
		case 3:
		default:
			System.out.println("Application ended");
			break;
		}
	}

	/**
	 * @description show information for addition new employee to list employee
	 * @param managementEmployee
	 * @param input
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void viewListEmployee(
			final ManagementEmployee managementEmployee,
			final BufferedReader input) throws NumberFormatException, IOException {
		// Check list employee not null --> show list employee
		// Else application ask user want to add new employee or not. 
		// 		If user choose yes, application will allow user add new employee
		//				to list employee
		if (managementEmployee.getListEmployee().size() != 0) {
			System.out.println(managementEmployee.toString());
		}
		else {
			System.out.println("List employee do not have any employee");
			
			System.out.println("Do you add new employee to list?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you add new employee to list?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				addEmployee(managementEmployee, input);
				break;
			case 2:
			default:
				break;
			}
		}
		
		showMenu(input, managementEmployee);
	}
	
	/**
	 * @description show list employee
	 * @param managementEmployee
	 * @param input
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void showListEmployee(
			final ManagementEmployee managementEmployee,
			final BufferedReader input) throws NumberFormatException, IOException {
		System.out.println(managementEmployee.toString());
	}
	
	/**
	 * @description show information for addition new student to list student
	 * @param managementEmployee
	 * @param input
	 * @throws IOException
	 */
	public static void addEmployee(ManagementEmployee managementEmployee,
			BufferedReader input) throws IOException {
		boolean again = true;
		Employee employee;
		
		// Enter the information for new employee 
		//		and allow user continue entering if user want
		while (again) {
			System.out.println("Enter id: ");
			String id = input.readLine();
			
			System.out.println("Enter name: ");
			String name = input.readLine();
			
			System.out.println("Enter age: ");
			int age = Integer.parseInt(input.readLine());
			
			while (age < 18 ||  age > 60) {
				System.out.println("Age must be greater than or "
						+ "equal to 18 and less than 60");
				System.out.println("Enter age: ");
				age = Integer.parseInt(input.readLine());
			}
			
			System.out.println("Enter salary: ");
			double salary = Double.parseDouble(input.readLine());
			
			while (salary < 0) {
				System.out.println("Age must be greater than or equal to 0");
				System.out.println("Enter salary: ");
				salary = Double.parseDouble(input.readLine());
			}
			
			employee = new Employee(name, age, salary);
			managementEmployee.addStudent(id, employee);
			showListEmployee(managementEmployee, input);
			
			System.out.println("Do you continue add new employee?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you continue add new employee?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				continue;
			case 2:
			default:
				again = false;
				break;
			}
		}
		
		showMenu(input, managementEmployee);
	} // End addEmployee function
	
	public static void main(final String[] args) {
		BufferedReader input = new BufferedReader(
				new InputStreamReader(System.in));
		
		ManagementEmployee managementEmployee = new ManagementEmployee();
		try {
			showMenu(input, managementEmployee);
		} catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
