/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calCircumference() method of Exercise14Circle
 * Input: radius
 * Output: the circumference of circle
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise14Circle;

public class Exercise14CalCircumferenceJUnitTest {

	Exercise14Circle circle;

	@Test
	public void testCalCircumference1() {
		circle = new Exercise14Circle(0);
		double ex = 0;
		double ac = circle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference2() {
		circle = new Exercise14Circle(1);
		double ex = 6.283;
		double ac = circle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference3() {
		circle = new Exercise14Circle(2);
		double ex = 12.566;
		double ac = circle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference4() {
		circle = new Exercise14Circle(2.5);
		double ex = 15.7075;
		double ac = circle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference5() {
		circle = new Exercise14Circle(1.2);
		double ex = 7.5396;
		double ac = circle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference6() {
		circle = new Exercise14Circle(1.2);
		double ex = 7.5;
		double ac = circle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference7() {
		circle = new Exercise14Circle(1);
		double ex = 3.14;
		double ac = circle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference8() {
		circle = new Exercise14Circle(2);
		double ex = 12.5;
		double ac = circle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference9() {
		circle = new Exercise14Circle(0);
		double ex = -1;
		double ac = circle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference10() {
		circle = new Exercise14Circle(9);
		double ex = 9;
		double ac = circle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}

}
