/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calSalary() method of Exercise110Teacher class
 * Input: no
 * Output: salary of Teacher
 */

package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import classes.Exercise110Teacher;

public class Exercise110CalSalaryJUnitTest {
	
	Exercise110Teacher teacher;

	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary1() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 4.5, 12000000);
		double ex = 17670000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary2() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 0, 12000000);
		double ex = 12000000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary3() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 3, 12000000);
		double ex = 15780000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary4() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 1, 12000000);
		double ex = 13260000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary5() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 6.4, 15000000);
		double ex = 23064000;
		double ac = teacher.calSalary();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary6() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 4.5, 12000000);
		double ex = 0;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary7() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 5, 1000000);
		double ex = 6300000;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary8() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 0, 12000000);
		double ex = 1260000;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary9() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 4.5, 0);
		double ex = 1260000;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalSalary10() {
		teacher = new Exercise110Teacher("Nguyen Minh Dao", new Date("12/03/1956"), "Binh Thanh District, HCMC", 
				"0987654321", "P01", 4.5, 12000000);
		double ex = 54000000;
		double ac = teacher.calSalary();
		assertNotEquals(ex, ac, 0);
	}

}
