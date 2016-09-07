package bigexercise1;

import java.util.ArrayList;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the class result of a student in class
 */
public class ClassResult {

	private String commentOfHomeroomTeacher;
	private ArrayList<Subject> subjects = new ArrayList<Subject>();
	private Class m_Class = new Class();
	
	public ClassResult() {
		
	}
	
	public ClassResult(String commentOfHomeroomTeacher, ArrayList<Subject> subjects, Class m_Class) {
		this.commentOfHomeroomTeacher = commentOfHomeroomTeacher;
		this.subjects = subjects;
		this.m_Class = m_Class;
	}

	public String getCommentOfHomeroomTeacher() {
		return commentOfHomeroomTeacher;
	}
	
	public void setCommentOfHomeroomTeacher(String commentOfHomeroomTeacher) {
		this.commentOfHomeroomTeacher = commentOfHomeroomTeacher;
	}
	
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	public Class getM_Class() {
		return m_Class;
	}

	public void setM_Class(Class m_Class) {
		this.m_Class = m_Class;
	}
	
}
