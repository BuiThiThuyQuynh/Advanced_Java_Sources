/**
 * Author: Bui Thi Thuy Quynh
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calRealSalary() method of ProductionEmployee
 * Input: no
 * Output: real salary of an production employee
 */
 
package exercise113;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalRealSalaryProductionEmployeeJUnitTest2 {
	
	ProductionEmployee employee;

	@Test
	public void testCalRealSalary1() {
		employee = new ProductionEmployee("John", 0, 0, 0, 0);
		
		double ex = 0;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary2() {
		employee = new ProductionEmployee("John", 4.5, 1, 6000000, 999);
		
		double ex = 5669999.95;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary3() {
		employee = new ProductionEmployee("John", 13, 2, 18000000, 18000);
		
		double ex = 16371807.5;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary4() {
		employee = new ProductionEmployee("John", 13, 0, 50000000, 16000);
		
		double ex = 15892675;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary5() {
		employee = new ProductionEmployee("John", 16, 1, 12000000, 15000);
		
		double ex = 19654630;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary6() {
		employee = new ProductionEmployee("John", 13, 0, 18000000, 2500);
		
		double ex = 16380070;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary7() {
		employee = new ProductionEmployee("John", 4.5, 2, 30000000, 8900);
		
		double ex = 567039;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary8() {
		employee = new ProductionEmployee("John", 2.3, 1, 14000000, 19000);
		
		double ex = 2898045.1;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary9() {
		employee = new ProductionEmployee("John", 3.6, 2, 8000000, 999);
		
		double ex = 4536000;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary10() {
		employee = new ProductionEmployee("John", 0, 0, 0, 0);
		
		double ex = 1000;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0.001);
	}
}
