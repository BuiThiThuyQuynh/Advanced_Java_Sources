/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges a teacher, extends from exercise110Human class
 */

package classes;

import java.text.DecimalFormat;
import java.util.Date;

public class Exercise110Teacher extends Exercise110Human {

	private final double BASICPAY = 1260000;
	private String classHomeroom;
	private double payRate;
	private double fringeBenefits;
	
	public Exercise110Teacher() {
		
	}
	
	public Exercise110Teacher(String name, Date birthDate, String address, String phone,
			String classHomeroom, double payRate, double fringeBenefits) {
		super(name, birthDate, address, phone);
		this.classHomeroom = classHomeroom;
		this.payRate = payRate;
		this.fringeBenefits = fringeBenefits;
	}

	public String getClassHomeroom() {
		return classHomeroom;
	}

	public void setClassHomeroom(String classHomeroom) {
		this.classHomeroom = classHomeroom;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public double getFringeBenefits() {
		return fringeBenefits;
	}

	public void setFringeBenefits(double fringeBenefits) {
		this.fringeBenefits = fringeBenefits;
	}

	public double getBASICPAY() {
		return BASICPAY;
	}
	
	/**
	 * Function: calculation salary of teacher
	 * Input: no
	 * Output: salary of teacher
	 */
	public double calSalary() {
		return payRate * BASICPAY + fringeBenefits;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###");
		
		String result = super.toString();
		result += "Pay rate: " + this.payRate + "\n";
		result += "Fringe benefits: " + format.format(this.fringeBenefits) + "VND\n";
		result += "Class of homeroom: " + this.classHomeroom + "\n";
		result += "Salary: " + format.format(this.calSalary());
		return result;
	}
	
}
