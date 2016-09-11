package exercise130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Draw a shape</h1>
 * The MainDrawingShape program implements an application that
 * simply draws a shape and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class MainDrawingShape {

	/**
	 * This is the main method which makes use of draw() method and getShape() method.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @exception NumberFormatException On number format error.
	 * @see IOException.
	 * @see NumberFormatException.
	 */
	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		ShapeFactory factory;
		Shape shape;
		try {
			// Show menu for user select shape which want to draw and check validate choice
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
			
			// Draw shape that user selected
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
