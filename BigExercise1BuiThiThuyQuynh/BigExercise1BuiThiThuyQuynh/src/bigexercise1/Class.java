package bigexercise1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the general information of a class
 */
public class Class {

	private String contractID;
	private String name;
	private Date startDate;
	private Date endDate;
	private int numberOfLesson;
	private Teacher homeroomTeacher = new Teacher();
	private ArrayList<SubjectDetail> listSubject = new ArrayList<SubjectDetail>();
	
	public Class() {
		
	}

	public Class(String contractID, String name, Date startDate, Date endDate, int numberOfLesson,
			Teacher homeroomTeacher, ArrayList<SubjectDetail> listSubject) {
		this.contractID = contractID;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.numberOfLesson = numberOfLesson;
		this.homeroomTeacher = homeroomTeacher;
		this.listSubject = listSubject;
	}

	public String getContractID() {
		return contractID;
	}

	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getNumberOfLesson() {
		return numberOfLesson;
	}

	public void setNumberOfLesson(int numberOfLesson) {
		this.numberOfLesson = numberOfLesson;
	}

	public Teacher getHomeroomTeacher() {
		return homeroomTeacher;
	}

	public void setHomeroomTeacher(Teacher homeroomTeacher) {
		this.homeroomTeacher = homeroomTeacher;
	}

	public ArrayList<SubjectDetail> getListSubject() {
		return listSubject;
	}

	public void setSubject(ArrayList<SubjectDetail> listSubject) {
		this.listSubject = listSubject;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String result = "";
		result += ". Contract ID: " + getContractID() + "\t";
		result += "Class name: " + getName() + "\t";
		result += "Start date: " + sdf.format(getStartDate()) + "\t";
		result += "End date: " + sdf.format(getEndDate()) + "\t";
		result += "Number of lesson: " + getNumberOfLesson() + "\t";
		result += "Homeroom teacher: " + getHomeroomTeacher().getName() + "\n";
		return result;
	}
	
}
