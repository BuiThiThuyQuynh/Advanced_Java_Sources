package stream;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author ThuyQuynh
 * @since 2016-09-20
 * @version 1.0
 * 
 * This is JUnit Test class for int countEmployeeBySalary(double condition) method 
 * 	in EmployeeManagement class.
 * @param condition This is condition of salary want to filter.
 * @return int This is number employees have enough condition.
 */
public class NumberEmployeeBySalaryJUnitTest {

	@Test
	public void testCountEmployeeBySalary1() {
		EmployeeManagement.setDefaultList();
		double ex = 15;
		double ac = EmployeeManagement.countEmployeeBySalary(3000000);
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCountEmployeeBySalary2() {
		EmployeeManagement.setDefaultList();
		double ex = 15;
		double ac = EmployeeManagement.countEmployeeBySalary(0);
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCountEmployeeBySalary3() {
		EmployeeManagement.setDefaultList();
		double ex = 0;
		double ac = EmployeeManagement.countEmployeeBySalary(40000000);
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCountEmployeeBySalary4() {
		EmployeeManagement.setDefaultList();
		double ex = 10;
		double ac = EmployeeManagement.countEmployeeBySalary(20000000);
		assertEquals(ex, ac, 0);
	}
	
	
	@Test
	public void testCountEmployeeBySalary5() {
		EmployeeManagement.setDefaultList();
		double ex = 4;
		double ac = EmployeeManagement.countEmployeeBySalary(30000000);
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCountEmployeeBySalary6() {
		EmployeeManagement.setDefaultList();
		double ex = 15;
		double ac = EmployeeManagement.countEmployeeBySalary(20000000);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCountEmployeeBySalary7() {
		EmployeeManagement.setDefaultList();
		double ex = 0;
		double ac = EmployeeManagement.countEmployeeBySalary(0);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCountEmployeeBySalary8() {
		EmployeeManagement.setDefaultList();
		double ex = 2;
		double ac = EmployeeManagement.countEmployeeBySalary(20000000);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCountEmployeeBySalary9() {
		EmployeeManagement.setDefaultList();
		double ex = 3;
		double ac = EmployeeManagement.countEmployeeBySalary(35000000);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCountEmployeeBySalary10() {
		EmployeeManagement.setDefaultList();
		double ex = 15;
		double ac = EmployeeManagement.countEmployeeBySalary(15000000);
		assertNotEquals(ex, ac, 0);
	}
	

}
