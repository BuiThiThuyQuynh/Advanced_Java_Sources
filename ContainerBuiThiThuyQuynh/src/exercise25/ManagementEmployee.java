package exercise25;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Bui Thi Thuy Quynh
 * @date 08/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of list employee
 */
public class ManagementEmployee {

	private Map<String, Employee> listEmployee = new HashMap<String, Employee>();
	
	public ManagementEmployee() {
		
	}

	public ManagementEmployee(Map<String, Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}

	public Map<String, Employee> getListEmployee() {
		return listEmployee;
	}

	public void setListEmployee(Map<String, Employee> listEmployee) {
		this.listEmployee = listEmployee;
	}
	
	private static Map<String, Employee> sortByValue(Map<String, Employee> map) { 
		// Convert Map to LinkedList
		List<Map.Entry<String, Employee>> list = new LinkedList<Map.Entry<String, Employee>>(map.entrySet());
		
		// Sort list by value of Map
		Collections.sort(list, new Comparator<Map.Entry<String, Employee>>() {
			public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// Copy the sorted list in HashMap
		Map<String, Employee> sortedHashMap = new LinkedHashMap<String, Employee>();
		for (Map.Entry<String, Employee> entry : list) {
			sortedHashMap.put(entry.getKey(), entry.getValue());
		} 
		
		return sortedHashMap;
	}

	/**
	  * @description function for addition a employee to list employee
	  * @param0 id of student
	  * @param1 student want to add
	  */
	public void addStudent(String id, Employee employee) {
		listEmployee.put(id, employee);
	}
	 
	/**
	 * @description get list employee
	 * @return list employee
	 */
	@Override
	public String toString() {
		String result = "";
		
		Map<String, Employee> listSorted = sortByValue(listEmployee);
		System.out.println("================ LIST EMPLOYEE ===============");
		System.out.println("ID\tName\tAge\tSalary");
		for (String key : listSorted.keySet()) {
			result += key + "\t" + listSorted.get(key);
		}
		
		return result;
	}
}
