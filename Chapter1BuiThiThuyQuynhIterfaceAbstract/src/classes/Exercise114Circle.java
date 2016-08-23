/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an circle, realization abstract class Exercise114Shape
 */

package classes;

import abstractclasses.Exercise114Shape;

public class Exercise114Circle extends Exercise114Shape {

	private final double PI = 3.1415;
	private double radius;
	
	public Exercise114Circle() {
		
	}
	
	public Exercise114Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public double calPerimeter() {
		return 2 * this.radius * this.PI;
	}
	
	@Override
	public double calArea() {
		return this.radius * this.radius * this.PI;
	}
	
	@Override
	public String toString() {
		String result = "CIRCLE: \nRadius: " + this.radius + "\n";
		result += super.toString();
		return result;
	}
}
