package exercise63;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class manages the information of an student.
 */
public class SummarizingYear {
	
	/**
	 * This method is used to read list student from text file.
	 * @param filePath This is path of text file.
	 * @return List<Student> This is list student in text file.
	 */
	public static List<Student> readFile(String filePath) {
		List<Student> result = new ArrayList<Student>();
		Student student;
		
		try (DataInputStream in = new DataInputStream(new 
				BufferedInputStream(new FileInputStream(filePath)))) {
			while (in.available() > 0) {
				
				// Get information of a student
				student = new Student();
				student.setName(in.readUTF());
				student.setGrade(in.readUTF());
				student.setMark1(in.readDouble());
				student.setMark2(in.readDouble());

				// Add student to list
				result.add(student);
			}
			
			in.close();
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
		
		return result;
	}
	
	/**
	 * This method is used to write information of student to text file.
	 * @param filePath This is path of text file.
	 * @param student Student is added.
	 * @return Nothing.
	 */
	public static void writeFile(String filePath, Student student) {
		try (DataOutputStream out = new DataOutputStream(new 
				BufferedOutputStream(new FileOutputStream(filePath, true)))){
			out.writeUTF(student.getName());
			out.writeUTF(student.getGrade());
			out.writeDouble(student.getMark1());
			out.writeDouble(student.getMark2());
			System.out.println("Student was recorded");
			
			out.close();
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex);
		}
	}
	
	/**
	 * This method is used to add a student 
	 * 		and write the information of this student to text file.
	 * @param filePath This is path of text file.
	 * @return Nothing.
	 */
	public static void addStudent(BufferedReader input, String filePath) throws IOException {
		// Enter the information of student
		System.out.println("Enter name");
		String name = input.readLine();
		
		System.out.println("Choose grade");
		System.out.println("10. Grade 10");
		System.out.println("11. Grade 11");
		System.out.println("12. Grade 12");
		
		String grade = input.readLine();
		while (!"10".equals(grade) && !"11".equals(grade)
				&& !"12".equals(grade)) {
			System.out.println("Choose again");
			System.out.println("Choose grade");
			System.out.println("10. Grade 10");
			System.out.println("11. Grade 11");
			System.out.println("13. Grade 12");
			
			grade = input.readLine();
		}
		
		System.out.println("Enter mark of semester 1: ");
		double mark1 = Double.parseDouble(input.readLine());
		
		while (mark1 < 0 || mark1 > 10) {
			System.out.println("Mark is not validate");
			System.out.println("Enter mark of semester 1: ");
			mark1 = Double.parseDouble(input.readLine());
		}
		
		System.out.println("Enter mark of semester 2: ");
		double mark2 = Double.parseDouble(input.readLine());
		
		while (mark2 < 0 || mark2 > 10) {
			System.out.println("Mark is not validate");
			System.out.println("Enter mark of semester 2: ");
			mark2 = Double.parseDouble(input.readLine());
		}
		
		Student student = new Student(name, grade, mark1, mark2);
		// Add to student to file.
		writeFile(filePath, student);
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(
				new InputStreamReader(System.in));
		
		String filePath = "src/exercise63/liststudent.txt";
		List<Student> listStudentFile;
		StudentManagement students;
		try {
			boolean flag = true;
			while (flag) {
				// Show menu
				System.out.println("1. Add new student");
				System.out.println("2. View list student and result");
				System.out.println("3. Exit");
				
				String choose = input.readLine();
				while (!"1".equals(choose) && !"2".equals(choose)
						&& !"3".equals(choose)) {
					System.out.println("Choose again");
					System.out.println("1. Add new student");
					System.out.println("2. View list student and result");
					System.out.println("3. Exit");
					
					choose = input.readLine();
				}
				
				// Handling user's choice
				switch (choose) {
				case "1":
					addStudent(input, filePath);
					break;
				case "2":
					if (readFile(filePath).size() != 0) {
						listStudentFile = readFile(filePath);
						students = new StudentManagement(listStudentFile);
						System.out.println(students.toString());
					}
					else {
						System.out.println("Do you want to add student?");
						System.out.println("1. Yes");
						System.out.println("2. No");
						
						String temp = input.readLine();
						while (!"1".equals(temp) && !"2".equals(temp)) {
							System.out.println("Choose again");
							System.out.println("Do you want to add student?");
							System.out.println("1. Yes");
							System.out.println("2. No");
							
							temp = input.readLine();
						}
						switch (temp) {
						case "1":
							addStudent(input, filePath);
							listStudentFile = readFile(filePath);
							students = new StudentManagement(listStudentFile);
							break;
						case "2":
						default:
							break;
						}
						
					}
					break;
				case "3":
					flag = false;
					System.out.println("Application ended");
					break;
				default:
					break;
				}
			}
		}
		catch (IOException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
