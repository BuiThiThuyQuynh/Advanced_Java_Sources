/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calPerimeter() method of Exercise115Circle
 * Input: no
 * Output: perimeter of circle
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise114Circle;

public class Exercise114CalPerimeterCircleJUnitTest {
	
	Exercise114Circle circle;

	@Test
	public void testCalPerimeter1() {
		circle = new Exercise114Circle(1);
		double ex = 6.283;
		double ac = circle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter2() {
		circle = new Exercise114Circle(2);
		double ex = 12.566;
		double ac = circle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter3() {
		circle = new Exercise114Circle(0);
		double ex = 0;
		double ac = circle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter4() {
		circle = new Exercise114Circle(6);
		double ex = 37.698;
		double ac = circle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter5() {
		circle = new Exercise114Circle(3);
		double ex = 18.849;
		double ac = circle.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter6() {
		circle = new Exercise114Circle(0);
		double ex = 1;
		double ac = circle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter7() {
		circle = new Exercise114Circle(1);
		double ex = 3.1415;
		double ac = circle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter8() {
		circle = new Exercise114Circle(2);
		double ex = 15.5;
		double ac = circle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter9() {
		circle = new Exercise114Circle(1.3);
		double ex = 8.17;
		double ac = circle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter10() {
		circle = new Exercise114Circle(7);
		double ex = 43.9;
		double ac = circle.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}

}
