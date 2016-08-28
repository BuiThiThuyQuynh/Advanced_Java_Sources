/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise110;

import java.util.Date;

/**
 * @description class manages a student, extends from Human class
 */
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
	 * @description calculation averages score of student
	 * @return averages score of student
	 */
	public double averageScores() {
		return (semester1Score + semester2Score) / 2;
	}
	
	/**
	 * @description get all the information of a student
	 * @return string about information of a student
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Student of class: " + this.studentOfClass + "\n";
		result += "Score of semester 1: " + this.semester1Score + "\n";
		result += "Score of semester 1: " + this.semester2Score + "\n";
		result += "Average scores: " + String.format("%.3f", this.averageScores()) + "\n";
		return result;
	}
}
