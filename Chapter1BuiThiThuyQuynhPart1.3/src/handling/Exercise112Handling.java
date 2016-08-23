/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class handles for Exercise112TextBook class, Exercise112ReferenceBook class and Exercise112ManagementBook class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import classes.Exercise112ManagementBook;
import classes.Exercise112ReferenceBook;
import classes.Exercise112TextBook;

public class Exercise112Handling {

	public static void main(String[] args) {
		
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Exercise112TextBook[] listTextBook = new Exercise112TextBook[0];
		Exercise112ReferenceBook[] listReferBook = new Exercise112ReferenceBook[0];
		Exercise112ManagementBook managementBook = new Exercise112ManagementBook();
		
		Exercise112TextBook textbook;
		Exercise112ReferenceBook referBook;
		
		boolean flag = true;
		try {
			while (flag) {
				System.out.println("ENTER INFORMATION OF A BOOK");
				System.out.println("Enter ID:");
				String id = input.readLine();
				
				System.out.println("Enter name:");
				String name = input.readLine();
				
				System.out.println("Enter day entered (dd/MM/yyyy):");
				String date = input.readLine();
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				dateFormat.setLenient(false);
				
				Date dateEntered = dateFormat.parse(date);
				
				System.out.println("Enter price:");
				double price = Double.parseDouble(input.readLine());
				
				while (price < 0) {
					System.out.println("Price must be greater than or equal to 0");
					System.out.println("Enter price:");
					price = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Enter quantity:");
				int quantity = Integer.parseInt(input.readLine());
				
				while (quantity < 0) {
					System.out.println("Quantity must be greater than or equal to 0");
					System.out.println("Enter quantity:");
					quantity = Integer.parseInt(input.readLine());
				}
				

				System.out.println("Enter publishing company:");
				String publishingCompany = input.readLine();
				
				
				System.out.println("CHOOSE TYPE OF BOOK");
				System.out.println("1. Textbook");
				System.out.println("2. Reference book");
				int choose = Integer.parseInt(input.readLine());
				while (choose !=1 && choose != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("CHOOSE TYPE OF BOOK");
					System.out.println("1. Textbook");
					System.out.println("2. Reference book");
					choose = Integer.parseInt(input.readLine());
				}

				switch (choose) {
					case 1:
						System.out.println("Enter status:");
						System.out.println("1. New");
						System.out.println("2. Old");
						int chooseStatus = Integer.parseInt(input.readLine());
						
						while (chooseStatus !=1 && chooseStatus != 2) {
							System.out.println("Please choose 1 or 2");
							System.out.println("Enter status:");
							System.out.println("1. New");
							System.out.println("2. Old");
							chooseStatus = Integer.parseInt(input.readLine());
						}
						
						String status = "";
						if (chooseStatus == 1)
							status = "new";
						else
							status = "old";
						
						listTextBook = Arrays.copyOf(listTextBook, listTextBook.length + 1);
						textbook = new Exercise112TextBook(id, name, dateEntered, price, quantity, publishingCompany, status);
						listTextBook[listTextBook.length - 1] = textbook;
						
						break;
					case 2:
						System.out.println("Enter tax:");
						double tax = Double.parseDouble(input.readLine());
						
						while (tax < 0.001 && tax > 1) {
							System.out.println("Tax must be between 0.001 to 1");
							System.out.println("Enter tax:");
							tax = Double.parseDouble(input.readLine());
						}
						
						listReferBook = Arrays.copyOf(listReferBook, listReferBook.length + 1);
						referBook = new Exercise112ReferenceBook(id, name, dateEntered, price, quantity, publishingCompany, tax);
						listReferBook[listReferBook.length - 1] = referBook;
						
						break;
				}
				
				managementBook.setListTextBook(listTextBook);
				managementBook.setListReferenceBook(listReferBook);
				
				System.out.print(managementBook.toString());
				System.out.println("======================");
				
				int flagAddBook = 0;
				while (flagAddBook == 0) {
					System.out.println("Are you add a new computer [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flagAddBook = 1;
						break;
					case "n":
					case "N":
						flagAddBook = 2;
						flag = false;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flagAddBook == 1) {
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
