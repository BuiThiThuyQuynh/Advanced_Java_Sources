package stream;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author ThuyQuynh
 * @since 2016-09-20
 * @version 1.0
 * 
 * This is JUnit Test class for double calAverageAge() method 
 * 	in EmployeeManagement class.
 * @param No.
 * @return double This is average salary of all of employees.
 */
public class CalculationAverageAgeJUnitTest {

	@Test
	public void testcalAverageAge1() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		double ex = 0;
		double ac = EmployeeManagement.calAverageAge();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testcalAverageAge2() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		EmployeeManagement.employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		EmployeeManagement.employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		double ex = 22.75;
		double ac = EmployeeManagement.calAverageAge();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testcalAverageAge3() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		EmployeeManagement.employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		EmployeeManagement.employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		EmployeeManagement.employees.add(new Employee("Lê Tấn Kiệt", 23, 30000000));
		
		EmployeeManagement.employees.add(new Employee("Nguyễn Trần Cát Tiên", 22, 28000000));
		EmployeeManagement.employees.add(new Employee("Nguyễn Văn Tuấn", 22, 40000000));
		double ex = 22.57;
		double ac = EmployeeManagement.calAverageAge();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testcalAverageAge4() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		double ex = 22.5;
		double ac = EmployeeManagement.calAverageAge();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testcalAverageAge5() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Bùi Dương Thúy Vy", 18, 15000000));
		EmployeeManagement.employees.add(new Employee("Bùi Thị Yến Nhi", 19, 18000000));
		EmployeeManagement.employees.add(new Employee("Bùi Thị Lan Anh", 22, 26000000));
		double ex = 20.25;
		double ac = EmployeeManagement.calAverageAge();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testcalAverageAge6() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Bùi Dương Thúy Vy", 18, 15000000));
		EmployeeManagement.employees.add(new Employee("Bùi Thị Yến Nhi", 19, 18000000));
		EmployeeManagement.employees.add(new Employee("Bùi Thị Lan Anh", 22, 26000000));
		double ex = 20.2;
		double ac = EmployeeManagement.calAverageAge();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testcalAverageAge7() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		double ex = 22;
		double ac = EmployeeManagement.calAverageAge();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testcalAverageAge8() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		EmployeeManagement.employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		EmployeeManagement.employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		EmployeeManagement.employees.add(new Employee("Lê Tấn Kiệt", 23, 30000000));
		
		EmployeeManagement.employees.add(new Employee("Nguyễn Trần Cát Tiên", 22, 28000000));
		EmployeeManagement.employees.add(new Employee("Nguyễn Văn Tuấn", 22, 40000000));
		double ex = 19.2857;
		double ac = EmployeeManagement.calAverageAge();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testcalAverageAge9() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		double ex = 0;
		double ac = EmployeeManagement.calAverageAge();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testcalAverageAge10() {
		EmployeeManagement.employees = new ArrayList<Employee>();
		EmployeeManagement.employees.add(new Employee("Bùi Thị Thúy Quỳnh", 22, 20000000));
		EmployeeManagement.employees.add(new Employee("Trương Thị Thanh Thảo", 23, 22000000));
		EmployeeManagement.employees.add(new Employee("Lê Phương Thanh", 23, 26000000));
		EmployeeManagement.employees.add(new Employee("Trương Ngọc Tinh Anh", 23, 18000000));
		double ex = 22.7;
		double ac = EmployeeManagement.calAverageAge();
		assertNotEquals(ex, ac, 0);
	}

}
