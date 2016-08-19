/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise13Point class and Exercise13Distance class
 */

package handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.Exercise13Distance;
import classes.Exercise13Point;

public class Exercise13Handling {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter coordinates x of point A: ");
			int ax = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates y of point A: ");
			int ay = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates x of point B: ");
			int bx = Integer.parseInt(input.readLine());
			
			System.out.println("Enter coordinates y of point B: ");
			int by = Integer.parseInt(input.readLine());
			
			Exercise13Point pointA = new Exercise13Point(ax, ay);
			Exercise13Point pointB = new Exercise13Point(bx, by);
			
			Exercise13Distance points = new Exercise13Distance(pointA, pointB);
			
			if (points.calDistance() == 0)
				System.out.println("They are a point");
			else
				System.out.println("The distance between 2 points is " 
						+ String.format("%.3f", points.calDistance()));
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
