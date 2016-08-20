/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calTaxableSalary() method of Exercise16Employee
 * Input: coefficientsSalary, allowance, numberOfFamily
 * Output: taxable salary of an employee
 */
 
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise16Employee;

public class Exercise16CalTaxableSalaryJUnitTest {

	Exercise16Employee employee;

	@Test
	public void testCalTaxableSalary1() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(2.67);
		employee.setAllowance(12000000);
		employee.setNumberOfFamily(1);
		
		double ex = 2764200;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary2() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(5);
		employee.setAllowance(15000000);
		employee.setNumberOfFamily(2);
		
		double ex = 5100000;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary3() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(7);
		employee.setAllowance(20000000);
		employee.setNumberOfFamily(2);
		
		double ex = 12620000;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary4() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(8);
		employee.setAllowance(30000000);
		employee.setNumberOfFamily(1);
		
		double ex = 27480000;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary5() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(7);
		employee.setAllowance(50000000);
		employee.setNumberOfFamily(2);
		
		double ex = 42620000;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary6() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(10);
		employee.setAllowance(50000000);
		employee.setNumberOfFamily(0);
		
		double ex = 53600000;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary7() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(12);
		employee.setAllowance(100000000);
		employee.setNumberOfFamily(1);
		
		double ex = 102520000;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary8() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(3);
		employee.setAllowance(1000000);
		employee.setNumberOfFamily(2);
		
		double ex = 3000000;
		double ac = employee.calTaxableSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary9() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(4);
		employee.setAllowance(10000000);
		employee.setNumberOfFamily(1);
		
		double ex = 15000000;
		double ac = employee.calTaxableSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary10() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(1.2);
		employee.setAllowance(10000000);
		employee.setNumberOfFamily(7);
		
		double ex = 11510000;
		double ac = employee.calTaxableSalary();
		assertNotEquals(ex, ac, 0);
	}

}
