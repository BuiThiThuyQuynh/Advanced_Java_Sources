/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calSalary() method of Exercise16Employee
 * Input: coefficientsSalary, allowance
 * Output: salary of an employee
 */

package exercise64;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalSalaryJUnitTest {
	
	Employee employee;

	@Test
	public void testCalSalary1() {
		employee = new Employee();
		employee.setCoefficientsSalary(2.67);
		employee.setAllowance(12000000);
		double ex = 15364200;
		double ac = employee.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary2() {
		employee = new Employee();
		employee.setCoefficientsSalary(1);
		employee.setAllowance(13000000);
		double ex = 14260000;
		double ac = employee.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary3() {
		employee = new Employee();
		employee.setCoefficientsSalary(0);
		employee.setAllowance(12000000);
		double ex = 12000000;
		double ac = employee.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary4() {
		employee = new Employee();
		employee.setCoefficientsSalary(3);
		employee.setAllowance(15000000);
		double ex = 18780000;
		double ac = employee.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary5() {
		employee = new Employee();
		employee.setCoefficientsSalary(6);
		employee.setAllowance(20000000);
		double ex = 27560000;
		double ac = employee.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary6() {
		employee = new Employee();
		employee.setCoefficientsSalary(0);
		employee.setAllowance(13000000);
		double ex = 0;
		double ac = employee.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary7() {
		employee = new Employee();
		employee.setCoefficientsSalary(2.3);
		employee.setAllowance(10000000);
		double ex = 12800000;
		double ac = employee.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary8() {
		employee = new Employee();
		employee.setCoefficientsSalary(3);
		employee.setAllowance(1000000);
		double ex = 3000000;
		double ac = employee.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary9() {
		employee = new Employee();
		employee.setCoefficientsSalary(4);
		employee.setAllowance(10000000);
		double ex = 15000000;
		double ac = employee.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSalary10() {
		employee = new Employee();
		employee.setCoefficientsSalary(1.2);
		employee.setAllowance(10000000);
		double ex = 11510000;
		double ac = employee.calSalary();
		assertNotEquals(ex, ac, 0);
	}

}
