/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Abstract class manages the information of an shape
 */

package abstractclasses;

public abstract class Exercise114Shape {

	/**
	 * Function: calculation perimeter of shape
	 * Input no:
	 * Output: perimeter of shape
	 */
	public abstract double calPerimeter();
	
	/**
	 * Function: calculation area of shape
	 * Input no:
	 * Output: area of shape
	 */
	public abstract double calArea();
	
	@Override
	public String toString() {
		String result = "Perimeter: " + this.calPerimeter() + "\n";
		result += "Area: " + this.calArea();
		return result;
	}
}
