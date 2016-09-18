package exercise72;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class handles list employees which was read from XML file.
 */
public class MainEmployeeManagement {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new 
				InputStreamReader(System.in));
		String filePathDepartment = "src/exercise72/department.xml";
		String filePathEmployee = "src/exercise72/employee.xml";
		
		DepartmentManagement departmentMana;
		EmployeeManagement employeeMana;
		try {
			departmentMana = new DepartmentManagement(filePathDepartment);
			employeeMana = new EmployeeManagement(filePathEmployee);
			
			boolean again = true;
			while (again) {
				// Show list department for user choose
				System.out.print(departmentMana.toString());
				System.out.println("Choose department:");
				int departmentId = Integer.parseInt(input.readLine());
				
				while (departmentId <= 0  || departmentId > departmentMana.getDepartments().size()) {
					System.out.println("Choose again.");
					System.out.println(departmentMana.toString());
					departmentId = Integer.parseInt(input.readLine());
				}
				
				// Display list employee in this department
				System.out.println(employeeMana.printListEmployee(departmentId));
				
				// Enter the information of a new employee
				System.out.println("==== Add new employee ======");
				System.out.println("Enter id: ");
				int id = Integer.parseInt(input.readLine());
				
				System.out.println("Enter name: ");
				String name = input.readLine();
				
				System.out.println("Sex: ");
				System.out.println("0. Female");
				System.out.println("1. Male");
				int sex = Integer.parseInt(input.readLine());
				
				while (sex != 0 && sex != 1) {
					System.out.println("Choose again");
					System.out.println("Sex: ");
					System.out.println("0. Female");
					System.out.println("1. Male");
					sex = Integer.parseInt(input.readLine());
				}
				
				System.out.println("Enter birth date (yyyy-MM-dd): ");
				String birthDate = input.readLine();
				
				System.out.println("Enter salary: ");
				double salary = Double.parseDouble(input.readLine());
				
				while (salary < 0) {
					System.out.println("Salary invalid. Enter again");
					System.out.println("Enter salary: ");
					salary = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Enter address: ");
				String address = input.readLine();
				
				Employee employee = new Employee(id, name, sex,
						birthDate, salary, address, departmentId);
				
				// Add new employee to list and write it to file
				employeeMana.addEmployee(employee);
				employeeMana.writeContact(filePathEmployee);
				
				// Continue add new employee or not.
				System.out.println("Press [q] to exit. Other key to continue");
				String temp = input.readLine();
				
				if ("q".equals(temp) || "Q".equals(temp))
					again = false;
			}
			
		}
		catch (IOException | ParserConfigurationException 
				| SAXException | TransformerException e) {
			System.out.println("Error: " + e);
		}
		

	}

}
