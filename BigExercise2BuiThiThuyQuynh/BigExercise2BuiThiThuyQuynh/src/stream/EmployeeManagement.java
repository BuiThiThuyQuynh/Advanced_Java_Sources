package stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is class manages the information of list employees.
 */
public class EmployeeManagement {

	static List<Employee> employees;
	
	/**
	 * This method is used to set default value for list employees
	 * @param No.
	 * @return Nothing.
	 */
	public static void setDefaultList() {
		employees = new ArrayList<Employee>();
		
		employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		employees.add(new Employee("Lê Tấn Kiệt", 23, 30000000));
		
		employees.add(new Employee("Nguyễn Trần Cát Tiên", 22, 28000000));
		employees.add(new Employee("Nguyễn Văn Tuấn", 22, 40000000));
		employees.add(new Employee("Lê Đức Phi", 22, 35000000));
		employees.add(new Employee("Nguyễn Tuấn Anh", 22, 20000000));
		employees.add(new Employee("Lê Anh Tuấn", 22, 39000000));
		
		employees.add(new Employee("Bùi Dương Thúy Vy", 18, 15000000));
		employees.add(new Employee("Bùi Thị Yến Nhi", 19, 18000000));
		employees.add(new Employee("Bùi Thị Lan Anh", 22, 26000000));
		employees.add(new Employee("Phạm Mai My", 22, 34000000));
		employees.add(new Employee("Lê Thị Tường Vân", 22, 22000000));
	}
	
	/**
	 * This method is used to print list employees on the screen.
	 * @param list This is list employee that you want to print.
	 * @return Nothing.
	 */
	public static void printList(List<Employee> list) {
		// Print list
		System.out.println("Name\t\tAge\tSalary");
		list.stream().forEach(System.out::print);
	}
	
	/**
	 * This method is used to count employees have salary greater than condition
	 * @param condition This is condition of salary want to filter.
	 * @return int This is number employees have enough condition.
	 */
	public static int countEmployeeBySalary(double condition) {
		// Count employees have salary > 30000000 and print this list.
		int count = (int) employees.stream().filter(e -> e.getSalary() > condition).count();
		return count;
	}
	
	/**
	 * This method is used to get employees by condition of salary.
	 * @param condition This is condition of salary want to filter.
	 * @return List<Employee> This is list employees have enough condition.
	 */
	public static List<Employee> getListEmployeeBySalary(double condition) {
		List<Employee> result = employees.stream()
				.filter(e -> e.getSalary() > condition)
				.collect(Collectors.toList());
		return result;
	}
	
	/**
	 * This method is used to get employees have name contain a word in name.
	 * @param name This is condition of name want to filter.
	 * @return List<Employee> This is list employees have enough condition.
	 */
	public static List<Employee> getListEmployeeByName(String name) {
		// Print list employee who have name contain 'Anh'
		List<Employee> result = employees.stream()
				.filter(e -> e.getName().contains(name))
				.collect(Collectors.toList());
		return result;
	}
	
	/**
	 * This method is used to calculate average age of all of employees.
	 * @param No.
	 * @return double This is average age of all of employees.
	 */
	public static double calAverageAge() {
		// Average age of employee
		DoubleSummaryStatistics stats = employees.stream()
				.mapToDouble(e -> e.getAge()).summaryStatistics();
		return stats.getAverage();
	}
	
	/**
	 * This method is used to find max salary of all of employees.
	 * @param No.
	 * @return double This is max salary of all of employees.
	 */
	public static double getMaxSalary() {
		// Statistic salary of employee
		DoubleSummaryStatistics stats2 = employees.stream()
				.mapToDouble(e -> e.getSalary()).summaryStatistics();
		return employees.size() > 0 ? stats2.getMax() : 0;
	}
	
	/**
	 * This method is used to find min salary of all of employees.
	 * @param No.
	 * @return double This is min salary of all of employees.
	 */
	public static double getMinSalary() {
		// Statistic salary of employee
		DoubleSummaryStatistics stats2 = employees.stream()
				.mapToDouble(e -> e.getSalary()).summaryStatistics();
		return employees.size() > 0 ? stats2.getMin() : 0;
	}
	
	/**
	 * This method is used to calculate average salary of all of employees.
	 * @param No.
	 * @return double This is average salary of all of employees.
	 */
	public static double getAverageSalary() {
		// Statistic salary of employee
		DoubleSummaryStatistics stats2 = employees.stream()
				.mapToDouble(e -> e.getSalary()).summaryStatistics();
		return employees.size() > 0 ? stats2.getAverage() : 0;
	}
	
	public static void main(String[] args) {
		// Set default value for list employees and print list on the screen.
		setDefaultList();
		System.out.println("======== LIST EMPLOYEES ============");
		printList(employees);
		
		// Count and print list employees have salary > 30000000
		System.out.println("Number employees have salary > 30000000: " 
				+ countEmployeeBySalary(30000000));
		System.out.println("==== LIST EMPLOYEES HAVE SALARY > 30000000 ============");
		printList(getListEmployeeBySalary(30000000));
		
		// Print list employees whose name have word 'Anh'
		System.out.println("=== LIST EMPLOYEES HAVE NAME CONTAIN 'ANH' ============");
		printList(getListEmployeeByName("Anh"));
		
		// Calculate average salary of list employees.
		System.out.println("=============================");
		System.out.println("Average age of employee: " + calAverageAge());
		
		// Statistic salary of employee included highest salary, lowest salary and average salary.
		System.out.println("Highest salary: " + getMaxSalary());
		System.out.println("Lowest salary: " + getMinSalary());
		System.out.println("Average salary: " + getAverageSalary());
	}
}
