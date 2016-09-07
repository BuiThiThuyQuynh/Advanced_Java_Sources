package exercise23;

import java.util.Map;
import java.util.TreeMap;

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
	
	public void addStudent(String id, Student student) {
		listStudent.put(id, student);
	}
	
	public Student searchStudent(String id) {
		for (String key : listStudent.keySet()) {
			if(key.equals(id)) {
				return listStudent.get(key);
			}
		}
		return null;
	}
	
	public String deleteStudent(String id) {
		if (searchStudent(id) != null) {
			listStudent.remove(id, searchStudent(id));
			return id + " was removed from list student";
		}
		return id + " was not found";
	}
	
	@Override
	public String toString() {
		String result = "===== LIST STUDENT =====\n";
		
		for (String key : listStudent.keySet()) {
			result += key + "\t" + listStudent.get(key).toString();
		}
		return result;
	}
}
