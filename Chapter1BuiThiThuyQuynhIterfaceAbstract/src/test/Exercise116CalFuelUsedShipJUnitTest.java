/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calFuelUsed() method of Exercise116Ship
 * Input: no
 * Output: fuel used of ship
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise116Ship;

public class Exercise116CalFuelUsedShipJUnitTest {

	Exercise116Ship ship;

	@Test
	public void testcalFuelUsed1() {
		ship = new Exercise116Ship(10, 2, 8, "ID01", "John", "Green", "Suziki", 380, 
				230, 34, 12, 5, "Diesel");
		
		double ex = 3.333;
		double ac = ship.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed2() {
		ship = new Exercise116Ship(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 12, 1, 3, "Diesel");
		
		double ex = 5;
		double ac = ship.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed3() {
		ship = new Exercise116Ship(17, 2, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 23, 12, 4, "Diesel");
		
		double ex = 17;
		double ac = ship.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed4() {
		ship = new Exercise116Ship(6, 5, 32, "ID01", "John", "Green", "Suziki", 380, 
				230, 45, 16, 2, "Diesel");
		
		double ex = 0.2;
		double ac = ship.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed5() {
		ship = new Exercise116Ship(0, 0, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 0, 0, 0, "Diesel");
		
		double ex = 0;
		double ac = ship.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed6() {
		ship = new Exercise116Ship(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 15, 3, 2, "Diesel");
		
		double ex = 15.3;
		double ac = ship.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed7() {
		ship = new Exercise116Ship(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 15, 3, 2, "Diesel");
		
		double ex = 15.33;
		double ac = ship.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed8() {
		ship = new Exercise116Ship(15, 7, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 25, 12, 2, "Diesel");
		
		double ex = 15.14;
		double ac = ship.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed9() {
		ship = new Exercise116Ship(14, 7, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 25, 12, 2, "Diesel");
		
		double ex = 2;
		double ac = ship.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFuelUsed10() {
		ship = new Exercise116Ship(1, 1, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 1, 0, 1, "Diesel");
		
		double ex = 1;
		double ac = ship.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}

}
