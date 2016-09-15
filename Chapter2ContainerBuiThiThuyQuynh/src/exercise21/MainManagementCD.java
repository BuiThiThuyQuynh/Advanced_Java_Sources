package exercise21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class handles for others classes about management CD
 */
public class MainManagementCD {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			ArrayList<CD> cds = new ArrayList<CD>();
			ManagementCD managementCDs = new ManagementCD();
				
			boolean again = true;
			while (again) {
				// Enter and check validate information for a CD
				System.out.println("------- CD " + (cds.size() + 1) + " --------");
				
				System.out.println("Enter ID: ");
				String id = input.readLine();
				
				System.out.println("Enter name: ");
				String name = input.readLine();
				
				System.out.println("Enter singer: ");
				String singer = input.readLine();
				
				System.out.println("Enter number of songs: ");
				int numOfSongs = Integer.parseInt(input.readLine());
				
				while (numOfSongs <= 0) {
					System.out.println("Number of songs must be greater than 0");
					System.out.println("Enter number of songs ");
					numOfSongs = Integer.parseInt(input.readLine());
				}
				
				System.out.println("Enter price: ");
				double price = Double.parseDouble(input.readLine());
				
				while (price <= 0) {
					System.out.println("Price must be greater than 0");
					System.out.println("Enter price: ");
					price = Double.parseDouble(input.readLine());
				}
				
				// Add CD to list and print list CDs
				cds.add(new CD(id, name, singer, numOfSongs, price));
				managementCDs.setCds(cds);
				System.out.println(managementCDs.toString());
				
				// Loop add CD if user want
				System.out.println("=====================");
				System.out.println("Do you continue add a new CD?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				int choose = Integer.parseInt(input.readLine());
				while (choose <= 0 || choose > 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("Do you continue add a new CD?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					choose = Integer.parseInt(input.readLine());
				}
					
				switch (choose) {
				case 1:
					continue;
				case 2:
				default:
					System.out.println("Application ended");
					again = false;
					break;
				}
			}
		}
		catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
