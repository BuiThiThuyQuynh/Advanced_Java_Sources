/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise110;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * @description class manages a teacher, extends from Human class
 */
public class Teacher extends Human {

	private final double BASICPAY = 1260000;
	private String classHomeroom;
	private double payRate;
	private double fringeBenefits;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, Date birthDate, String address, String phone,
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
	 * @description function for calculation salary of teacher
	 * @return salary of teacher
	 */
	public double calSalary() {
		return payRate * BASICPAY + fringeBenefits;
	}
	
	/**
	 * @description get all the information of a teacher
	 * @return string about information of a teacher
	 */
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###");
		
		String result = super.toString();
		result += "Pay rate: " + this.payRate + "\n";
		result += "Fringe benefits: " + format.format(this.fringeBenefits) + "VND\n";
		result += "Class of homeroom: " + this.classHomeroom + "\n";
		result += "Salary: " + format.format(this.calSalary()) + "VND\n";
		return result;
	}
	
}
