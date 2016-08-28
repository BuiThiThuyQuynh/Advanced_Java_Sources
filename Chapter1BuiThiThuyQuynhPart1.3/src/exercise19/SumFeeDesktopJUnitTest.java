/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise19;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description JUnit Test for sumFee(Computer[] computers) method of ManagementComputer
 * @param0 array computers
 * @return totals amount of array computer
 */
public class SumFeeDesktopJUnitTest {

	ManagementComputer computers = new ManagementComputer();
	Desktop[] desktops;
	Laptop[] laptops;
	
	@Test
	public void testSumFee1() {
		desktops =  new Desktop[3];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		desktops[0] = new Desktop("001", 12000, "Sony", 10, "Core I3", 8);
		desktops[1] = new Desktop("001", 10000, "Sony", 2, "Core I3", 8);
		desktops[2] = new Desktop("001", 1000, "Sony", 1, "Core I3", 8);
		
		double ex = 141000;
		double ac = computers.sumFee(desktops);
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFee2() {
		desktops =  new Desktop[1];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		desktops[0] = new Desktop("001", 12000, "Sony", 14, "Core I3", 8);
		
		double ex = 12000 * 14;
		double ac = computers.sumFee(desktops);
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFee3() {
		laptops =  new Laptop[3];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		laptops[0] = new Laptop("001", 12000, "Sony", 10, 1.3, 5, 14);
		laptops[1] = new Laptop("001", 10000, "Sony", 2, 1.3, 5, 14);
		laptops[2] = new Laptop("001", 1000, "Sony", 1, 1.3, 5, 14);
		
		double ex = 141000;
		double ac = computers.sumFee(laptops);
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFee4() {
		laptops =  new Laptop[4];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		laptops[0] = new Laptop("001", 1000, "Sony", 4, 1.3, 5, 14);
		laptops[1] = new Laptop("001", 2000, "Sony", 3, 1.3, 5, 14);
		laptops[2] = new Laptop("001", 3000, "Sony", 2, 1.3, 5, 14);
		laptops[3] = new Laptop("001", 4000, "Sony", 1, 1.3, 5, 14);
		
		double ex = 20000;
		double ac = computers.sumFee(laptops);
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFee5() {
		desktops =  new Desktop[2];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		desktops[0] = new Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		desktops[1] = new Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		
		double ex = 24000;
		double ac = computers.sumFee(desktops);
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFee6() {
		desktops =  new Desktop[3];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		desktops[0] = new Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		desktops[1] = new Desktop("001", 1000, "Sony", 1, "Core I3", 8);
		desktops[2] = new Desktop("001", 2000, "Sony", 2, "Core I3", 8);
		
		double ex = 13000;
		double ac = computers.sumFee(desktops);
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFee7() {
		laptops =  new Laptop[1];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		laptops[0] = new Laptop("001", 12000, "Sony", 0, 1.3, 5, 14);
		
		double ex = 12000;
		double ac = computers.sumFee(laptops);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testSumFee8() {
		laptops =  new Laptop[2];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		laptops[0] = new Laptop("001", 12000, "Sony", 14, 1.3, 5, 14);
		laptops[1] = new Laptop("001", 12000, "Sony", 3, 1.3, 5, 14);
		
		double ex = 24000;
		double ac = computers.sumFee(laptops);
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testSumFee9() {
		desktops =  new Desktop[1];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 CPU of computer
		 * @param5 RAM of computer
		 */
		desktops[0] = new Desktop("001", 0, "Sony", 14, "Core I3", 8);
		
		double ex = 14;
		double ac = computers.sumFee(desktops);
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFee10() {
		laptops =  new Laptop[4];
		
		/**
		 * @param0 id of computer
		 * @param1 price of computer
		 * @param2 manufactory of computer
		 * @param3 quantity of computer
		 * @param4 weight of computer
		 * @param5 time of PIN
		 * @param6 size of screen
		 */
		laptops[0] = new Laptop("001", 1000, "Sony", 1, 1.3, 5, 14);
		laptops[1] = new Laptop("001", 1000, "Sony", 2, 1.3, 5, 14);
		laptops[2] = new Laptop("001", 1000, "Sony", 3, 1.3, 5, 14);
		laptops[3] = new Laptop("001", 1000, "Sony", 4, 1.3, 5, 14);
		
		double ex = 4000;
		double ac = computers.sumFee(laptops);
		assertNotEquals(ex, ac, 0);
	}

}
