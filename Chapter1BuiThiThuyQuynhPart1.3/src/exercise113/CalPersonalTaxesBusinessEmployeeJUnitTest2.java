/**
 * Author: Bui Thi Thuy Quynh
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calPersonalTaxes() method of BusinessEmployee
 * Input: no
 * Output: salary of an business employee
 */
 
package exercise113;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalPersonalTaxesBusinessEmployeeJUnitTest2 {

	Employee employee;

	@Test
	public void testCalPersonalTaxes1() {
		employee = new BusinessEmployee("John", 0, 0, 0, 0, 0);
		
		double ex = 0;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes2() {
		employee = new BusinessEmployee("John", 12, 2, 12000000, 3000000, 1.2);
		
		double ex = 126000;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes3() {
		employee = new BusinessEmployee("John", 3.4, 2, 18000000, 2000000, 2.4);
		
		double ex = 0;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes4() {
		employee = new BusinessEmployee("John", 6, 1, 6000000, 5000000, 2.3);
		
		double ex = 396000;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes5() {
		employee = new BusinessEmployee("John", 10.1, 3, 4000000, 8000000, 3.4);
		
		double ex = 2375200;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes6() {
		employee = new BusinessEmployee("John", 4.5, 3, 13000000, 6000000, 9.2);
		
		double ex = 60869999;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes7() {
		employee = new BusinessEmployee("John", 2.3, 0, 0, 5000000, 1.2);
		
		double ex = 8890000;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes8() {
		employee = new BusinessEmployee("John", 1.2, 1, 12000000, 7000000, 2.3);
		
		double ex = 1761200;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes9() {
		employee = new BusinessEmployee("John", 5.6, 1, 3000000, 4000000, 0);
		
		double ex = 705600;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes10() {
		employee = new BusinessEmployee("John", 0, 0, 0, 0, 0);
		
		double ex = 138210;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
}
