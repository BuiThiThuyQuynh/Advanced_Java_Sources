/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class handles for Exercise12Operation class
 */

package exercise12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainOperation {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter first number: ");
			double firstNumber = Double.parseDouble(input.readLine());
			
			System.out.println("Enter second number: ");
			double secondNumber = Double.parseDouble(input.readLine());
			
			Operation operation = new Operation();
			operation.setFirstNumber(firstNumber);
			operation.setSecondNumber(secondNumber);
			
			System.out.println("Summary of two numbers: " + operation.addOperation());
			System.out.println("Minus of two numbers: " + operation.subOperation());
			System.out.println("Multiplication of two numbers: " + operation.multiOperation());
			System.out.println("Divisor of two numbers: " + String.format("%.3f", operation.divideOperation()));
		}
		catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
