package exercise63;

import java.text.DecimalFormat;

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
	
	public double calAverage() {
		DecimalFormat df = new DecimalFormat("#.00");
		String temp = df.format((mark1 + mark2 * 2) / 3);
		return Double.parseDouble(temp);
	}
	
	@Override
	public String toString() {
		String result = name + "\t" + grade + "\t"
				+ mark1 + "\t" + mark2 + "\t" 
				+ calAverage() + "\n";
		return result;
	}
	
}
