/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an rectangle, realization abstract class Exercise114Shape
 */

package classes;

import abstractclasses.Exercise114Shape;

public class Exercise114Rectangle extends Exercise114Shape {

	private double leght;
	private double width;
	
	public Exercise114Rectangle() {
		
	}
	
	public Exercise114Rectangle(double leght, double width) {
		this.leght = leght;
		this.width = width;
	}
	
	public double getLeght() {
		return leght;
	}
	
	public void setLeght(double leght) {
		this.leght = leght;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double calPerimeter() {
		return (this.leght + this.width) * 2;
	}
	
	@Override
	public double calArea() {
		return this.leght * this.width;
	}
	
	@Override
	public String toString() {
		String result = "RECTANGLE: \nLenght: " + this.leght + "\n";
		result += "Width: " + this.width + "\n";
		result += super.toString();
		return result;
	}
}
