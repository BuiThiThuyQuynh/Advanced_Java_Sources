package exercise127;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Draw and decorate a shape</h1>
 * The MainDrawingShape program implements an application that
 * simply draws and decorates a shape and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-05
 */
public class MainDrawingShape {
	
	/**
	 * This method is used to draw and decorate a shape.
	 * @param No.
	 * @return Nothing.
	 */
	public static void drawShape(int chooseShape, int chooseDecorator) {
		Shape shape;
		ShapeDecorator decorator;
		
		// If user want to draw a circle with red border
		if (chooseShape == 1 && chooseDecorator == 1) {
			shape = new Circle();
			decorator = new RedBorderDecorator();
			decorator.setShape(shape);
			decorator.draw();
		}
		else
			// If user want to draw a rectangle with red border
			if (chooseShape == 2 && chooseDecorator == 1) {
				shape = new Rectangle();
				decorator = new RedBorderDecorator();
				decorator.setShape(shape);
				decorator.draw();
			}
			else
				// If user want to draw a circle with normal border
				if (chooseShape == 1 && chooseDecorator == 2) {
					shape = new Circle();
					decorator = new NormalBorderDecorator();
					decorator.setShape(shape);
					decorator.draw();
				}
				else
					// If user want to draw a rectangle with normal border
					if (chooseShape == 2 && chooseDecorator == 2) {
						shape = new Rectangle();
						decorator = new NormalBorderDecorator();
						decorator.setShape(shape);
						decorator.draw();
					}
	}

	/**
	 * This is the main method which makes use of draw() method.
	 * @param args Unused.
	 * @return Nothing.
	 * @exception IOException On input error.
	 * @exception NumberFormatException On number format error.
	 * @see IOException.
	 * @see NumberFormatException.
	 */
	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Choose type of shape and check validate of choice
			System.out.println("CHOOSE SHAPE");
			System.out.println("1. Circle");
			System.out.println("2. Rectangle");
			
			int choose = Integer.parseInt(input.readLine());
			while (choose !=1 && choose != 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("CHOOSE SHAPE");
				System.out.println("1. Circle");
				System.out.println("2. Rectangle");
				choose = Integer.parseInt(input.readLine());
			}
			
			// Choose decorating shape or not and check validate of choice
			System.out.println("Do you decorate it?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			int chooseDecorator = Integer.parseInt(input.readLine());
			while (chooseDecorator !=1 && chooseDecorator != 2) {
				System.out.println("Please choose 1 or 2");
				System.out.println("Do you decorate it?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				chooseDecorator = Integer.parseInt(input.readLine());
			}
			
			// Draw and decorate shape
			drawShape(choose, chooseDecorator);
			
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
