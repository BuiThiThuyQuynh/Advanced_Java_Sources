package exercise34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Bui Thi Thuy Quynh
 * @date 09/09/2016
 * @version 1.0
 * 
 * @description Class handles two operands use lambda expression
 */
public class Operators {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Enter operand1 and operand2
			System.out.println("Enter operand 1: ");
			int operand1 = Integer.parseInt(input.readLine());
			
			System.out.println("Enter operand 2: ");
			int operand2 = Integer.parseInt(input.readLine());
			
			// Print result of calculation
			// Sum
			Operator sumOperand = (op1, op2) -> op1 + op2;
			System.out.println("Sum: " + sumOperand.operate(operand1, operand2));
			
			// Minus
			Operator subOperand = (op1, op2) -> op1 - op2;
			System.out.println("Minus: " + subOperand.operate(operand1, operand2));
			
			// Multiple
			Operator mulOperand = (op1, op2) -> op1 * op2;
			System.out.println("Multiple: " + mulOperand.operate(operand1, operand2));
			
			// Division
			if (operand2 != 0) {
				Operator divOperand = (op1, op2) -> op1 / op2;
				System.out.println("Divisor: " + divOperand.operate(operand1, operand2));
			}
			else
				System.out.println("Can not divide by zero");
		}
		catch (IOException | NumberFormatException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}

interface Operator {
	Integer operate(Integer operand1, Integer operand2);
}
