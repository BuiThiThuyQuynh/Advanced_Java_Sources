/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calPerimeter() method of Exercise115Rectangle
 * Input: no
 * Output: perimeter of rectangle
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise114Rectangle;

public class Exercise114CalPerimeterRectangleJUnitTest {

	Exercise114Rectangle rectangle;

	@Test
	public void testCalPerimeter1() {
		rectangle = new Exercise114Rectangle(1, 2);
		double ex = 6;
		double ac = rectangle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter2() {
		rectangle = new Exercise114Rectangle(2, 5);
		double ex = 14;
		double ac = rectangle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter3() {
		rectangle = new Exercise114Rectangle(0, 1);
		double ex = 2;
		double ac = rectangle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter4() {
		rectangle = new Exercise114Rectangle(6, 0);
		double ex = 12;
		double ac = rectangle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter5() {
		rectangle = new Exercise114Rectangle(3, 8);
		double ex = 22;
		double ac = rectangle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter6() {
		rectangle = new Exercise114Rectangle(1, 2);
		double ex = 3;
		double ac = rectangle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter7() {
		rectangle = new Exercise114Rectangle(1, 2);
		double ex = 5;
		double ac = rectangle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter8() {
		rectangle = new Exercise114Rectangle(2, 1.7);
		double ex = 7.3;
		double ac = rectangle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter9() {
		rectangle = new Exercise114Rectangle(1.3, 1.4);
		double ex = 5;
		double ac = rectangle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter10() {
		rectangle = new Exercise114Rectangle(7, 1);
		double ex = 15;
		double ac = rectangle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}

}
