/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calFee() method of Exercise19Desktop
 * Input: no
 * Output: totals amount of a type of desktop
 */

package exercise19;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalFeeDesktopJUnitTest {

	Desktop Desktop;

	@Test
	public void testCalFee1() {
		Desktop = new Desktop("001", 12000, "Sony", 14, "Core I3", 8);
		
		double ex = 12000 * 14;
		double ac = Desktop.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee2() {
		Desktop = new Desktop("001", 12000, "Sony", 0, "Core I3", 8);
		
		double ex = 0;
		double ac = Desktop.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee3() {
		Desktop = new Desktop("001", 12000, "Sony", 2, "Core I3", 8);
		
		double ex = 24000;
		double ac = Desktop.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee4() {
		Desktop = new Desktop("001", 15000, "Sony", 10, "Core I3", 8);
		
		double ex = 150000;
		double ac = Desktop.calFee();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalFee5() {
		Desktop = new Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		
		double ex = 12000;
		double ac = Desktop.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee6() {
		Desktop = new Desktop("001", 12000, "Sony", 0, "Core I3", 8);
		
		double ex = 12000;
		double ac = Desktop.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee7() {
		Desktop = new Desktop("", 12000, "Sony", 14, "Core I3", 8);
		
		double ex = 120000;
		double ac = Desktop.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee8() {
		Desktop = new Desktop("001", 15000, "Sony", 15, "Core I3", 8);
		
		double ex = 15000 * 14;
		double ac = Desktop.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee9() {
		Desktop = new Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		
		double ex = 0;
		double ac = Desktop.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee10() {
		Desktop = new Desktop("001", 12000, "Sony", 3, "Core I3", 8);
		
		double ex = 12000;
		double ac = Desktop.calFee();
		assertNotEquals(ex, ac, 0);
	}

}
