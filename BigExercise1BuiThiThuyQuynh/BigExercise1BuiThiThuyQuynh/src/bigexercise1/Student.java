package bigexercise1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of a student, extends from Person class
 */
public class Student extends Person {
	
	private Date birthDate;
	private SubjectResult subjectResult = new SubjectResult();
	
	public Student() {
		
	}
	
	public Student(String name, String phoneNumber, String email, Date birthDate, SubjectResult subjectResults) {
		super(name, phoneNumber, email);
		this.birthDate = birthDate;
		this.subjectResult = subjectResults;
	}
	
	public Student(String name, String phoneNumber, String email, Date birthDate) {
		super(name, phoneNumber, email);
		this.birthDate = birthDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public SubjectResult getSubjectResults() {
		return subjectResult;
	}

	public void setSubjectResults(SubjectResult subjectResults) {
		this.subjectResult = subjectResults;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String result = "";
		result += ". Student name: " + getName() + "\t";
		result += "Date of birth: " + sdf.format(getBirthDate()) + "\t";
		result += "Phone number: " + getPhoneNumber() + "\t";
		result += "Email: " + getEmail() + "\n";
		return result;
	}
}
