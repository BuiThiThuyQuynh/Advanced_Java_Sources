/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calPersonalTaxes() method of Exercise16Employee
 * Input: coefficientsSalary, allowance, numberOfFamily
 * Output: personal taxes of an employee
 */
 
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise16Employee;

public class Exercise16CalPersonalTaxesJUnitTest {

	Exercise16Employee employee;

	@Test
	public void testCalPersonalTaxes1() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(2.67);
		employee.setAllowance(12000000);
		employee.setNumberOfFamily(1);
		
		double ex = 138210;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes2() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(5);
		employee.setAllowance(15000000);
		employee.setNumberOfFamily(2);
		
		double ex = 260000;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes3() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(7);
		employee.setAllowance(20000000);
		employee.setNumberOfFamily(2);
		
		double ex = 1143000;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes4() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(8);
		employee.setAllowance(30000000);
		employee.setNumberOfFamily(1);
		
		double ex = 3846000;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes5() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(7);
		employee.setAllowance(50000000);
		employee.setNumberOfFamily(2);
		
		double ex = 7405000;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes6() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(10);
		employee.setAllowance(50000000);
		employee.setNumberOfFamily(0);
		
		double ex = 10230000;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes7() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(12);
		employee.setAllowance(100000000);
		employee.setNumberOfFamily(1);
		
		double ex = 26032000;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes8() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(3);
		employee.setAllowance(1000000);
		employee.setNumberOfFamily(2);
		
		double ex = 3000000;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes9() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(4);
		employee.setAllowance(10000000);
		employee.setNumberOfFamily(1);
		
		double ex = 15000000;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes10() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(1.2);
		employee.setAllowance(10000000);
		employee.setNumberOfFamily(7);
		
		double ex = 11510000;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}

}
