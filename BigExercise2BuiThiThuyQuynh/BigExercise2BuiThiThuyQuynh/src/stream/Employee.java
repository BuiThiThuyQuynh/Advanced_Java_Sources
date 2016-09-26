package stream;

import java.text.DecimalFormat;

/**
 * @author ThuyQuynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * The Employee class manages the information of a employee.
 */
public class Employee {

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
	 * This method is used to get information of an employee.
	 * @param No.
	 * @return String This is string of the information of employee.
	 */
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		return name + "\t\t" + age + "\t" + df.format(salary) + "\n";
	}
}
