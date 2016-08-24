/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges a student, extends from exercise110Human class
 */

package exercise110;

import java.util.Date;

public class Student extends Human{

	private String studentOfClass;
	private double semester1Score;
	private double semester2Score;
	
	public Student() {
		
	}
	
	public Student(String name, Date birthDate, String address, String phone,
			String studentOfClass, double semester1Score, double semester2Score) {
		super(name, birthDate, address, phone);
		this.studentOfClass = studentOfClass;
		this.semester1Score = semester1Score;
		this.semester2Score = semester2Score;
	}

	public String getStudentOfClass() {
		return studentOfClass;
	}

	public void setStudentOfClass(String studentOfClass) {
		this.studentOfClass = studentOfClass;
	}

	public double getSemester1Score() {
		return semester1Score;
	}

	public void setSemester1Score(double semester1Score) {
		this.semester1Score = semester1Score;
	}

	public double getSemester2Score() {
		return semester2Score;
	}

	public void setSemester2Score(double semester2Score) {
		this.semester2Score = semester2Score;
	}
	
	/**
	 * Function: averages score of student
	 * Input: no
	 * Output: averages score of student
	 */
	public double averageScores() {
		return (semester1Score + semester2Score) / 2;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Student of class: " + this.studentOfClass + "\n";
		result += "Score of semester 1: " + this.semester1Score + "\n";
		result += "Score of semester 1: " + this.semester2Score + "\n";
		result += "Average scores: " + String.format("%.3f", this.averageScores());
		return result;
	}
}
