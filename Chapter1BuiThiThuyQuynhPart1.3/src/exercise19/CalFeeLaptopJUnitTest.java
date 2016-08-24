/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calFee() method of Exercise19Laptop
 * Input: no
 * Output: totals amount of a type of laptop
 */

package exercise19;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalFeeLaptopJUnitTest {
	
	Laptop laptop;

	@Test
	public void testCalFee1() {
		laptop = new Laptop("001", 12000, "Sony", 14, 1.3, 5, 14);
		
		double ex = 12000 * 14;
		double ac = laptop.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee2() {
		laptop = new Laptop("001", 12000, "Sony", 0, 1.3, 5, 14);
		
		double ex = 0;
		double ac = laptop.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee3() {
		laptop = new Laptop("001", 12000, "Sony", 2, 1.3, 5, 14);
		
		double ex = 24000;
		double ac = laptop.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee4() {
		laptop = new Laptop("001", 15000, "Sony", 10, 1.3, 5, 14);
		
		double ex = 150000;
		double ac = laptop.calFee();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalFee5() {
		laptop = new Laptop("001", 12000, "Sony", 1, 1.3, 5, 14);
		
		double ex = 12000;
		double ac = laptop.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee6() {
		laptop = new Laptop("001", 12000, "Sony", 0, 1.3, 5, 14);
		
		double ex = 12000;
		double ac = laptop.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee7() {
		laptop = new Laptop("", 12000, "Sony", 14, 1.3, 5, 14);
		
		double ex = 120000;
		double ac = laptop.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee8() {
		laptop = new Laptop("001", 15000, "Sony", 15, 1.3, 5, 14);
		
		double ex = 15000 * 14;
		double ac = laptop.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee9() {
		laptop = new Laptop("001", 12000, "Sony", 1, 1.3, 5, 14);
		
		double ex = 0;
		double ac = laptop.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee10() {
		laptop = new Laptop("001", 12000, "Sony", 3, 1.3, 5, 14);
		
		double ex = 12000;
		double ac = laptop.calFee();
		assertNotEquals(ex, ac, 0);
	}
}
