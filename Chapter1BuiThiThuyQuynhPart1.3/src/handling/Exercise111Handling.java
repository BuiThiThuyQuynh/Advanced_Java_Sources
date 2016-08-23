/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class handles for Exercise111TransactionGold class, Exercise110TransactionCurrency class
 */

package handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import classes.Exercise110Student;
import classes.Exercise110Teacher;
import classes.Exercise111ManagementTransaction;
import classes.Exercise111TransactionCurrency;
import classes.Exercise111TransactionGold;

public class Exercise111Handling {

	public static void main(String[] args) {
		
		/*BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Exercise111TransactionGold[] listTransGold = new Exercise111TransactionGold[0];
		Exercise111TransactionCurrency[] listTransCurrency =  new Exercise111TransactionCurrency[0];
		Exercise111ManagementTransaction managementTransaction = new Exercise111ManagementTransaction();
		
		Exercise111TransactionGold transactionGold;
		Exercise111TransactionCurrency transactionCurrency;
		
		boolean flag = true;
		try {
			while (flag) {
				System.out.println("ENTER GENERAL INFORMATION OF A TRANSACTION");
				System.out.println("Enter id:");
				String id = input.readLine();
				
				System.out.println("Enter date of transaction (dd/MM/yyyy):");
				String date = input.readLine();
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				dateFormat.setLenient(false);
				
				Date dateOfTransaction = dateFormat.parse(date);
				
//				System.out.println("Enter price:");
//				double price = Double.parseDouble(input.readLine());
//				
//				while (price < 0) {
//					System.out.println("Price must be greater than or equal to 0");
//					System.out.println("Enter price:");
//					price = Double.parseDouble(input.readLine());
//				}
				
			/*	System.out.println("Enter quantity:");
				int quantity = Integer.parseInt(input.readLine());
				
				while (quantity < 0) {
					System.out.println("Quantity must be greater than or equal to 0");
					System.out.println("Enter quantity:");
					quantity = Integer.parseInt(input.readLine());
				}
				
				System.out.println("CHOOSE TYPE OF TRANSACTION");
				System.out.println("1. Gold");
				System.out.println("2. Currency");
				int choose = Integer.parseInt(input.readLine());
				while (choose !=1 && choose != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("CHOOSE TYPE OF TRANSACTION");
					System.out.println("1. Gold");
					System.out.println("2. Currency");
					choose = Integer.parseInt(input.readLine());
				}

				switch (choose) {
					case 1:
						System.out.println("Enter type of GOLD: ");
						System.out.println("1. 18K");
						System.out.println("2. 24K");
						System.out.println("3. SJC");
						int typeOfGold = Integer.parseInt(input.readLine());
						
						while (choose != 1 && choose != 2 && choose != 3) {
							System.out.println("Please choose 1 or 2 or 3");
							System.out.println("Enter type of GOLD: ");
							System.out.println("1. 18K");
							System.out.println("2. 24K");
							System.out.println("3. SJC");
							typeOfGold = Integer.parseInt(input.readLine());
						}
						
				//		TypeGold 
						
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
						
						listTeachers = Arrays.copyOf(listTeachers, listTeachers.length + 1);
						teacher = new Exercise110Teacher(name, dateOfBirth, address, phone, 
										classHomeroom, payRate, fringeBenefits);
						listTeachers[listTeachers.length - 1] = teacher;
						
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
						
						listStudents = Arrays.copyOf(listStudents, listStudents.length + 1);
						student = new Exercise110Student(name, dateOfBirth, address, phone,
								studentOfClass, semester1Score, semester2Score);
						listStudents[listStudents.length - 1] = student;
						
						break;
				}
				
				managementHuman.setListTeachers(listTeachers);
				managementHuman.setListStudents(listStudents);
				
				System.out.print(managementHuman.toString());
				System.out.println("======================");
				
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
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}*/

	}

}
