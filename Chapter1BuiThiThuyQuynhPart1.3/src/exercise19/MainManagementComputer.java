/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @description class handles for Laptop class, Desktop class and ManagementComputer class
 */
public class MainManagementComputer {
	
	/**
	 * @description function for printing the information of array computers
	 */
	public static void printInformation(ManagementComputer computers, Laptop[] laptops, Desktop[] desktops) {
		DecimalFormat format = new DecimalFormat("#,###");
		System.out.println("========== INFORMATION OF LAPTOPS ===========");
		System.out.print(computers.printInformation(laptops));
		System.out.println("========== INFORMATION OF DESKTOPS ===========");
		System.out.print(computers.printInformation(desktops));
		System.out.println("======================");
		System.out.println("Total amount of laptops: " + format.format(computers.sumFee(laptops)));
		System.out.println("Total amount of desktop: " + format.format(computers.sumFee(desktops)));
	}

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Laptop[] laptops = new Laptop[0];
		Desktop[] desktops = new Desktop[0];
		ManagementComputer computers = new ManagementComputer();
		
		Laptop laptop;
		Desktop desktop;
		
		boolean flag = true;
		try {
			/**
			 * enter the information of a computer and allow entering again
			 */
			while (flag) {
				/**
				 * enter the general information of a computer
				 */
				System.out.println("ENTER INFORMATION OF A COMPUTER");
				System.out.println("Enter ID:");
				String id = input.readLine();
				
				System.out.println("Enter price (USD):");
				double price = Double.parseDouble(input.readLine());
				
				while (price < 0) {
					System.out.println("Price must be greater than or equal to 0");
					System.out.println("Enter price (USD):");
					price = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Enter manufactory:");
				String manufactory = input.readLine();
				
				System.out.println("Enter quantity:");
				int quantity = Integer.parseInt(input.readLine());
				
				while (quantity < 0) {
					System.out.println("Quantity must be greater than or equal to 0");
					System.out.println("Enter quantity:");
					quantity = Integer.parseInt(input.readLine());
				}
				
				/**
				 * choose type of computer and enter the specific information of a type of computer 
				 */
				System.out.println("CHOOSE TYPE OF COMPUTER");
				System.out.println("1. Laptop");
				System.out.println("2. Desktop");
				int choose = Integer.parseInt(input.readLine());
				while (choose !=1 && choose != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("CHOOSE TYPE OF COMPUTER");
					System.out.println("1. Laptop");
					System.out.println("2. Desktop");
					choose = Integer.parseInt(input.readLine());
				}

				switch (choose) {
					case 1:
						System.out.println("Enter weight (kg):");
						double weight = Double.parseDouble(input.readLine());
						
						while (weight < 0) {
							System.out.println("Weight must be greater than or equal to 0");
							System.out.println("Enter weight (kg):");
							weight = Double.parseDouble(input.readLine());
						}
						
						System.out.println("Enter time of PIN (hours):");
						int timeOfPin = Integer.parseInt(input.readLine());
						
						while (timeOfPin < 0) {
							System.out.println("Time of pin must be greater than or equal to 0");
							System.out.println("Enter time of pin (hours):");
							timeOfPin = Integer.parseInt(input.readLine());
						}
						
						System.out.println("Enter size of screen (inch):");
						int sizeOfScreen = Integer.parseInt(input.readLine());
						
						while (sizeOfScreen < 10) {
							System.out.println("Time of pin must be greater than or equal to 10");
							System.out.println("Enter size of screen (inch):");
							sizeOfScreen = Integer.parseInt(input.readLine());
						}
						
						laptops = Arrays.copyOf(laptops, laptops.length + 1);
						laptop = new Laptop(id, price, manufactory, quantity, 
										weight, timeOfPin, sizeOfScreen);
						laptops[laptops.length - 1] = laptop;
						
						break;
					case 2:
						System.out.println("Enter CPU:");
						String cpu = input.readLine();
						
						System.out.println("Enter RAM (GB):");
						int ram = Integer.parseInt(input.readLine());
						
						while (ram <= 0) {
							System.out.println("RAM must be greater than 0");
							System.out.println("Enter RAM (GB):");
							ram = Integer.parseInt(input.readLine());
						}
						
						desktops = Arrays.copyOf(desktops, desktops.length + 1);
						desktop = new Desktop(id, price, manufactory, quantity,
										cpu, ram);
						desktops[desktops.length - 1] = desktop;
						
						break;
				}
				
				/**
				 * printing list computer entered
				 */
				printInformation(computers, laptops, desktops);
				
				/**
				 * ask if user want to add new computer
				 */
				int flagAddNewComputer = 0;
				while (flagAddNewComputer == 0) {
					System.out.println("Are you add a new computer [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flagAddNewComputer = 1;
						break;
					case "n":
					case "N":
						flagAddNewComputer = 2;
						flag = false;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flagAddNewComputer == 1) {
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
		}

	}

}
