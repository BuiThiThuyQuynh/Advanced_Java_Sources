package exercise87;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * @author ThuyQuynh
 * @since 2016-09-17
 * @version 1.0
 * 
 * This is class does three 3 transaction (successfully and failed).
 */
public class MainTransaction {
	
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new 
				InputStreamReader(System.in));
		
		ProductController productController = new ProductController();
		try {
			boolean again = true;
			while (again) {
				// Show menu for user choose
				System.out.println("==== CHOOSE TRANSACTIOn =======");
				System.out.println("1. Transaction 1");
				System.out.println("2. Transaction 2");
				System.out.println("3. Transaction 3");
				System.out.println("4. Exit");
				int choose = Integer.parseInt(input.readLine());
				
				while (choose <= 0 || choose > 4) {
					System.out.println("Choose again");
					System.out.println("==== CHOOSE TRANSACTIOn =======");
					System.out.println("1. Transaction 1");
					System.out.println("2. Transaction 2");
					System.out.println("3. Transaction 3");
					System.out.println("4. Exit");
					choose = Integer.parseInt(input.readLine());
				}
				
				// Display user's choice
				switch (choose) {
				case 1:
					productController.transaction1();
					break;
				case 2:
					productController.transaction2();
					break;
				case 3:
					productController.transaction3();
					break;
				case 4:
				default:
					again = false;
					break;
				}
			}
			
		} 
		catch (ClassNotFoundException | SQLException | NumberFormatException | IOException e) {
			System.out.println("Error: " + e);
		}
	}

}
