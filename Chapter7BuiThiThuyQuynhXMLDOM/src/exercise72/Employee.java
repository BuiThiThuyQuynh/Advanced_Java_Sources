package exercise72;

import java.text.DecimalFormat;

public class Employee {

	private int id;
	private String name;
	private int sex;
	private String birthDate;
	private double salary;
	private String address;
	private int departmentId;
	
	public Employee() {
		
	}

	public Employee(int id, String name, int sex, 
			String birthDate, double salary, 
			String address, int departmentId) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
		this.salary = salary;
		this.address = address;
		this.departmentId = departmentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		
		String result = id + "\t" + name + "\t" + sex + "\t"
				+ birthDate + "\t" + df.format(salary) + "\t" 
				+ address + "\t" + departmentId + "\n";
		return result;
	}
	
	
}
