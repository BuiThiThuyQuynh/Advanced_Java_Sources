/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calSpeed() method of Exercise116Car
 * Input: no
 * Output: speed of car
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise116Car;

public class Exercise116CalSpeedCarJUnitTest {
	
	Exercise116Car car;

	@Test
	public void testCalSpeed1() {
		car = new Exercise116Car(1, 1, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed2() {
		car = new Exercise116Car(0, 0, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 0;
		double ac = car.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed3() {
		car = new Exercise116Car(6, 2, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 3;
		double ac = car.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed4() {
		car = new Exercise116Car(8, 3, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2.667;
		double ac = car.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed5() {
		car = new Exercise116Car(10, 3, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 3.333;
		double ac = car.calSpeed();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed6() {
		car = new Exercise116Car(0, 1, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed7() {
		car = new Exercise116Car(0, 0, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed8() {
		car = new Exercise116Car(1, 0, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 1;
		double ac = car.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed9() {
		car = new Exercise116Car(7, 3, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 2.33;
		double ac = car.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalSpeed10() {
		car = new Exercise116Car(10, 3, 0, "Car01", "John", "Red", "Isuzu", "Auto", "Honda");
		double ex = 3.3;
		double ac = car.calSpeed();
		assertNotEquals(ex, ac, 0.001);
	}
	

}
