/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise19;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description JUnit Test for calFee() method of a type of computer
 * @return totals amount of a type of computer
 */
public class CalFeeComputerJUnitTest {
	
	Computer computer;

	@Test
	public void testCalFee1() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		computer = new Laptop("001", 12000, "Sony", 14, 1.3, 5, 14);
		
		double ex = 12000 * 14;
		double ac = computer.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee2() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		computer = new Laptop("001", 12000, "Sony", 0, 1.3, 5, 14);
		
		double ex = 0;
		double ac = computer.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee3() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		computer = new Desktop("001", 12000, "Sony", 2, "Core I3", 8);
		
		double ex = 24000;
		double ac = computer.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee4() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		computer = new Desktop("001", 15000, "Sony", 10, "Core I5", 14);
		
		double ex = 150000;
		double ac = computer.calFee();
		assertEquals(ex, ac, 0);
	}

	@Test
	public void testCalFee5() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		computer = new Laptop("001", 12000, "Sony", 1, 1.3, 5, 14);
		
		double ex = 12000;
		double ac = computer.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee6() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		computer = new Desktop("001", 12000, "Sony", 0, "Core I7", 14);
		
		double ex = 12000;
		double ac = computer.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee7() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		computer = new Laptop("", 12000, "Sony", 14, 1.3, 5, 14);
		
		double ex = 120000;
		double ac = computer.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee8() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		computer = new Desktop("001", 15000, "Sony", 15, "Pentium", 14);
		
		double ex = 15000 * 14;
		double ac = computer.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee9() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		computer = new Laptop("001", 12000, "Sony", 1, 1.3, 5, 14);
		
		double ex = 0;
		double ac = computer.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalFee10() {
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		computer = new Desktop("001", 12000, "Sony", 3, "Core I3", 14);
		
		double ex = 12000;
		double ac = computer.calFee();
		assertNotEquals(ex, ac, 0);
	}
}
