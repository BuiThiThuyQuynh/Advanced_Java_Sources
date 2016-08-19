/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calCircumference() method of Exercise15Rectangle
 * Input: length, width
 * Output: the circumference of rectangle
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise15Rectangle;

public class Exercise15CalCircumferenceJUnitTest {
	
	Exercise15Rectangle rectangle;

	@Test
	public void testCalCircumference1() {
		rectangle = new Exercise15Rectangle(1, 1);
		double ex = 4;
		double ac = rectangle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference2() {
		rectangle = new Exercise15Rectangle(0, 0);
		double ex = 0;
		double ac = rectangle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference3() {
		rectangle = new Exercise15Rectangle(2, 3);
		double ex = 10;
		double ac = rectangle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference4() {
		rectangle = new Exercise15Rectangle(2, 2);
		double ex = 8;
		double ac = rectangle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference5() {
		rectangle = new Exercise15Rectangle(3, 1);
		double ex = 8;
		double ac = rectangle.calCircumference();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference6() {
		rectangle = new Exercise15Rectangle(1, 1);
		double ex = 2;
		double ac = rectangle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference7() {
		rectangle = new Exercise15Rectangle(1, 2);
		double ex = 4;
		double ac = rectangle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference8() {
		rectangle = new Exercise15Rectangle(2, 3);
		double ex = 8;
		double ac = rectangle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference9() {
		rectangle = new Exercise15Rectangle(3, 2);
		double ex = 5;
		double ac = rectangle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalCircumference10() {
		rectangle = new Exercise15Rectangle(0, 0);
		double ex = 1;
		double ac = rectangle.calCircumference();
		assertNotEquals(ex, ac, 0.001);
	}

}
