/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages an rectangle
 */

package classes;

public class Exercise15Rectangle {
	
	private double lenght;
	private double width;
	
	public Exercise15Rectangle() {
		
	}
	
	public Exercise15Rectangle(double lenght, double width) {
		this.lenght = lenght;
		this.width = width;
	}

	public double getLenght() {
		return lenght;
	}
	
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Funtion: calculating the circumference of rectangle
	 * Input: no
	 * Output: the circumference of rectangle
	 */
	public double calCircumference() {
		double result = (lenght + width) * 2;
		return result;
	}
	
	/**
	 * Funtion: calculating the area of rectangle
	 * Input: no
	 * Output: the area of rectangle
	 */
	public double calArea() {
		double result = lenght * width;
		return result;
	}
}
