package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Bui Thi Thuy Quynh - 18/08/2016
 */


public class TestLinenearEquation {
		
	/*
	 * Function: check root (numerous root, no root or -b/a) of equation
	 * Input: root, a, b 
	 * Output: string about root
	 */
	public static String checkRoot(double root, double a, double b) {
		if (root == 0) 
			if (a == 0 && b == 0)
				return "Numerous roots";
			else
				return "0";
		else
			if (a == 0 && b != 0)
				return "No root";
			else
				return String.valueOf(root);		
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Calculator ax + b = 0");
		System.out.println("Enter a: ");
		try {
			double a = Double.parseDouble(input.readLine());
			
			System.out.println("Enter b: ");
			double b = Double.parseDouble(input.readLine());
			
			LinenearEquation se = new LinenearEquation();
			se.setA(a);
			se.setB(b);
			double root = se.calRoot(se.getA(), se.getB());
			String result = checkRoot(root, se.getA(), se.getB());
			System.out.println("Root of an equations: " + result);
			
		}
		catch (IOException | NumberFormatException | ArithmeticException ex) {
			System.out.println("Exception: " + ex);
		}
	}
}
