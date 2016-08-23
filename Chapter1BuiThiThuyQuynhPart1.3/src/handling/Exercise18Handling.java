/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class handles for Exercise18Soldier class, Exercise18Infantryman class and Exercise18Trooper class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.Exercise18Infantryman;
import classes.Exercise18Trooper;

public class Exercise18Handling {
	
	/**
	 * Function: print power of soldiers after fight
	 * Input: fight, infantryman, trooper
	 * Output: no
	 */
	public static void printPowerOfSolider (int fight, Exercise18Infantryman infan,
			Exercise18Trooper trooper) {
		switch (fight) {
		case 1:
			trooper.fight();
			break;
		case 2:
			infan.fight();
			break;
		default:
			break;
		}
		
		System.out.println(infan.toString());
		System.out.println(trooper.toString());
	}
	
	/**
	 * Function: check power of soldiers after fight
	 * Input: infantryman, trooper
	 * Output: 
	 * 			1 if power of infantryman <= 0
	 * 			2 if power of trooper <= 0
	 * 			3 if others 
	 */
	public static int checkPower(Exercise18Infantryman infan, Exercise18Trooper trooper) {
		if (infan.getPower() <= 0)
			return 1;
		else
			if (trooper.getPower() <= 0)
				return 2;
		return 3;
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Initialization an infantryman
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
			
			Exercise18Infantryman infan = new Exercise18Infantryman(nameInfan, powerInfan, weaponInfan);
			
			// Initialization a trooper
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
			
			Exercise18Trooper trooper = new Exercise18Trooper(nameTrooper, powerTrooper, weaponTrooper);
			
			// Fight
			int fight;
			while (checkPower(infan, trooper) == 3 ) {
				System.out.println("1. Infantryman attack");
				System.out.println("2. Trooper attack");
				fight = Integer.parseInt(input.readLine());
				
				if (fight != 1 && fight != 2)  {
					System.out.println("Please only choose 1 or 2");
					continue;
				}
				System.out.println("== INFORMATION OF SOLDIERS ==");
				printPowerOfSolider(fight, infan, trooper);
				System.out.println("=============");
			}
			
			if (checkPower(infan, trooper) == 1) {
				System.out.println("The fight end");
				System.out.println("The infantryman out of power");
				System.out.println("Trooper is winner");
				
			}
			else
				if (checkPower(infan, trooper) == 2) {
					System.out.println("The fight end");
					System.out.println("The trooper out of power");
					System.out.println("Infantryman is winner");
				}
			
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
