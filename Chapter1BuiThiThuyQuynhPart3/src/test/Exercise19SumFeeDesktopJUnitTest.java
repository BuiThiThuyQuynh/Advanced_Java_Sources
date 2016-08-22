/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for sumFeeDesktop() method of Exercise19ManagementComputer
 * Input: no
 * Output: totals amount of array desktop
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise19Desktop;
import classes.Exercise19ManagementComputer;

public class Exercise19SumFeeDesktopJUnitTest {

	Exercise19ManagementComputer computers = new Exercise19ManagementComputer();
	Exercise19Desktop[] desktops;
	
	@Test
	public void testSumFeeDesktop1() {
		desktops =  new Exercise19Desktop[3];
		desktops[0] = new Exercise19Desktop("001", 12000, "Sony", 10, "Core I3", 8);
		desktops[1] = new Exercise19Desktop("001", 10000, "Sony", 2, "Core I3", 8);
		desktops[2] = new Exercise19Desktop("001", 1000, "Sony", 1, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 141000;
		double ac = computers.sumFeeDesktop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop2() {
		desktops =  new Exercise19Desktop[1];
		desktops[0] = new Exercise19Desktop("001", 12000, "Sony", 14, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 12000 * 14;
		double ac = computers.sumFeeDesktop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop3() {
		desktops =  new Exercise19Desktop[2];
		desktops[0] = new Exercise19Desktop("001", 1000, "Sony", 14, "Core I3", 8);
		desktops[1] = new Exercise19Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 26000;
		double ac = computers.sumFeeDesktop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop4() {
		desktops =  new Exercise19Desktop[4];
		desktops[0] = new Exercise19Desktop("001", 1000, "Sony", 4, "Core I3", 8);
		desktops[1] = new Exercise19Desktop("001", 2000, "Sony", 3, "Core I3", 8);
		desktops[2] = new Exercise19Desktop("001", 3000, "Sony", 2, "Core I3", 8);
		desktops[3] = new Exercise19Desktop("001", 4000, "Sony", 1, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 20000;
		double ac = computers.sumFeeDesktop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop5() {
		desktops =  new Exercise19Desktop[2];
		desktops[0] = new Exercise19Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		desktops[1] = new Exercise19Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 24000;
		double ac = computers.sumFeeDesktop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop6() {
		desktops =  new Exercise19Desktop[3];
		desktops[0] = new Exercise19Desktop("001", 12000, "Sony", 1, "Core I3", 8);
		desktops[1] = new Exercise19Desktop("001", 1000, "Sony", 1, "Core I3", 8);
		desktops[2] = new Exercise19Desktop("001", 2000, "Sony", 2, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 13000;
		double ac = computers.sumFeeDesktop();
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop7() {
		desktops =  new Exercise19Desktop[1];
		desktops[0] = new Exercise19Desktop("001", 12000, "Sony", 0, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 12000;
		double ac = computers.sumFeeDesktop();
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop8() {
		desktops =  new Exercise19Desktop[2];
		desktops[0] = new Exercise19Desktop("001", 12000, "Sony", 14, "Core I3", 8);
		desktops[1] = new Exercise19Desktop("001", 12000, "Sony", 3, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 24000;
		double ac = computers.sumFeeDesktop();
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop9() {
		desktops =  new Exercise19Desktop[1];
		desktops[0] = new Exercise19Desktop("001", 0, "Sony", 14, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 14;
		double ac = computers.sumFeeDesktop();
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeDesktop10() {
		desktops =  new Exercise19Desktop[4];
		desktops[0] = new Exercise19Desktop("001", 1000, "Sony", 1, "Core I3", 8);
		desktops[1] = new Exercise19Desktop("001", 1000, "Sony", 2, "Core I3", 8);
		desktops[2] = new Exercise19Desktop("001", 1000, "Sony", 3, "Core I3", 8);
		desktops[3] = new Exercise19Desktop("001", 1000, "Sony", 4, "Core I3", 8);
		
		computers.setDesktops(desktops);
		
		double ex = 4000;
		double ac = computers.sumFeeDesktop();
		assertNotEquals(ex, ac, 0);
		
	}

}
