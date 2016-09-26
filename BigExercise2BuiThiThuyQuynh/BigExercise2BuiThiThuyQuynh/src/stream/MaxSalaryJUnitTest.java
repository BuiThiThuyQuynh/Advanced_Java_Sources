package stream;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author ThuyQuynh
 * @since 2016-09-20
 * @version 1.0
 * 
 * This is JUnit Test class for double getMaxSalary() method 
 * 	in EmployeeManagement class.
 * @param No.
 * @return double This is average salary of all of employees.
 */
public class MaxSalaryJUnitTest {

	@Test
	public void testgetMaxSalary1() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		double ex = 0;
		double ac = EmployeeManagement.getMaxSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testgetMaxSalary2() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		EmployeeManagement.employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		EmployeeManagement.employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		double ex = 26000000;
		double ac = EmployeeManagement.getMaxSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testgetMaxSalary3() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		EmployeeManagement.employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		EmployeeManagement.employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		EmployeeManagement.employees.add(new Employee("Lê Tấn Kiệt", 23, 30000000));
		
		EmployeeManagement.employees.add(new Employee("Nguyễn Trần Cát Tiên", 22, 28000000));
		EmployeeManagement.employees.add(new Employee("Nguyễn Văn Tuấn", 22, 40000000));
		double ex = 40000000;
		double ac = EmployeeManagement.getMaxSalary();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testgetMaxSalary4() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		double ex = 22000000;
		double ac = EmployeeManagement.getMaxSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testgetMaxSalary5() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Bùi Dương Thúy Vy", 18, 15000000));
		EmployeeManagement.employees.add(new Employee("Bùi Thị Yến Nhi", 19, 18000000));
		EmployeeManagement.employees.add(new Employee("Bùi Thị Lan Anh", 22, 26000000));
		double ex = 26000000;
		double ac = EmployeeManagement.getMaxSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testgetMaxSalary6() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Bùi Dương Thúy Vy", 18, 15000000));
		EmployeeManagement.employees.add(new Employee("Bùi Thị Yến Nhi", 19, 18000000));
		EmployeeManagement.employees.add(new Employee("Bùi Thị Lan Anh", 22, 26000000));
		double ex = 19700000;
		double ac = EmployeeManagement.getMaxSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testgetMaxSalary7() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		double ex = 21000000.1;
		double ac = EmployeeManagement.getMaxSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testgetMaxSalary8() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		EmployeeManagement.employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		EmployeeManagement.employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		EmployeeManagement.employees.add(new Employee("Lê Tấn Kiệt", 23, 30000000));
		
		EmployeeManagement.employees.add(new Employee("Nguyễn Trần Cát Tiên", 22, 28000000));
		EmployeeManagement.employees.add(new Employee("Nguyễn Văn Tuấn", 22, 40000000));
		double ex = 26285714;
		double ac = EmployeeManagement.getMaxSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testgetMaxSalary9() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		double ex = 0;
		double ac = EmployeeManagement.getMaxSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testgetMaxSalary10() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		EmployeeManagement.employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		EmployeeManagement.employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		double ex = 21500000.1;
		double ac = EmployeeManagement.getMaxSalary();
		assertNotEquals(ex, ac, 0);
	}

}
