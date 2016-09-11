/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise13Point class, Exercise13Distance class
 * 		and Exercise15Rectangle class
 */

package exercise15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import exercise13.Distance;
import exercise13.Point;

public class MainManagementRectangle {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter coordinates x of point A: ");
			int ax = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates y of point A: ");
			int ay = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates x of point C: ");
			int cx = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates y of point C: ");
			int cy = Integer.parseInt(input.readLine());
			
			Point pointA = new Point(ax, ay);
			Point pointB = new Point(ax, cy);
			Point pointD = new Point(cx, ay);
			
			Distance distanceAB = new Distance(pointA, pointB);
			Distance distanceAD = new Distance(pointA, pointD);
			
			double width = distanceAB.calDistance();
			double lenght = distanceAD.calDistance();
			
			if (width == 0 && lenght == 0)
				System.out.println("This is a point, not a rectangle");
			else
				if (width == 0 || lenght == 0)
					System.out.println("This is a line, not a rectangle");
				else {
					Rectangle rectangle = new Rectangle(lenght, width);
					System.out.println("Circumference is " + rectangle.calCircumference());
					System.out.println("Area is " + String.format("%.3f", rectangle.calArea()));
				}
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
