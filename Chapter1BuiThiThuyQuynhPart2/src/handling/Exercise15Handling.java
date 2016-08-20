/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise13Point class, Exercise13Distance class
 * 		and Exercise15Rectangle class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.Exercise13Distance;
import classes.Exercise13Point;
import classes.Exercise15Rectangle;

public class Exercise15Handling {

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
			
			Exercise13Point pointA = new Exercise13Point(ax, ay);
			Exercise13Point pointB = new Exercise13Point(ax, cy);
			Exercise13Point pointD = new Exercise13Point(cx, ay);
			
			Exercise13Distance distanceAB = new Exercise13Distance(pointA, pointB);
			Exercise13Distance distanceAD = new Exercise13Distance(pointA, pointD);
			
			double width = distanceAB.calDistance();
			double lenght = distanceAD.calDistance();
			
			if (width == 0 && lenght == 0)
				System.out.println("This is a point, not a rectangle");
			else
				if (width == 0 || lenght == 0)
					System.out.println("This is a line, not a rectangle");
				else {
					Exercise15Rectangle rectangle = new Exercise15Rectangle(lenght, width);
					System.out.println("Circumference is " + rectangle.calCircumference());
					System.out.println("Area is " + String.format("%.3f", rectangle.calArea()));
				}
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
