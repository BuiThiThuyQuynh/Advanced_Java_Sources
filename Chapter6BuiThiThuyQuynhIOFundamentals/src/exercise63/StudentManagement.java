package exercise63;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManagement {

	List<Student> students = new ArrayList<>();
	
	public StudentManagement() {
		
	}

	public StudentManagement(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public int calStudentByResult(double markStart, double markEnd) {
		int result = (int) students.stream()
				.filter(x -> x.calAverage() >= markStart
						&& x.calAverage() < markEnd).count();
		return result;
	}
	
	public int calStudentByGrade(String grade) {
		int result = (int) students.stream()
				.filter(x -> x.getGrade().equals(grade)).count();
		
		return result;
	}
	
	public double calAverageGrade(String grade) {
		DoubleSummaryStatistics stats = students.stream()
				.filter(x -> x.getGrade().equals(grade))
				.mapToDouble(x -> x.calAverage()).summaryStatistics();
		
		double sum = stats.getSum();
		if (calStudentByGrade(grade) == 0)
			return 0;
		return sum / calStudentByGrade(grade);
	}
	
	public String getListByGrade(String grade) {
		String result = "======== LIST STUDENT OF GRADE " 
					+ grade + " ===========\n";
		
		List<Student> grades = students.stream().filter(x -> x.getGrade().equals(grade))
				.collect(Collectors.toList());
		
		result += "Name\t\t\tGrade\tMark1\tMark2\tAverage mark\n";
		
		for (int i = 0; i < grades.size(); i++) {
			result += grades.get(i).toString();
		}
		
		return result;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	@Override
	public String toString() {
		String result = getListByGrade("10");
		result += getListByGrade("11");
		result += getListByGrade("12");
		
		result += "=================\n";
		result += "Number excellent students: " + calStudentByResult(8, 11) + "\n";
		result += "Number good students: " + calStudentByResult(7, 8) + "\n";
		result += "Number average students: " + calStudentByResult(5, 7) + "\n";
		result += "Number weak students: " + calStudentByResult(0, 5) + "\n";
		result += "Number student of grade 10: " + calStudentByGrade("10") + "\n";
		result += "Number student of grade 11: " + calStudentByGrade("11") + "\n";
		result += "Number student of grade 12: " + calStudentByGrade("12") + "\n";
		result += "Average mark of grade 10: " + calAverageGrade("10") + "\n";
		result += "Average mark of grade 11: " + calAverageGrade("11") + "\n";
		result += "Average mark of grade 12: " + calAverageGrade("12") + "\n";
		
		return result;
	}
	
}
