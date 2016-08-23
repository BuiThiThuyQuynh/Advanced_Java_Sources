/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages an circle
 */

package classes;

public class Exercise14Circle {
	
	private final double PI = 3.1415;
	private double radius;
	
	public Exercise14Circle() {
		
	}

	public Exercise14Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Funtion: calculating the circumference of circle
	 * Input: no
	 * Output: the circumference of circle
	 */
	public double calCircumference() {
		double result = 2 * radius * PI;
		return result;
	}
	
	/**
	 * Funtion: calculating the area of circle
	 * Input: no
	 * Output: the area of circle
	 */
	public double calArea() {
		double result = radius * radius * PI;
		return result;
	}
}
