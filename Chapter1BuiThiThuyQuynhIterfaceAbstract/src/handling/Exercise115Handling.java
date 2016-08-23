/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise115StringedInstrument class and Exercise115NonStringedInstrument class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.Exercise115NonStringedInstrument;
import classes.Exercise115StringedInstrument;

public class Exercise115Handling {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Exercise115StringedInstrument stringedInstrument;
		Exercise115NonStringedInstrument nonStringedInstrument;
		
		try {
			System.out.println("ENTER INFORMATION OF INSTRUMENT");
			System.out.println("Name of instrument:");
			String name = input.readLine();
			
			System.out.println("Manufactory:");
			String manufactory = input.readLine();
			
			System.out.println("CHOOSE TYPE OF INSTRUMENT");
			System.out.println("1. Stringed instrument");
			System.out.println("2. Non stringed instrument");
			int choose = Integer.parseInt(input.readLine());
			
			while (choose != 1 && choose != 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("CHOOSE TYPE OF INSTRUMENT");
				System.out.println("1. Stringed instrument");
				System.out.println("2. Non stringed instrument");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				System.out.println("Enter number of string:");
				int numberString = Integer.parseInt(input.readLine());
				
				while (numberString <= 0) {
					System.out.println("Number of string must be greater than 0");
					System.out.println("Enter number of string:");
					numberString = Integer.parseInt(input.readLine());
				}
				
				stringedInstrument = new Exercise115StringedInstrument(name, manufactory, numberString);
				System.out.println("================================");
				System.out.println(stringedInstrument.toString());
				break;
			case 2:
				System.out.println("Enter usage of instrument:");
				String usage = input.readLine();
				
				nonStringedInstrument = new Exercise115NonStringedInstrument(name, manufactory, usage);
				System.out.println("================================");
				System.out.println(nonStringedInstrument.toString());
				break;
			}
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
