/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise13Point class, Exercise13Distance class
 * 		and Exercise14Circle class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.Exercise13Distance;
import classes.Exercise13Point;
import classes.Exercise14Circle;

public class Exercise14Handling {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter coordinates x of point O: ");
			int ox = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates y of point O: ");
			int oy = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates x of point R: ");
			int rx = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates y of point R: ");
			int ry = Integer.parseInt(input.readLine());
			
			Exercise13Point pointO = new Exercise13Point(ox, oy);
			Exercise13Point pointR = new Exercise13Point(rx, ry);
			
			Exercise13Distance points = new Exercise13Distance(pointO, pointR);
			
			double radius = points.calDistance();
			
			if (radius == 0)
				System.out.println("This is a lpoint, not a circle");
			else {
				Exercise14Circle circle = new Exercise14Circle(radius);
				System.out.println("Circumference is " + String.format("%.3f", circle.calCircumference()));
				System.out.println("Area is " + String.format("%.3f", circle.calArea()));
			}
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
