package bigexercise1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the class result of a student in class
 */
public class ManagementTeacher {

	private ArrayList<Teacher> listTeacher = new ArrayList<Teacher>();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	ArrayList<Subject> teachAbility = new ArrayList<Subject>();
	ManagementSubject managementSubject = new ManagementSubject();
	
	public ManagementTeacher() {
		
	}

	public ArrayList<Teacher> getListTeacher() {
		return listTeacher;
	}

	public void setDefaultListTeacher() {
		managementSubject.setDefaultListSubject();
		
		teachAbility.add(managementSubject.getListSubject().get(0));
		teachAbility.add(managementSubject.getListSubject().get(1));
		this.listTeacher.add(new Teacher("Khuat Thuy Phuong", "0987654321", "", teachAbility));
		
		teachAbility = new ArrayList<Subject>();
		teachAbility.add(managementSubject.getListSubject().get(1));
		teachAbility.add(managementSubject.getListSubject().get(2));
		this.listTeacher.add(new Teacher("Vuong Quoc Trung", "0987654321", "", teachAbility));
		
		teachAbility = new ArrayList<Subject>();
		teachAbility.add(managementSubject.getListSubject().get(3));
		teachAbility.add(managementSubject.getListSubject().get(1));
		teachAbility.add(managementSubject.getListSubject().get(0));
		this.listTeacher.add(new Teacher("Nguyen Minh Dao", "0987654321", "", teachAbility));
	}
	
	public void addListTeacher(Teacher teacher) {
		this.listTeacher.add(teacher);
	}
	
	public void updateListTeacher(int index, Teacher teacher) {
		this.listTeacher.set(index, teacher);
	}
	
	public void deleteListTeacher(int index) {
		this.listTeacher.remove(index);
	}
	
	/**
	 * 
	 */
	public String showListTeacher() {
		String result = "";
		for (int i = 0; i < listTeacher.size(); i++) {
			result += (i + 1) + listTeacher.get(i).toString();
		}
		
		return result;
	}
	
}
