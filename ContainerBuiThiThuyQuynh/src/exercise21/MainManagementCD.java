/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise17CD class and Exercise17ManagementCDs class
 */

package exercise21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainManagementCD {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			ArrayList<CD> cds = new ArrayList<CD>();
			ManagementCD managementCDs = new ManagementCD();
				
			boolean again = true;
			while (again) {
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
				
				cds.add(new CD(id, name, singer, numOfSongs, price));
				
				managementCDs.setCds(cds);
				System.out.println(managementCDs.toString());
				
				/**
				 *  If user want to add a new CD
				 *  flag = 1 if user choose y or Y
				 *  flag = 2 if user choose n or N
				 *  flag = 0 if user choose others
				 */
				int flag = 0;
				while (flag == 0) {
					System.out.println("Are you add a new CD [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flag = 1;
						break;
					case "n":
					case "N":
						flag = 2;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flag == 1) {
					continue;
				}
				else {
					System.out.println("The end");
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
