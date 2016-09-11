/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calSummaryPriceOfCDs() method of Exercise17ManagementCDs
 * Input: array of CDs
 * Output: totals of CDs
 */
 
package exercise17;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalSummaryPriceCDsJUnitTest {
	
	CD[] cds;
	ManagementCD managementCDs;

	@Test
	public void testCalSummaryPriceOfCDs1() {
		cds = new CD[1];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 12000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs2() {
		cds = new CD[2];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		cds[1] = new CD("CD2", "Roar", "Katty", 7, 20000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 32000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs3() {
		cds = new CD[3];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		cds[1] = new CD("CD2", "Roar", "Katty", 7, 20000);
		cds[2] = new CD("CD3", "No promises", "Unknown", 1, 1000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 33000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs4() {
		cds = new CD[4];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		cds[1] = new CD("CD2", "She", "Taylor", 5, 15000);
		cds[2] = new CD("CD3", "She", "Taylor", 5, 20000);
		cds[3] = new CD("CD4", "She", "Taylor", 5, 1000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 48000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs5() {
		cds = new CD[6];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		cds[1] = new CD("CD2", "She", "Taylor", 5, 1000);
		cds[2] = new CD("CD3", "She", "Taylor", 5, 15000);
		cds[3] = new CD("CD4", "She", "Taylor", 5, 18000);
		cds[4] = new CD("CD5", "She", "Taylor", 5, 17000);
		cds[5] = new CD("CD6", "She", "Taylor", 5, 50000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 113000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs6() {
		cds = new CD[1];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 0;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs7() {
		cds = new CD[2];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		cds[1] = new CD("CD2", "She", "Taylor", 5, 10000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 12000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs8() {
		cds = new CD[3];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		cds[1] = new CD("CD1", "She", "Taylor", 5, 11000);
		cds[2] = new CD("CD1", "She", "Taylor", 5, 10000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 23000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs9() {
		cds = new CD[3];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		cds[1] = new CD("CD1", "She", "Taylor", 5, 11000);
		cds[2] = new CD("CD1", "She", "Taylor", 5, 10000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 21000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs10() {
		cds = new CD[3];
		cds[0] = new CD("CD1", "She", "Taylor", 5, 12000);
		cds[1] = new CD("CD1", "She", "Taylor", 5, 11000);
		cds[2] = new CD("CD1", "She", "Taylor", 5, 10000);
		
		managementCDs = new ManagementCD(cds);
		double ex = 11000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}

}
