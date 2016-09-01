/**
 * @author Bui Thi Thuy Quynh
 * @created 01/09/2016
 * @version 1.0
 */

package exercise130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description class client in factory pattern
 */
public class Application {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		ShapeFactory factory;
		Shape shape;
		try {
			System.out.println("CHOOSE SHAPE: ");
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Rectangle");
			
			int choose = Integer.parseInt(input.readLine());
			
			while (choose != 1 && choose != 2 && choose != 3) {
				System.out.println("Only choose 1 or 2 or 3");
				System.out.println("CHOOSE SHAPE: ");
				System.out.println("1. Circle");
				System.out.println("2. Square");
				System.out.println("3. Rectangle");
				
				choose = Integer.parseInt(input.readLine());
			}
			
			switch (choose) {
			case 1:
				factory = new CircleFactory();
				shape = factory.getShape();
				System.out.println(shape.draw());
				break;
			case 2:
				factory = new SquareFactory();
				shape = factory.getShape();
				System.out.println(shape.draw());
				break;
			case 3:
				factory = new RectangleFactory();
				shape = factory.getShape();
				System.out.println(shape.draw());
				break;
			default:
				break;
			
			}
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
		
	}
}
