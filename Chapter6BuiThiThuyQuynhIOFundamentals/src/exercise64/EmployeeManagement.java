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

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-14
 * @version 1.0
 * 
 * This is class manages the information of list employees.
 */
public class EmployeeManagement {

	List<Employee> employees = new ArrayList<Employee>();
	
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
	
	/**
	 * This method is used to add new employee to list
	 * @param employee The information of employee was added.
	 * @return Nothing.
	 */
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	/**
	 * This method is used to search employee in list employee.
	 * @param key This is search key.
	 * @return List<Employee> This is list employee of searching result.
	 */
	public List<Employee> searchEmployee(String key) {
		List<Employee> result = employees.stream()
				.filter(e -> e.getName().contains(key))
				.collect(Collectors.toList());
		
		return result;
		
	}
	
	/**
	 * This method is used to read list employee from text file.
	 * @param filePath This is path of text file.
	 * @return List<Employee> This is list employee from text file.
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public List<Employee> readFile(String filePath) throws ClassNotFoundException, IOException {
		employees = new ArrayList<Employee>();
		
		ObjectInputStream in =  new ObjectInputStream(new 
				BufferedInputStream(new FileInputStream(filePath)));;
		try {
			while (true) {
				Employee employee = (Employee) in.readObject();
				employees.add(employee);
			}
		}
		catch (IOException ex) {
			
		}
		finally {
			in.close();
		}
		
		return employees;
	
	}
	
	/**
	 * This method is used to write list employee to text file
	 * @param filePath This is path of text file.
	 * @return Nothing.
	 */
	public void writeFile(String filePath) {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(filePath));
			for (Employee employee : employees)
				out.writeObject(employee);
			
			out.close();
			System.out.println("Employee was saved");
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
	
	/**
	 * This method is used to get list employee.
	 * @param No.
	 * @return String The information all of employees in list employee.
	 */
	@Override
	public String toString() {
		
		String result = "========= LIST EMPLOYEE ==============\n";
		result += "Name\tPay rate\tNumber of Member\tSalary\tTaxable Salary\tPersonal Taxes\tReal salary\n";
		for (int i = 0; i < employees.size(); i++) {
			result += employees.get(i).toString();
		}
		
		return result;
	}
	
}
