package exercise33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * @author Bui Thi Thuy Quynh
 * @date 09/09/2016
 * @version 1.0
 * 
 * @description Class calculate area of shape use lambda expression
 */
public class Shape {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Enter radius of circle and check validate
			System.out.println("Enter radius of circle: ");
			double radius = Double.parseDouble(input.readLine());
			
			while (radius <= 0) {
				System.out.println("Radius must be greater than 0");
				System.out.println("Enter radius of circle: ");
				radius = Double.parseDouble(input.readLine());
			}
			
			// Enter length and width of rectangle and check validate
			System.out.println("Enter lenght: ");
			double length = Double.parseDouble(input.readLine());
			
			while (length <= 0) {
				System.out.println("Length must be greater than 0");
				System.out.println("Enter length: ");
				length = Double.parseDouble(input.readLine());
			}
			
			System.out.println("Enter width: ");
			double width = Double.parseDouble(input.readLine());
			
			while (width <= 0) {
				System.out.println("Width must be greater than 0");
				System.out.println("Enter width: ");
				width = Double.parseDouble(input.readLine());
			}
			
			// Print result of calculation area
			DecimalFormat df = new DecimalFormat("#,###.00");
			
			Area circle = (x1, x2) -> x1 * x1 * x2;
			System.out.println("Area of circle: " 
					+ df.format(circle.calArea(radius, Math.PI)));
			
			Area rectangle = (x1, x2) -> x1 * x2;
			System.out.println("Area of rectangle: " 
					+ df.format(rectangle.calArea(length, width)));
			
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}

interface Area {
	double calArea(double x1, double x2);
}
