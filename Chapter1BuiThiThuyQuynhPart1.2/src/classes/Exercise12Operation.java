/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages two numbers (as addition, subtraction, multiplication and division)
 */

package classes;

public class Exercise12Operation {
	
	private double firstNumber;
	private double secondNumber;
	
	public Exercise12Operation() {
		
	}
	
	public Exercise12Operation(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public double getSecondNumber() {
		return secondNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	/**
	 * Function: adding two numbers
	 * Input: no
	 * Output: summary of two numbers
	 */
	public double addOperation() {
		return firstNumber + secondNumber;
	}
	
	/**
	 * Function: subtracting two numbers
	 * Input: no
	 * Output: minus of two numbers
	 */
	public double subOperation() {
		return firstNumber - secondNumber;
	}
	
	/**
	 * Function: multiplication two numbers
	 * Input: no
	 * Output: the results of the multiplication of two numbers
	 */
	public double multiOperation() {
		return firstNumber * secondNumber;
	}
	
	/**
	 * Function: division two numbers
	 * Input: no
	 * Output: divisor of two numbers
	 */
	public double divideOperation() {
		if (secondNumber == 0)
			throw new ArithmeticException("By / zero");
		return firstNumber / secondNumber;
	}
}
