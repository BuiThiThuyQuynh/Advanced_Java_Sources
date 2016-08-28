/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  @description class handles for Soldier class, Infantryman class and Trooper class
 */
public class MainManagementFighting {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			/**
			 *  Initialization an infantryman
			 */
			System.out.println("Initialization infantryman: ");
			System.out.println("Name: ");
			String nameInfan = input.readLine();
			
			System.out.println("Power: ");
			int powerInfan = Integer.parseInt(input.readLine());
			
			while (powerInfan < 0) {
				System.out.println("Power must be greather than or equal to 0");
				System.out.println("Power: ");
				powerInfan = Integer.parseInt(input.readLine());
			}
			
			System.out.println("Waepon: ");
			String weaponInfan = input.readLine();
			
			Soldier infan = new Infantryman(nameInfan, powerInfan, weaponInfan);
			
			/**
			 *  Initialization a trooper
			 */
			System.out.println("Initialization trooper: ");
			System.out.println("Name: ");
			String nameTrooper = input.readLine();
			
			System.out.println("Power: ");
			int powerTrooper = Integer.parseInt(input.readLine());
			
			while (powerTrooper < 0) {
				System.out.println("Power must be greather than or equal to 0");
				System.out.println("Power: ");
				powerTrooper = Integer.parseInt(input.readLine());
			}
			
			System.out.println("Waepon: ");
			String weaponTrooper = input.readLine();
			
			Soldier trooper = new Trooper(nameTrooper, powerTrooper, weaponTrooper);
			
			/**
			 * Check power of soldier after fight
			 */
			int fight;
			while (trooper.checkPower() && infan.checkPower()) {
				System.out.println("1. Infantryman attack");
				System.out.println("2. Trooper attack");
				fight = Integer.parseInt(input.readLine());
				
				/**
				 * when user do not choose 1 or 2 continue for user choose again
				 */
				if (fight != 1 && fight != 2)  {
					System.out.println("Please only choose 1 or 2");
					continue;
				}
				
				/**
				 * print information after fight
				 */
				System.out.println("== INFORMATION OF SOLDIERS ==");
				if (fight == 1) {
					System.out.println("Infantryman attack");
					trooper.fight();
				}
				else {
					System.out.println("Trooper attack");
					infan.fight();
				}
				
				System.out.println(trooper.toString());
				System.out.println(infan.toString());
				System.out.println("=============");
			}
			
			/**
			 * if power of trooper or infantryman is out of, program will stop
			 */
			if (!trooper.checkPower()) {
				System.out.println("The fight end");
				System.out.println("Infantryman is winner");
				
			}
			else {
				System.out.println("The fight end");
				System.out.println("Trooper is winner");
			}
			
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
