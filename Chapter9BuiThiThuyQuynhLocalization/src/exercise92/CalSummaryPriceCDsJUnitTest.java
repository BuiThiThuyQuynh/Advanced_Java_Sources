/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calSummaryPriceOfCDs() method of Exercise17ManagementCDs
 * Input: array of CDs
 * Output: totals of CDs
 */
 
package exercise92;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalSummaryPriceCDsJUnitTest {
	
	List<CD> cds;
	ManagementCD managementCDs;

	@Test
	public void testCalSummaryPriceOfCDs1() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 12000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs2() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		cds.add(new CD("CD2", "Roar", "Katty", 7, 20000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 32000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs3() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		cds.add(new CD("CD2", "Roar", "Katty", 7, 20000));
		cds.add(new CD("CD3", "No promises", "Unknown", 1, 1000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 33000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs4() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		cds.add(new CD("CD2", "She", "Taylor", 5, 15000));
		cds.add(new CD("CD3", "She", "Taylor", 5, 20000));
		cds.add(new CD("CD4", "She", "Taylor", 5, 1000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 48000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs5() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		cds.add(new CD("CD2", "She", "Taylor", 5, 1000));
		cds.add(new CD("CD3", "She", "Taylor", 5, 15000));
		cds.add(new CD("CD4", "She", "Taylor", 5, 18000));
		cds.add(new CD("CD5", "She", "Taylor", 5, 17000));
		cds.add(new CD("CD6", "She", "Taylor", 5, 50000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 113000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs6() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 0;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs7() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		cds.add(new CD("CD2", "She", "Taylor", 5, 10000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 12000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs8() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		cds.add(new CD("CD1", "She", "Taylor", 5, 11000));
		cds.add(new CD("CD1", "She", "Taylor", 5, 10000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 23000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs9() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		cds.add(new CD("CD1", "She", "Taylor", 5, 11000));
		cds.add(new CD("CD1", "She", "Taylor", 5, 10000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 21000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void testCalSummaryPriceOfCDs10() {
		cds = new ArrayList<CD>();
		cds.add(new CD("CD1", "She", "Taylor", 5, 12000));
		cds.add(new CD("CD1", "She", "Taylor", 5, 11000));
		cds.add(new CD("CD1", "She", "Taylor", 5, 10000));
		
		managementCDs = new ManagementCD(cds);
		double ex = 11000;
		double ac = managementCDs.calSummaryPriceOfCDs();
		assertNotEquals(ex, ac, 0);
	}

}
