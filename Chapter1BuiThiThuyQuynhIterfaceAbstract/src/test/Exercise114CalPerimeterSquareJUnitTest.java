/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calPerimeter() method of Exercise115Square
 * Input: no
 * Output: perimeter of square
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise114Square;

public class Exercise114CalPerimeterSquareJUnitTest {

	Exercise114Square square;

	@Test
	public void testCalPerimeter1() {
		square = new Exercise114Square(1);
		double ex = 4;
		double ac = square.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter2() {
		square = new Exercise114Square(2);
		double ex = 8;
		double ac = square.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter3() {
		square = new Exercise114Square(0);
		double ex = 0;
		double ac = square.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter4() {
		square = new Exercise114Square(6);
		double ex = 24;
		double ac = square.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter5() {
		square = new Exercise114Square(3);
		double ex = 12;
		double ac = square.calPerimeter();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter6() {
		square = new Exercise114Square(0);
		double ex = 1;
		double ac = square.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter7() {
		square = new Exercise114Square(1);
		double ex = 1;
		double ac = square.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter8() {
		square = new Exercise114Square(2);
		double ex = 4;
		double ac = square.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter9() {
		square = new Exercise114Square(1.3);
		double ex = 5;
		double ac = square.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalPerimeter10() {
		square = new Exercise114Square(7.7);
		double ex = 30.9;
		double ac = square.calPerimeter();
		assertNotEquals(ex, ac, 0.001);
	}
}
