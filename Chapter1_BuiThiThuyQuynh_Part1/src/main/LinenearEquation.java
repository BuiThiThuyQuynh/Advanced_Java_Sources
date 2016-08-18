package main;

/*
 * Bui Thi Thuy Quynh - 18/08/2016
 */

public class LinenearEquation {
	private double a;
	private double b;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public LinenearEquation() {
		
	}
	
	/*
	 * Function: calculate root of equation (ax + b = 0)
	 * Input: a, b
	 * Output: x = 0 (numerous roots)
	 * 		   x = b (no root)
	 * 		   x = -b / a (other)
	 */
	public double calRoot (double a, double b) {
		if (a == 0)
			if (b == 0)
				return 0;
			else
				return b;
		else
			return -b / a;
	}
}
