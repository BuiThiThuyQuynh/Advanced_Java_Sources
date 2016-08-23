/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calArea() method of Exercise115Circle
 * Input: no
 * Output: area of circle
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise114Circle;

public class Exercise114CalAreaCircleJUnitTest {

	Exercise114Circle circle;

	@Test
	public void testCalArea1() {
		circle = new Exercise114Circle(1);
		double ex = 3.141;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea2() {
		circle = new Exercise114Circle(2);
		double ex = 12.566;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea3() {
		circle = new Exercise114Circle(0);
		double ex = 0;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea4() {
		circle = new Exercise114Circle(6);
		double ex = 113.094;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea5() {
		circle = new Exercise114Circle(3);
		double ex = 28.273;
		double ac = circle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea6() {
		circle = new Exercise114Circle(0);
		double ex = 1;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea7() {
		circle = new Exercise114Circle(1);
		double ex = 6.283;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea8() {
		circle = new Exercise114Circle(2);
		double ex = 15.5;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea9() {
		circle = new Exercise114Circle(1.3);
		double ex = 5.3;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea10() {
		circle = new Exercise114Circle(7);
		double ex = 153.9;
		double ac = circle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}

}
