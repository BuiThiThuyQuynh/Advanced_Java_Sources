/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class handles for Exercise110Student class, Exercise110Teacher class and Exercise110ManagementHuman class
 */

package exercise110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainManagementInformation {
	
	/**
	 * Function: check format of phone number
	 * Input: phone
	 * Output: phone number is correct format or not
	 */
	public static boolean checkPhone(String phone) {
		Pattern pattern = Pattern.compile("^[0][89][0-9]{8}|[0][1][0-9]{9}$");
		Matcher matcher = pattern.matcher(phone);
		return matcher.matches();
	}
	
	public static void printArray(Human[] human) {
		System.out.println("===============================");
		for (int i = 0; i < human.length; i++) {
			System.out.println(human[i].toString());
			System.out.println("------------------------");
		}
	}

	public static void main(String[] args) {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Human[] human = new Human[0];
		
		Student student;
		Teacher teacher;
		
		boolean flag = true;
		try {
			while (flag) {
				System.out.println("ENTER GENERAL INFORMATION OF A PERSON");
				System.out.println("Enter name:");
				String name = input.readLine();
				
				System.out.println("Enter day of birth (dd/MM/yyyy):");
				String date = input.readLine();
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				dateFormat.setLenient(false);
				
				Date dateOfBirth = dateFormat.parse(date);
				
				
				System.out.println("Enter address:");
				String address = input.readLine();
				
				System.out.println("Enter phone number:");
				String phone = input.readLine();
				
				while (!checkPhone(phone)) {
					System.out.println("Phone is wrong format. Please enter again");
					System.out.println("Enter phone number:");
					phone = input.readLine();
				}
				
				System.out.println("CHOOSE TYPE OF HUMAN");
				System.out.println("1. Teacher");
				System.out.println("2. Student");
				int choose = Integer.parseInt(input.readLine());
				while (choose !=1 && choose != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("CHOOSE TYPE OF HUMAN");
					System.out.println("1. Teacher");
					System.out.println("2. Student");
					choose = Integer.parseInt(input.readLine());
				}

				switch (choose) {
					case 1:
						System.out.println("Enter class of homeroom:");
						String classHomeroom = input.readLine();
						
						System.out.println("Enter pay rate:");
						double payRate = Double.parseDouble(input.readLine());
						
						while (payRate < 0) {
							System.out.println("Pay rate of pin must be greater than or equal to 0");
							System.out.println("Enter pay rate:");
							payRate = Double.parseDouble(input.readLine());
						}
						
						System.out.println("Enter fringe benefits:");
						double fringeBenefits = Double.parseDouble(input.readLine());
						
						while (fringeBenefits < 0) {
							System.out.println("Fringe benefits must be greater than or equal to 0");
							System.out.println("Enter fringe benefits:");
							fringeBenefits = Double.parseDouble(input.readLine());
						}
						
						human = Arrays.copyOf(human, human.length + 1);
						teacher = new Teacher(name, dateOfBirth, address, phone, 
										classHomeroom, payRate, fringeBenefits);
						human[human.length - 1] = teacher;
						
						break;
					case 2:
						System.out.println("Enter class of student:");
						String studentOfClass = input.readLine();
						
						System.out.println("Enter score of semester 1:");
						double semester1Score = Double.parseDouble(input.readLine());
						
						while (semester1Score <= 0 || semester1Score > 10) {
							System.out.println("Score must be greater than 0 and less than or equal to 10");
							System.out.println("Enter score of semester 1:");
							semester1Score = Double.parseDouble(input.readLine());
						}
						
						System.out.println("Enter score of semester 2:");
						double semester2Score = Double.parseDouble(input.readLine());
						
						while (semester2Score <= 0 || semester2Score > 10) {
							System.out.println("Score must be greater than 0 and less than or equal to 10");
							System.out.println("Enter score of semester 2:");
							semester2Score = Double.parseDouble(input.readLine());
						}
						
						human = Arrays.copyOf(human, human.length + 1);
						student = new Student(name, dateOfBirth, address, phone,
								studentOfClass, semester1Score, semester2Score);
						human[human.length - 1] = student;
						
						break;
				}
				
				printArray(human);
				
				int flagAddNewHuman = 0;
				while (flagAddNewHuman == 0) {
					System.out.println("Are you add a new computer [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flagAddNewHuman = 1;
						break;
					case "n":
					case "N":
						flagAddNewHuman = 2;
						flag = false;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flagAddNewHuman == 1) {
					continue;
				}
				else {
					System.out.println("The end");
					break;
				}
			}
			
		}
		catch (IOException | NumberFormatException | ParseException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
