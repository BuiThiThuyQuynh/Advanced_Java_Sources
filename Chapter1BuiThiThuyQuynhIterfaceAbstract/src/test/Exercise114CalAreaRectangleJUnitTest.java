/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calArea() method of Exercise115Rectangle
 * Input: no
 * Output: area of rectangle
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise114Rectangle;

public class Exercise114CalAreaRectangleJUnitTest {

	Exercise114Rectangle rectangle;

	@Test
	public void testCalArea1() {
		rectangle = new Exercise114Rectangle(1, 2);
		double ex = 2;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea2() {
		rectangle = new Exercise114Rectangle(2, 3);
		double ex = 6;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea3() {
		rectangle = new Exercise114Rectangle(0, 0);
		double ex = 0;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea4() {
		rectangle = new Exercise114Rectangle(6, 3);
		double ex = 18;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea5() {
		rectangle = new Exercise114Rectangle(1.3, 1.6667);
		double ex = 2.167;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea6() {
		rectangle = new Exercise114Rectangle(0, 1);
		double ex = 1;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea7() {
		rectangle = new Exercise114Rectangle(1, 1.3);
		double ex = 1;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea8() {
		rectangle = new Exercise114Rectangle(2, 5);
		double ex = 7;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea9() {
		rectangle = new Exercise114Rectangle(1.3, 0);
		double ex = 1.3;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea10() {
		rectangle = new Exercise114Rectangle(7, 0.132);
		double ex = 0.92;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}

}
