/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 1.0
 */

package exercise118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description Class handles the information about gift box, using GiftBox class and Gift class inner GiftBox class
 */
public class MainGift {
	
	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Input some of information about gift box
			System.out.println("Enter shape of giftbox: ");
			String shape = input.readLine();
			
			System.out.println("Enter color of giftbox: ");
			String color = input.readLine();
			
			// Input some of information about gift
			System.out.println("Enter name of gift: ");
			String name = input.readLine();
			
			System.out.println("Enter weight of gift (gram): ");
			double weight = Double.parseDouble(input.readLine());
			
			while (weight <= 0) {
				System.out.println("Weight must be greater than 0");
				System.out.println("Enter weight of gift: ");
				weight = Double.parseDouble(input.readLine());
			}
			
			GiftBox giftbox = new GiftBox(shape, color);
			GiftBox.Gift gift = giftbox.new Gift(name, weight);
			
			// Print information of gift box and gift included fee
			System.out.println("=====================================");
			System.out.println(gift.toString());
			
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
