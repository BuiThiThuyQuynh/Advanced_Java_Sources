/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calArea() method of Exercise14Circle
 * Input: radius
 * Output: the area of circle
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise14Circle;

public class Exercise14CalAreaCJUnitTest {
	
	Exercise14Circle circle;

	@Test
	public void testCalArea1() {
		circle = new Exercise14Circle(0);
		double ex = 0;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea2() {
		circle = new Exercise14Circle(1);
		double ex = 3.1415;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea3() {
		circle = new Exercise14Circle(2);
		double ex = 12.566;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea4() {
		circle = new Exercise14Circle(2.5);
		double ex = 19.634;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea5() {
		circle = new Exercise14Circle(1.2);
		double ex = 4.52376;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea6() {
		circle = new Exercise14Circle(1.2);
		double ex = 7.5;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea7() {
		circle = new Exercise14Circle(1);
		double ex = 3.14;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea8() {
		circle = new Exercise14Circle(2);
		double ex = 12.5;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea9() {
		circle = new Exercise14Circle(0);
		double ex = -1;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea10() {
		circle = new Exercise14Circle(9);
		double ex = 9;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}

}
