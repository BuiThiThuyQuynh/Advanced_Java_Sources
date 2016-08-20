/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calRealSalary() method of Exercise16Employee
 * Input: coefficientsSalary, allowance, numberOfFamily
 * Output: real salary of an employee
 */
 
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise16Employee;

public class Exercise16CalRealSalaryJUnitTest {

	Exercise16Employee employee;

	@Test
	public void testCalRealSalary1() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(2.67);
		employee.setAllowance(12000000);
		employee.setNumberOfFamily(1);
		
		double ex = 15225990;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary2() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(5);
		employee.setAllowance(15000000);
		employee.setNumberOfFamily(2);
		
		double ex = 21040000;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary3() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(7);
		employee.setAllowance(20000000);
		employee.setNumberOfFamily(2);
		
		double ex = 27677000;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary4() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(8);
		employee.setAllowance(30000000);
		employee.setNumberOfFamily(1);
		
		double ex = 36234000;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary5() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(7);
		employee.setAllowance(50000000);
		employee.setNumberOfFamily(2);
		
		double ex = 51415000;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary6() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(10);
		employee.setAllowance(50000000);
		employee.setNumberOfFamily(0);
		
		double ex = 10230000;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary7() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(12);
		employee.setAllowance(100000000);
		employee.setNumberOfFamily(1);
		
		double ex = 26032000;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary8() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(3);
		employee.setAllowance(1000000);
		employee.setNumberOfFamily(2);
		
		double ex = 3000000;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary9() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(4);
		employee.setAllowance(10000000);
		employee.setNumberOfFamily(1);
		
		double ex = 15000000;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary10() {
		employee = new Exercise16Employee();
		employee.setCoefficientsSalary(1.2);
		employee.setAllowance(10000000);
		employee.setNumberOfFamily(7);
		
		double ex = 11510000;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0);
	}
}
