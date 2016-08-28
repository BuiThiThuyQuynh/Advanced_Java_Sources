/**
 * @author Bui Thi Thuy Quynh
 * @date 28/08/2016
 * @version 2.0
 */
 
package exercise113;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description JUnit Test for calPersonalTaxes() method of BusinessEmployee
 * @return salary of an business employee
 */
public class CalPersonalTaxesEmployeeJUnitTest {

	Employee employee;

	@Test
	public void testCalPersonalTaxes1() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 0, 0, 0, 0, 0);
		
		double ex = 0;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes2() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 4.5, 1, 6000000, 999);
		
		double ex = 0;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes3() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 3.4, 2, 18000000, 2000000, 2.4);
		
		double ex = 0;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes4() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 13, 2, 18000000, 18000);
		
		double ex = 9042.5;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes5() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 10.1, 3, 4000000, 8000000, 3.4);
		
		double ex = 2375200;
		double ac = employee.calPersonalTaxes();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes6() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 13, 0, 18000000, 2500);
		
		double ex = 16380070;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPersonalTaxes7() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 2.3, 0, 0, 5000000, 1.2);
		
		double ex = 8890000;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes8() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new BusinessEmployee("John", 1.2, 1, 12000000, 7000000, 2.3);
		
		double ex = 1761200;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes9() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 5.6, 1, 3000000, 4000000, 0);
		
		double ex = 705600;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalPersonalTaxes10() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 0, 0, 0, 0);
		
		double ex = 1000;
		double ac = employee.calPersonalTaxes();
		assertNotEquals(ex, ac, 0.001);
	}
}
