/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise114Circle class, Exercise114Square class and Exercise114Rectangle class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.Exercise114Circle;
import classes.Exercise114Rectangle;
import classes.Exercise114Square;

public class Exercise114Handling {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		Exercise114Circle circle;
		Exercise114Square square;
		Exercise114Rectangle rectangle;
		
		try {
			System.out.println("CHOOSE SHAPE");
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Rectangle");
			int choose = Integer.parseInt(input.readLine());
			while (choose != 1 && choose != 2 && choose != 3) {
				System.out.println("Please choose 1, 2 or 3");
				System.out.println("CHOOSE SHAPE");
				System.out.println("1. Circle");
				System.out.println("2. Square");
				System.out.println("3. Rectangle");
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				System.out.println("Enter radius:");
				double radius = Double.parseDouble(input.readLine());
				
				while (radius <= 0) {
					System.out.println("Radius must be greater than 0");
					System.out.println("Enter radius:");
					radius = Double.parseDouble(input.readLine());
				}
				
				circle = new Exercise114Circle(radius);
				System.out.println("=======================");
				System.out.println(circle.toString());
				break;
			case 2:
				System.out.println("Enter side lenght:");
				double side = Double.parseDouble(input.readLine());
				
				while (side <= 0) {
					System.out.println("Side lenght must be greater than 0");
					System.out.println("Enter side lenght:");
					side = Double.parseDouble(input.readLine());
				}
				
				square = new Exercise114Square(side);
				System.out.println("=======================");
				System.out.println(square.toString());
				break;
			case 3:
				System.out.println("Enter lenght:");
				double lenght = Double.parseDouble(input.readLine());
				
				while (lenght <= 0) {
					System.out.println("Lenght must be greater than 0");
					System.out.println("Enter lenght:");
					lenght = Double.parseDouble(input.readLine());
				}
				
				System.out.println("Enter width:");
				double width = Double.parseDouble(input.readLine());
				
				while (width <= 0) {
					System.out.println("Width must be greater than 0");
					System.out.println("Enter width:");
					width = Double.parseDouble(input.readLine());
				}
				
				rectangle = new Exercise114Rectangle(lenght, width);
				System.out.println("=======================");
				System.out.println(rectangle.toString());
				break;
			}
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}

}
