package exercise63;

import java.text.DecimalFormat;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class manages the information of an student.
 */
public class Student {

	private String name;
	private String grade;
	private double mark1;
	private double mark2;
	
	public Student() {
		
	}
	
	public Student(String name, String grade, double mark1, double mark2) {
		this.name = name;
		this.grade = grade;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	
	/**
	 * This method is used to calculate average mark of student.
	 * @param No.
	 * @return double This is average mark of student.
	 */
	public double calAverage() {
		DecimalFormat df = new DecimalFormat("#.00");
		String temp = df.format((mark1 + mark2 * 2) / 3);
		return Double.parseDouble(temp);
	}
	
	/**
	 * This method is used to get the information of an student
	 * @param No.
	 * @return string about information of an student
	 */
	@Override
	public String toString() {
		String result = name + "\t" + grade + "\t"
				+ mark1 + "\t" + mark2 + "\t" 
				+ calAverage() + "\n";
		return result;
	}
	
}
