/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise110;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * @description JUnit Test for calSalary() method of Teacher class
 * @return salary of Teacher
 */
public class CalSalaryTeacherJUnitTest {
	
	Teacher teacher;

	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary1() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 4.5, 12000000);
		
		double ex = 17670000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary2() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 0, 12000000);
		
		double ex = 12000000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary3() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 3, 12000000);
		
		double ex = 15780000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary4() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 1, 12000000);
		
		double ex = 13260000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary5() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 6.4, 15000000);
		
		double ex = 23064000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary6() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 4.5, 12000000);
		
		double ex = 0;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary7() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 5, 1000000);
		
		double ex = 6300000;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary8() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 0, 12000000);
		
		double ex = 1260000;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary9() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 4.5, 0);
		
		double ex = 1260000;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary10() {
		/**
		 * @param0 name of teacher
		 * @param1 date of birth
		 * @param2 address of teacher
		 * @param3 phone number of teacher
		 * @param4 class homeroom of teacher
		 * @param5 pay rate of teacher
		 * @param6 fringe benefits of teacher
		 */
		teacher = new Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 4.5, 12000000);
		
		double ex = 54000000;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}

}
