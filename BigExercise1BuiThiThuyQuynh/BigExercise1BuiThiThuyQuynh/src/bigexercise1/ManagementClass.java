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
public class ManagementClass {

	private ArrayList<Class> listClass = new ArrayList<Class>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date startDate;
	Date endDate;
	
	ManagementTeacher managementTeacher = new ManagementTeacher();
	ManagementSubjectDetail managementSubject = new ManagementSubjectDetail();

	public ManagementClass() {
		
	}

	public ArrayList<Class> getListClass() {
		return listClass;
	}
	
	public void setListClass(ArrayList<Class> listClass) {
		this.listClass = listClass;
	}

	public void setDefaultListClass() throws ParseException {
		managementTeacher.setDefaultListTeacher();
		managementSubject.setDefaultSubjectDetail();
		
		startDate = sdf.parse("11/08/2016");
		endDate = sdf.parse("11/10/2016");
		this.listClass.add(new Class("HD01", "Java on Linux 3", startDate, endDate, 500, 
				managementTeacher.getListTeacher().get(0), 
				managementSubject.getSubjectDetails()));
		
		startDate = sdf.parse("11/08/2016");
		endDate = sdf.parse("11/10/2016");
		this.listClass.add(new Class("HD02", "Java on Linux 1", startDate, endDate, 500, 
				managementTeacher.getListTeacher().get(1), 
				managementSubject.getSubjectDetails()));
		
		startDate = sdf.parse("11/08/2016");
		endDate = sdf.parse("11/10/2016");
		this.listClass.add(new Class("HD03", "Java on Linux 2", startDate, endDate, 500, 
				managementTeacher.getListTeacher().get(2), 
				managementSubject.getSubjectDetails()));
	}
	
	public ArrayList<SubjectDetail> getAllSubject(int index) {
		return listClass.get(index).getListSubject();
	}
	
	public String showListClass() {
		String result = "";
		for (int i = 0; i < listClass.size(); i++) {
			result += (i + 1) + listClass.get(i).toString();
		}
		
		return result;
	}
}
