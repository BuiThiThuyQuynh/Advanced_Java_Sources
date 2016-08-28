/**
 * Author: Bui Thi Thuy Quynh
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calPersonalTaxes() method of ProductionEmployee
 * Input: no
 * Output: personal taxes of an production employee
 */
 
package exercise113;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalPersonalTaxesProductionEmployeeJUnitTest2 {
	
	ProductionEmployee employee;

	@Test
	public void testCalPersonalTaxes1() {
		employee = new ProductionEmployee("John", 0, 0, 0, 0);
		
		double ex = 0;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes2() {
		employee = new ProductionEmployee("John", 4.5, 1, 6000000, 999);
		
		double ex = 0;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes3() {
		employee = new ProductionEmployee("John", 13, 2, 18000000, 18000);
		
		double ex = 9042.5;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes4() {
		employee = new ProductionEmployee("John", 13, 0, 50000000, 16000);
		
		double ex = 488075;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes5() {
		employee = new ProductionEmployee("John", 16, 1, 12000000, 15000);
		
		double ex = 506070;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes6() {
		employee = new ProductionEmployee("John", 13, 0, 18000000, 2500);
		
		double ex = 16380070;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes7() {
		employee = new ProductionEmployee("John", 4.5, 2, 30000000, 8900);
		
		double ex = 567039;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes8() {
		employee = new ProductionEmployee("John", 2.3, 1, 14000000, 19000);
		
		double ex = 2898045.1;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes9() {
		employee = new ProductionEmployee("John", 3.6, 2, 8000000, 999);
		
		double ex = 4536000;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes10() {
		employee = new ProductionEmployee("John", 0, 0, 0, 0);
		
		double ex = 1000;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0.001);
	}

}
