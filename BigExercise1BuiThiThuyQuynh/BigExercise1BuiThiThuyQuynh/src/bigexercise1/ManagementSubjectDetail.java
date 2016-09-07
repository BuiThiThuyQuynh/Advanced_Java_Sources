package bigexercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the class result of a student in class
 */
public class ManagementSubjectDetail {

	private ArrayList<SubjectDetail> subjectDetails = new ArrayList<SubjectDetail>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date startDate;
	Date endDate;
	
	ManagementTeacher managementTeacher = new ManagementTeacher();
	ManagementStudent managementStudent = new ManagementStudent();
	ManagementSubject managementSubject = new ManagementSubject();
	
	public ManagementSubjectDetail() {
		
	}

	public ArrayList<SubjectDetail> getSubjectDetails() {
		return subjectDetails;
	}
	
	public void setSubjectDetails(ArrayList<SubjectDetail> subjectDetails) {
		this.subjectDetails = subjectDetails;
	}

	public void setDefaultSubjectDetail() throws ParseException {
		managementStudent.setDefaultListStudent();
		managementSubject.setDefaultListSubject();
		managementTeacher.setDefaultListTeacher();
		
		startDate = sdf.parse("01/08/2016");
		endDate = sdf.parse("01/09/2016");
		
		
		this.subjectDetails.add(new SubjectDetail(startDate, endDate, 500, 
				managementTeacher.getListTeacher().get(0), managementStudent.getListStudent(),
				managementSubject.getListSubject().get(0)));
		
		this.subjectDetails.add(new SubjectDetail(startDate, endDate, 500, 
				managementTeacher.getListTeacher().get(2), managementStudent.getListStudent(),
				managementSubject.getListSubject().get(1)));
		
		this.subjectDetails.add(new SubjectDetail(startDate, endDate, 500, 
				managementTeacher.getListTeacher().get(1), managementStudent.getListStudent(),
				managementSubject.getListSubject().get(2)));
		
		this.subjectDetails.add(new SubjectDetail(startDate, endDate, 500, 
				managementTeacher.getListTeacher().get(2), managementStudent.getListStudent(),
				managementSubject.getListSubject().get(3)));
	}

	public void addSubjectDetails(SubjectDetail subjectDetail) {
		this.subjectDetails.add(subjectDetail);
	}

	public void updateSubjectDetails(int index, SubjectDetail subjectDetail) {
		this.subjectDetails.set(index, subjectDetail);
	}
	
	public void deleteSubjectDetails(int index) {
		this.subjectDetails.remove(index);
	}
	
	public ArrayList<Student> getAllStudent(int index) {
		return subjectDetails.get(index).getStudents();
	}
	
	public String showListSubject() {
		String result = "";
		for (int i = 0; i < subjectDetails.size(); i++) {
			result += (i + 1) + subjectDetails.get(i).toString();
		}
		
		return result;
	}
	
}
