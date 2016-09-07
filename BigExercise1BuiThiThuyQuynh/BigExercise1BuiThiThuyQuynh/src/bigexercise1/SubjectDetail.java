package bigexercise1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of a subject detail
 */
public class SubjectDetail {

	private Date startDate;
	private Date endDate;
	private int numberLesson;
	private Teacher teacher = new Teacher();
	private Subject subject = new Subject();
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public SubjectDetail() {
		
	}

	public SubjectDetail(Date startDate, Date endDate, int numberLesson, Teacher teacher, ArrayList<Student> students, Subject subject) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberLesson = numberLesson;
		this.teacher = teacher;
		this.students = students;
		this.subject = subject;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getNumberLesson() {
		return numberLesson;
	}

	public void setNumberLesson(int numberLesson) {
		this.numberLesson = numberLesson;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String result = "";
		result += ". Subject name: " + getSubject().getName() + "\t";
		result += "Teacher: " + getTeacher().getName() + "\t";
		result += "Start date: " + sdf.format(getStartDate()) + "\t";
		result += "End date: " + sdf.format(getEndDate()) + "\t";
		result += "Number of lesson: " + getNumberLesson() + "\n";
		return result;
	}
	
}
