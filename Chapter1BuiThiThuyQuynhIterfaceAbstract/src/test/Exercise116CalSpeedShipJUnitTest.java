/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calSpeed() method of Exercise116Ship
 * Input: no
 * Output: speed of ship
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise116Ship;

public class Exercise116CalSpeedShipJUnitTest {
	
	Exercise116Ship ship;

	@Test
	public void testcalFee1() {
		ship = new Exercise116Ship(10, 2, 8, "ID01", "John", "Green", "Suziki", 380, 
				230, 34, 12, 5, "Diesel");
		
		double ex = 27;
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee2() {
		ship = new Exercise116Ship(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 12, 1, 3, "Diesel");
		
		double ex = 14.333;
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee3() {
		ship = new Exercise116Ship(17, 2, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 23, 12, 4, "Diesel");
		
		double ex = 19.5;
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee4() {
		ship = new Exercise116Ship(6, 5, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 45, 16, 32, "Diesel");
		
		double ex = 30.2;
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee5() {
		ship = new Exercise116Ship(0, 0, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 0, 0, 0, "Diesel");
		
		double ex = 0;
		double ac = ship.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee6() {
		ship = new Exercise116Ship(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 15, 3, 2, "Diesel");
		
		double ex = 15.3;
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee7() {
		ship = new Exercise116Ship(10, 3, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 15, 3, 2, "Diesel");
		
		double ex = 15.33;
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee8() {
		ship = new Exercise116Ship(15, 7, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 25, 12, 2, "Diesel");
		
		double ex = 15.14;
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee9() {
		ship = new Exercise116Ship(14, 7, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 25, 12, 2, "Diesel");
		
		double ex = 2;
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testcalFee10() {
		ship = new Exercise116Ship(1, 1, 5, "ID01", "John", "Green", "Suziki", 380, 
				230, 1, 0, 1, "Diesel");
		
		double ex = 1;
		double ac = ship.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}

}
