package bigexercise1;

import java.util.ArrayList;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the class result of a student in class
 */
public class ManagementSubject {

	private ArrayList<Subject> listSubject = new ArrayList<Subject>();
	
	public ManagementSubject() {
		
	}

	public ArrayList<Subject> getListSubject() {
		return listSubject;
	}

	public void setDefaultListSubject() {
		this.listSubject.add(new Subject("Java Fundamentals"));
		this.listSubject.add(new Subject("Advandce Java"));
		this.listSubject.add(new Subject("Linux Fundamentals"));
		this.listSubject.add(new Subject("Linux Programming"));
	}
	
	public void addSubject(Subject subject) {
		listSubject.add(subject);
	}
	
	public void updateSubject(int index, Subject subject) {
		this.listSubject.set(index, subject);
	}
	
	public void deleteSubjectDetails(int index) {
		this.listSubject.remove(index);
	}
	
	
	
	public String showListSubject() {
		String result = "";
		for (int i = 0; i < listSubject.size(); i++) {
			result += (i + 1) + listSubject.get(i).toString();
		}
		
		return result;
	}

}
