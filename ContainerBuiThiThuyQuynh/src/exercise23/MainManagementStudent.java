package exercise23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class handles for others classes about management student
 */
public class MainManagementStudent {
	
	/**
	 * @description function show menu for user choose
	 * @param0 input 
	 * @param1 managementStudent
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void showMenu(BufferedReader input, ManagementStudent managementStudent) throws NumberFormatException, IOException {
		// Show menu
		System.out.println("======== MENU ==========");
		System.out.println("1. View list student");
		System.out.println("2. Add student");
		System.out.println("3. Search student by id");
		System.out.println("4. Remove student");
		System.out.println("5. Exit");
		
		// Check choosing of user and show information for corresponding action 
		int choose = Integer.parseInt(input.readLine());
		while (choose <= 0 || choose > 5) {
			System.out.println("Please choose from 1 to 5");
			System.out.println("1. View list student");
			System.out.println("2. Add student");
			System.out.println("3. Search student by id");
			System.out.println("4. Remove student");
			System.out.println("5. Exit");
			choose = Integer.parseInt(input.readLine());
		}
		
		switch (choose) {
		case 1:
			viewListStudent(managementStudent, input);
			break;
		case 2:
			addStudent(managementStudent, input);
			break;
		case 3:
			searchStudent(managementStudent, input);
			break;
		case 4:
			removeStudent(managementStudent, input);
			break;
		case 5:
		default:
			System.out.println("Application ended");
			break;
		}
	}

	/**
	 * @description show information for addition new student to list student
	 * @param managementStudent
	 * @param input
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void viewListStudent(ManagementStudent managementStudent, BufferedReader input) throws NumberFormatException, IOException {
		// Check list student not null --> show list student
		// Else application ask user want to add new student or not. 
		// 		If user choose yes, application will allow user add new student to list
		if (managementStudent.getListStudent().size() != 0)
			System.out.println(managementStudent.toString());
		else {
			System.out.println("List student do not have any student");
			
			System.out.println("Do you add new student to list?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you add new student to list?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				addStudent(managementStudent, input);
				break;
			case 2:
			default:
				break;
			}
		}
		
		showMenu(input, managementStudent);
	}
	
	/**
	 * @description show information for addition new student to list student
	 * @param managementStudent
	 * @param input
	 * @throws IOException
	 */
	public static void addStudent(ManagementStudent managementStudent, BufferedReader input) throws IOException {
		boolean again = true;
		Student student;
		
		// Enter the information for new student and allow user continue entering if user want
		while (again) {
			System.out.println("Enter id: ");
			String id = input.readLine();
			
			System.out.println("Enter name: ");
			String name = input.readLine();
			
			System.out.println("Enter address: ");
			String address = input.readLine();
			
			System.out.println("Enter phone number: ");
			String phoneNumber = input.readLine();
			
			student = new Student(name, phoneNumber, address);
			managementStudent.addStudent(id, student);
			viewListStudent(managementStudent, input);
			
			System.out.println("Do you continue add new student?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose <= 0 || choose > 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you continue add new student?");
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
		
		showMenu(input, managementStudent);
	}

	/**
	 * @description show information for searching student in list student
	 * @param managementStudent
	 * @param input
	 * @throws IOException
	 */
	public static void searchStudent(ManagementStudent managementStudent, BufferedReader input) throws IOException {
		// Check list word in dictionary is null --> allow user add new student to list student
		// Else application require user enter key word for searching and show result. 
		if (managementStudent.getListStudent().size() == 0)
			viewListStudent(managementStudent, input);
		else {
			System.out.println("Enter id of student want to search: ");
			String id = input.readLine();
			
			Student studentFound = managementStudent.searchStudent(id);
			
			System.out.println("Search result: ");
			if (studentFound == null)
				System.out.println("Student have ID is " + id + " was not found");
			else
				System.out.println(studentFound.toString());
			showMenu(input, managementStudent);
		}
	}

	/**
	 * @description show information for deletion student in list student
	 * @param managementStudent
	 * @param input
	 * @throws IOException
	 */
	public static void removeStudent(ManagementStudent managementStudent, BufferedReader input) throws IOException {
		// Check list word in dictionary is null --> allow user add new student to list student
		// Else application require user enter key word for deleting and show result. 
		if (managementStudent.getListStudent().size() == 0)
			viewListStudent(managementStudent, input);
		else {
			System.out.println("Enter id of student want to remove: ");
			String id = input.readLine();
			
			System.out.println("Remove result:");
			System.out.println(managementStudent.deleteStudent(id));
			viewListStudent(managementStudent, input);
			showMenu(input, managementStudent);
		}
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		ManagementStudent managementStudent = new ManagementStudent();
		try {
			showMenu(input, managementStudent);
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
