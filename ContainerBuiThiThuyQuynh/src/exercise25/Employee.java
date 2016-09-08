package exercise25;

import java.text.DecimalFormat;

/**
 * @author Bui Thi Thuy Quynh
 * @date 08/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of an student
 */
public class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	/**
	 * @description get the information of an employee
	 * @return string about information of an employee
	 */
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		
		String result = getName() + "\t" + getAge() + "\t" + df.format(getSalary()) + "\n";
		return result;
	}
	
	/**
	 * @description override compareTo method to compare two CD object
	 * @return 
	 */
	@Override
	public int compareTo(Employee o) {
		if (this.getSalary() < o.getSalary())
			return 0;
		return -1;
	}
}
