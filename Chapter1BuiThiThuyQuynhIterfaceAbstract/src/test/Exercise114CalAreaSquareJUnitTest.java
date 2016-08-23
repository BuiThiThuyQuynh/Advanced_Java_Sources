/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calArea() method of Exercise115Square
 * Input: no
 * Output: area of square
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise114Square;

public class Exercise114CalAreaSquareJUnitTest {

	Exercise114Square square;

	@Test
	public void testCalArea1() {
		square = new Exercise114Square(1);
		double ex = 1;
		double ac = square.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea2() {
		square = new Exercise114Square(2);
		double ex = 4;
		double ac = square.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea3() {
		square = new Exercise114Square(0);
		double ex = 0;
		double ac = square.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea4() {
		square = new Exercise114Square(6);
		double ex = 36;
		double ac = square.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea5() {
		square = new Exercise114Square(3);
		double ex = 9;
		double ac = square.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea6() {
		square = new Exercise114Square(0);
		double ex = 1;
		double ac = square.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea7() {
		square = new Exercise114Square(1);
		double ex = 2;
		double ac = square.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea8() {
		square = new Exercise114Square(2);
		double ex = 8;
		double ac = square.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea9() {
		square = new Exercise114Square(1.3);
		double ex = 1.6;
		double ac = square.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea10() {
		square = new Exercise114Square(0.3);
		double ex = 0.1;
		double ac = square.calArea();
		assertNotEquals(ex, ac, 0.001);
	}

}
