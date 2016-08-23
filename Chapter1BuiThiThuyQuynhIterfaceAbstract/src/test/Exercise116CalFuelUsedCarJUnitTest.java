/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calFuelUsed() method of Exercise116Car
 * Input: no
 * Output: fuel used of car
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise116Car;

public class Exercise116CalFuelUsedCarJUnitTest {

	Exercise116Car car;

	@Test
	public void testCalFuelUsed1() {
		car = new Exercise116Car(1, 1, 1, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed2() {
		car = new Exercise116Car(1, 0, 7, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 0.143;
		double ac = car.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed3() {
		car = new Exercise116Car(6, 2, 3, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2;
		double ac = car.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed4() {
		car = new Exercise116Car(23, 3, 9, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2.556;
		double ac = car.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed5() {
		car = new Exercise116Car(10, 3, 5, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2;
		double ac = car.calFuelUsed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed6() {
		car = new Exercise116Car(0, 1, 1, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed7() {
		car = new Exercise116Car(0, 0, 1, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed8() {
		car = new Exercise116Car(1, 0, 6, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed9() {
		car = new Exercise116Car(7, 3, 9, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 0.77;
		double ac = car.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalFuelUsed10() {
		car = new Exercise116Car(10, 3, 7, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1.42;
		double ac = car.calFuelUsed();
		assertNotEquals(ex, ac, 0.001);
	}
	

}
