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
public class ManagementStudent {

	private ArrayList<Student> listStudent = new ArrayList<Student>();
	
	public ManagementStudent() {
		
	}

	public ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public void setDefaultListStudent() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date birthDate = sdf.parse("07/12/1994");
		this.listStudent.add(new Student("Bui Thi Thuy Quynh", "0987654321", "quynhbtt@gmail.com", birthDate));
		
		birthDate = sdf.parse("05/05/1993");
		this.listStudent.add(new Student("Le Phuong Thanh", "0987654321", "thanhlp@gmail.com", birthDate));
		
		birthDate = sdf.parse("11/11/1993");
		this.listStudent.add(new Student("Truong Thi Thanh Thao", "0987654321", "thaottt@gmail.com", birthDate));
	}

	public void addStudent(Student student) {
		listStudent.add(student);
	}
	
	public void deleteStudent(int index) {
		listStudent.remove(index);
	}
	
	public void updateStudent(int index, Student student) {
		listStudent.set(index, student);
	}
	
	public String showListStudent() {
		String result = "";
		for (int i = 0; i < listStudent.size(); i++) {
			result += (i + 1) + listStudent.get(i).toString();
		}
		
		return result;
	}
	
}
