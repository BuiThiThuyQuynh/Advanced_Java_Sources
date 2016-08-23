/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an square, realization abstract class Exercise114Shape
 */

package classes;

import abstractclasses.Exercise114Shape;

public class Exercise114Square extends Exercise114Shape {
	
	private double side;

	public Exercise114Square() {
		
	}

	public Exercise114Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double calPerimeter() {
		return this.side * 4;
	}
	
	@Override
	public double calArea() {
		return this.side * this.side;
	}
	
	@Override
	public String toString() {
		String result = "SQUARE: \nSide: " + this.side + "\n";
		result += super.toString();
		return result;
	}
}
