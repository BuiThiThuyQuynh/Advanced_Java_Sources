/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise116Car class and Exercise116Ship class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import classes.Exercise116Car;
import classes.Exercise116Ship;
import classes.Exercise116Transport;

public class Exercise116Handling {
	
	public static void printArray(Exercise116Transport[] transport) {
		for (int i = 0; i < transport.length; i++) {
			System.out.println(transport[i].toString());
		}
	}

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Exercise116Car[] listCars = new Exercise116Car[0];
		Exercise116Ship[] listShip = new Exercise116Ship[0];
		
		Exercise116Car car;
		Exercise116Ship ship;
		
		boolean flag = true;
		try {
			while (flag) {
				System.out.println("ENTER GENERAL INFORMATION OF A TRANSPORT");
				System.out.println("Enter distance:");
				double distance = Double.parseDouble(input.readLine());
				
				while (distance < 0) {
					System.out.println("Distance must be greater than or equal to 0");
					System.out.println("Enter distance:");
					distance = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Enter time (hours):");
				double time = Double.parseDouble(input.readLine());
				
				while (time < 0) {
					System.out.println("Time must be greater than or equal to 0");
					System.out.println("Enter time:");
					time = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Enter fuel used:");
				double fuelUsed = Double.parseDouble(input.readLine());
				
				while (fuelUsed < 0) {
					System.out.println("Used fuel must be greater than or equal to 0");
					System.out.println("Enter fuel used:");
					fuelUsed = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Enter number ID:");
				String numberID = input.readLine();
				
				System.out.println("Enter owner:");
				String owner = input.readLine();
				
				System.out.println("Enter color:");
				String color = input.readLine();
				
				System.out.println("Enter manufactory:");
				String manufactory = input.readLine();
				
				System.out.println("CHOOSE TYPE OF TRANSPORT");
				System.out.println("1. Car");
				System.out.println("2. Ship");
				int choose = Integer.parseInt(input.readLine());
				while (choose !=1 && choose != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("CHOOSE TYPE OF TRANSPORT");
					System.out.println("1. Car");
					System.out.println("2. Ship");
					choose = Integer.parseInt(input.readLine());
				}

				switch (choose) {
					case 1:
						System.out.println("Enter gear:");
						String gear = input.readLine();
						
						System.out.println("Enter model:");
						String model = input.readLine();
						
						listCars = Arrays.copyOf(listCars, listCars.length + 1);
						car = new Exercise116Car(distance, time, fuelUsed, numberID, owner, color, manufactory, gear, model);
						listCars[listCars.length - 1] = car;
						
						break;
					case 2:
						System.out.println("Enter weight:");
						double weight = Double.parseDouble(input.readLine());
						
						while (weight <= 0) {
							System.out.println("Weight must be greater than 0");
							System.out.println("Enter weight:");
							weight = Double.parseDouble(input.readLine());
						}
						
						System.out.println("Enter capacity:");
						int capacity = Integer.parseInt(input.readLine());
						
						while (capacity <= 0) {
							System.out.println("Capacity must be greater than 0");
							System.out.println("Enter capacity:");
							capacity = Integer.parseInt(input.readLine());
						}
						
						System.out.println("Enter speed straight with water:");
						int speedStraight = Integer.parseInt(input.readLine());
						
						while (speedStraight <= 0) {
							System.out.println("Speed straight must be greater than 0");
							System.out.println("Enter speed straight with water:");
							speedStraight = Integer.parseInt(input.readLine());
						}
						
						System.out.println("Enter speed reverse with water:");
						int speedReverse = Integer.parseInt(input.readLine());
						
						while (speedReverse <= 0) {
							System.out.println("Speed reverse must be greater than 0");
							System.out.println("Enter speed reverse with water:");
							speedReverse = Integer.parseInt(input.readLine());
						}
						
						System.out.println("Enter fuel used for start up:");
						double fuelForStartup = Double.parseDouble(input.readLine());
						
						while (fuelForStartup <= 0) {
							System.out.println("Fuel used for start up must be greater than 0");
							System.out.println("Enter fuel used for start up:");
							fuelForStartup = Double.parseDouble(input.readLine());
						}
						
						System.out.println("Enter type of fuel:");
						String typeOfFuel = input.readLine();
						
						listShip = Arrays.copyOf(listShip, listShip.length + 1);
						ship = new Exercise116Ship(distance, time, fuelUsed, numberID, owner, 
								color, manufactory, weight, capacity, speedStraight, speedReverse, 
								fuelForStartup, typeOfFuel);
								
						listShip[listShip.length - 1] = ship;
						
						break;
				}
				
				System.out.println("======== LIST CARS ==============");
				printArray(listCars);
				System.out.println("======================");
				printArray(listShip);
				
				int flagAddTransport = 0;
				while (flagAddTransport == 0) {
					System.out.println("Are you add a new computer [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flagAddTransport = 1;
						break;
					case "n":
					case "N":
						flagAddTransport = 2;
						flag = false;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flagAddTransport == 1) {
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
