package exercise63;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class manages the information of an list student.
 */
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
	
	/**
	 * This method is used to count student by result (excellent, good, average or weak)
	 * @param markStart This is start mark of rate.
	 * @param markEnd This is end mark of rate.
	 * @return int This is number of student in rate.
	 */
	public int calStudentByResult(double markStart, double markEnd) {
		int result = (int) students.stream()
				.filter(x -> x.calAverage() >= markStart
						&& x.calAverage() < markEnd).count();
		return result;
	}
	
	/**
	 * This method is used to count student by grades (10, 11 or 12)
	 * @param grade This is grade want to count.
	 * @return int This is number of student of grade.
	 */
	public int calStudentByGrade(String grade) {
		int result = (int) students.stream()
				.filter(x -> x.getGrade().equals(grade)).count();
		
		return result;
	}
	
	/**
	 * This method is used to calculate average mark of all students by grades (10, 11 or 12)
	 * @param grade This is grade want to calculate average mark.
	 * @return double This is average mark of grade.
	 */
	public double calAverageGrade(String grade) {
		DoubleSummaryStatistics stats = students.stream()
				.filter(x -> x.getGrade().equals(grade))
				.mapToDouble(x -> x.calAverage()).summaryStatistics();
		
		double sum = stats.getSum();
		if (calStudentByGrade(grade) == 0)
			return 0;
		return sum / calStudentByGrade(grade);
	}
	
	/**
	 * This method is used to get list student by grades (10, 11 or 12)
	 * @param grade This is grade want to get list student.
	 * @return String This is list student of grade.
	 */
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
	
	/**
	 * This method is used to add new student to list.
	 * @param student The information of student is added.
	 * @return Nothing.
	 */
	public void addStudent(Student student) {
		students.add(student);
	}
	
	/**
	 * This method is used to get list student by grades (10, 11 or 12)
	 * 	and static result.
	 * @param No.
	 * @return String This is list student of grades and static result.
	 */
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
