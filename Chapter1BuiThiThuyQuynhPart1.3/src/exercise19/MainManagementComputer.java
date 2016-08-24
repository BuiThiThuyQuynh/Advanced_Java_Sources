/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class handles for Exercise19Laptop class, Exercise19Desktop class and Exercise19ManagementComputer class
 */

package exercise19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MainManagementComputer {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Laptop[] laptops = new Laptop[0];
		Desktop[] desktops = new Desktop[0];
		ManagementComputer computers = new ManagementComputer();
		
		Laptop laptop;
		Desktop desktop;
		
		boolean flag = true;
		try {
			while (flag) {
				System.out.println("ENTER INFORMATION OF A COMPUTER");
				System.out.println("Enter ID:");
				String id = input.readLine();
				
				System.out.println("Enter price:");
				double price = Double.parseDouble(input.readLine());
				
				while (price < 0) {
					System.out.println("Price must be greater than or equal to 0");
					System.out.println("Enter price:");
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
						System.out.println("Enter weight:");
						double weight = Double.parseDouble(input.readLine());
						
						while (weight < 0) {
							System.out.println("Weight must be greater than or equal to 0");
							System.out.println("Enter weight:");
							weight = Double.parseDouble(input.readLine());
						}
						
						System.out.println("Enter time of PIN:");
						int timeOfPin = Integer.parseInt(input.readLine());
						
						while (timeOfPin < 0) {
							System.out.println("Time of pin must be greater than or equal to 0");
							System.out.println("Enter time of pin:");
							timeOfPin = Integer.parseInt(input.readLine());
						}
						
						System.out.println("Enter size of screen:");
						int sizeOfScreen = Integer.parseInt(input.readLine());
						
						while (sizeOfScreen < 10) {
							System.out.println("Time of pin must be greater than or equal to 10");
							System.out.println("Enter size of screen:");
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
						
						System.out.println("Enter RAM:");
						int ram = Integer.parseInt(input.readLine());
						
						while (ram <= 0) {
							System.out.println("RAM must be greater than 0");
							System.out.println("Enter RAM:");
							ram = Integer.parseInt(input.readLine());
						}
						
						desktops = Arrays.copyOf(desktops, desktops.length + 1);
						desktop = new Desktop(id, price, manufactory, quantity,
										cpu, ram);
						desktops[desktops.length - 1] = desktop;
						
						break;
				}
				
				computers.setLaptops(laptops);
				computers.setDesktops(desktops);
				
				System.out.print(computers.toString());
				System.out.println("======================");
				
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
