package exercise23;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Bui Thi Thuy Quynh
 * @date 07/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of list student
 */
public class ManagementStudent {

	private Map<String, Student> listStudent = new TreeMap<String, Student>();
	
	public ManagementStudent() {
		
	}

	public ManagementStudent(Map<String, Student> listStudent) {
		this.listStudent = listStudent;
	}

	public Map<String, Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(Map<String, Student> listStudent) {
		this.listStudent = listStudent;
	}
	
	/**
	 * @description function for addition a student to list student
	 * @param0 id of student
	 * @param1 student want to add
	 */
	public void addStudent(String id, Student student) {
		listStudent.put(id, student);
	}
	
	/**
	 * @description function for searching a student by id to list student
	 * @param id of student want to search
	 * @return information of student was found
	 */
	public Student searchStudent(String id) {
		for (String key : listStudent.keySet()) {
			if(key.equals(id)) {
				return listStudent.get(key);
			}
		}
		return null;
	}
	
	/**
	 * @description function for deletion a student by id to list student
	 * @param id of student want to delete
	 * @return message inform student was removed or not
	 */
	public String deleteStudent(String id) {
		if (searchStudent(id) != null) {
			listStudent.remove(id, searchStudent(id));
			return id + " was removed from list student";
		}
		return id + " was not found";
	}
	
	/**
	 * @description get list student
	 * @return list student
	 */
	@Override
	public String toString() {
		String result = "===== LIST STUDENT =====\n";
		for (String key : listStudent.keySet()) {
			result += key + "\t" + listStudent.get(key).toString();
		}
		return result;
	}
}
