/**
 * @author Bui Thi Thuy Quynh
 * @date 28/08/2016
 * @version 2.0
 */
 
package exercise113;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description JUnit Test for calRealSalary() method of BusinessEmployee
 * @return real salary of an business employee
 */
public class CalRealSalaryEmployeeJUnitTest {

	Employee employee;

	@Test
	public void testCalRealSalary1() {
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
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary2() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 4.5, 1, 6000000, 999);
		
		double ex = 5669999.95;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary3() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 3.4, 2, 18000000, 2000000, 2.4);
		
		double ex = 9084000;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary4() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 13, 0, 50000000, 16000);
		
		double ex = 15892675;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary5() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 pay business month
		 * @param5 business pay rate
		 */
		employee = new BusinessEmployee("John", 10.1, 3, 4000000, 8000000, 3.4);
		
		double ex = 37550800;
		double ac = employee.calRealSalary();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary6() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 13, 0, 18000000, 2500);
		
		double ex = 16380070;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary7() {
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
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary8() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 2.3, 1, 14000000, 19000);
		
		double ex = 2898045.1;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalRealSalary9() {
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
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalRealSalary10() {
		/**
		 * @param0 name of employee
		 * @param1 coefficients salary of employee
		 * @param2 number member in family
		 * @param3 allowance
		 * @param4 quantity of product
		 */
		employee = new ProductionEmployee("John", 0, 0, 0, 0);
		
		double ex = 1000;
		double ac = employee.calRealSalary();
		assertNotEquals(ex, ac, 0.001);
	}
}
