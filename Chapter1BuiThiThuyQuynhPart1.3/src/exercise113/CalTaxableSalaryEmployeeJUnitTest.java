/**
 * @author Bui Thi Thuy Quynh
 * @date 28/08/2016
 * @version 2.0
 */
 
package exercise113;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description JUnit Test for calTaxableSalary() method of BusinessEmployee
 * @return taxable salary of an business employee
 */
public class CalTaxableSalaryEmployeeJUnitTest {

	Employee employee;

	@Test
	public void testCalTaxableSalary1() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 0, 0, 0, 0);
		
		double ex = 0;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalTaxableSalary2() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 12, 2, 12000000, 3000000, 1.2);
		
		double ex = 2520000;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary3() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 13, 2, 18000000, 18000);
		
		double ex = 180850;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalTaxableSalary4() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 6, 1, 6000000, 5000000, 2.3);
		
		double ex = 6460000;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary5() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 13, 2, 18000000, 18000);
		
		double ex = 180850;
		double ac = employee.calTaxableSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalTaxableSalary6() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 4.5, 3, 13000000, 6000000, 9.2);
		
		double ex = 60869999;
		double ac = employee.calTaxableSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary7() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 4.5, 2, 30000000, 8900);
		
		double ex = 567039;
		double ac = employee.calTaxableSalary();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalTaxableSalary8() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 1.2, 1, 12000000, 7000000, 2.3);
		
		double ex = 1761200;
		double ac = employee.calTaxableSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalTaxableSalary9() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 3.6, 2, 8000000, 999);
		
		double ex = 4536000;
		double ac = employee.calTaxableSalary();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalTaxableSalary10() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 0, 0, 0, 0, 0);
		
		double ex = 138210;
		double ac = employee.calTaxableSalary();
		assertNotEquals(ex, ac, 0);
	}
}
