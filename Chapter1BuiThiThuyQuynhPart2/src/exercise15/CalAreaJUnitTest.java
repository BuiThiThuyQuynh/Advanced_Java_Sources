/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calArea() method of Exercise15Rectangle
 * Input: length, width
 * Output: the area of rectangle
 */

package exercise15;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalAreaJUnitTest {

	Rectangle rectangle;

	@Test
	public void testCalArea1() {
		rectangle = new Rectangle(1, 1);
		double ex = 1;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea2() {
		rectangle = new Rectangle(0, 0);
		double ex = 0;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea3() {
		rectangle = new Rectangle(2, 3);
		double ex = 6;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea4() {
		rectangle = new Rectangle(2, 2);
		double ex = 4;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea5() {
		rectangle = new Rectangle(3, 1);
		double ex = 3;
		double ac = rectangle.calArea();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea6() {
		rectangle = new Rectangle(1, 1);
		double ex = 2;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea7() {
		rectangle = new Rectangle(1, 2);
		double ex = 4;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea8() {
		rectangle = new Rectangle(2, 3);
		double ex = 8;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea9() {
		rectangle = new Rectangle(3, 2);
		double ex = 5;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalArea10() {
		rectangle = new Rectangle(0, 0);
		double ex = 1;
		double ac = rectangle.calArea();
		assertNotEquals(ex, ac, 0.001);
	}

}
