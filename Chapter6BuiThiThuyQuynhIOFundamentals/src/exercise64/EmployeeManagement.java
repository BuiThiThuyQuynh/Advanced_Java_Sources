package exercise64;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {

	List<Employee> employees = new ArrayList<>();
	
	public EmployeeManagement(String filePath) throws ClassNotFoundException, IOException {
		readFile(filePath);
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
	
	public List<Employee> readFile(String filePath) throws ClassNotFoundException, IOException {
		employees = new ArrayList<Employee>();
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new 
					BufferedInputStream(new FileInputStream(filePath)));
					
			while (true) {
				Employee employee = (Employee) in.readObject();
				employees.add(employee);
			}
			
			
		}
		catch (IOException ex) {
			//System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		finally {
			in.close();
		}
		
		return employees;
	
	}
	
	public void writeFile(String filePath) {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(filePath));
			for (Employee employee : employees)
				out.writeObject(employee);
			out.close();
		}
		catch (IOException ex) {
			//System.out.println("Exception: " + ex);
			ex.printStackTrace();
		}
		
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
