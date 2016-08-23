/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise117Bird class, Exercise117Tiger class,
 * 		Exercise117Fish class and Exercise117Boa class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import abstractclasses.Exercise117Animal;
import classes.Exercise117Bird;
import classes.Exercise117Boa;
import classes.Exercise117Fish;
import classes.Exercise117Tiger;

public class Exercise117Handling {
	
	public static void printArray(Exercise117Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			animals[i].printInfo();
			System.out.println("--------------");
		}
	}

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Exercise117Animal[] animals = new Exercise117Animal[0];
		
		Exercise117Bird bird;
		Exercise117Tiger tiger;
		Exercise117Fish fish;
		Exercise117Boa boa;
		
		boolean flag = true;
		try {
			while (flag) {
				System.out.println("ENTER GENERAL INFORMATION OF A ANIMAL");
				System.out.println("Enter name:");
				String name = input.readLine();
				
				System.out.println("Enter food:");
				String food = input.readLine();
				
				System.out.println("CHOOSE TYPE OF ANIMAL");
				System.out.println("1. Bird");
				System.out.println("2. Tiger");
				System.out.println("3. Fish");
				System.out.println("4. Boa");
				int choose = Integer.parseInt(input.readLine());
				while (choose !=1 && choose != 2 && choose != 3 && choose != 4) {
					System.out.println("Please only choose 1 or 2 or 3 or 4");
					System.out.println("CHOOSE TYPE OF ANIMAL");
					System.out.println("1. Bird");
					System.out.println("2. Tiger");
					System.out.println("3. Fish");
					System.out.println("4. Boa");
					choose = Integer.parseInt(input.readLine());
				}

				switch (choose) {
					case 1:
						System.out.println("Enter color:");
						String color = input.readLine();
						
						animals = Arrays.copyOf(animals, animals.length + 1);
						bird = new Exercise117Bird(name, food, color);
						animals[animals.length - 1] = bird;
						
						break;
					case 2:
						System.out.println("Enter type of strip:");
						String typeStrip = input.readLine();
						
						animals = Arrays.copyOf(animals, animals.length + 1);
						tiger = new Exercise117Tiger(name, food, typeStrip);
						animals[animals.length - 1] = tiger;
						
						break;
					case 3:
						System.out.println("Enter type of skin:");
						String skinType = input.readLine();
						
						animals = Arrays.copyOf(animals, animals.length + 1);
						fish = new Exercise117Fish(name, food, skinType);
						animals[animals.length - 1] = fish;
						
						break;
					case 4:
						System.out.println("Enter lenght:");
						double lenght = Double.parseDouble(input.readLine());
						
						while (lenght <= 0) {
							System.out.println("Lenght must be greater than 0");
							System.out.println("Enter lenght:");
							lenght = Double.parseDouble(input.readLine());
						}
						
						
						animals = Arrays.copyOf(animals, animals.length + 1);
						boa = new Exercise117Boa(name, food, lenght);
						animals[animals.length - 1] = boa;
						
						break;
				}
				
				System.out.println("======== LIST ANIMALS ==============");
				printArray(animals);
				
				int flagAddAnimal = 0;
				while (flagAddAnimal == 0) {
					System.out.println("Are you add a new computer [y/n]?");
					String temp = input.readLine();
					switch (temp) {
					case "y":
					case "Y":
						flagAddAnimal = 1;
						break;
					case "n":
					case "N":
						flagAddAnimal = 2;
						flag = false;
						break;
					default:
						System.out.println("This choose don't have. Please choosing again!");
						break;
					}
				}
				
				if (flagAddAnimal == 1) {
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
