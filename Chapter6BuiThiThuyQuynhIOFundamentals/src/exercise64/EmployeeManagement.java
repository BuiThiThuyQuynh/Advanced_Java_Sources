package exercise64;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {

	List<Employee> employees = new ArrayList<>();
	
	public EmployeeManagement() {
		
	}

	public EmployeeManagement(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public List<Employee> searchEmployee(String key) {
		List<Employee> result = employees.stream()
				.filter(e -> e.getName().contains(key))
				.collect(Collectors.toList());
		
		return result;
		
	}
	
	@Override
	public String toString() {
		String result = "========= LIST EMPLOYEE ==============\n";
		
		for (int i = 0; i < employees.size(); i++) {
			result += employees.get(i).toString();
		}
		
		return result;
	}
	
}
