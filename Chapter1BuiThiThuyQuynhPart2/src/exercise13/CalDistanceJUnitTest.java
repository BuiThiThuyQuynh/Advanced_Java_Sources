/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calDistance() method of Exercise13ManagementPoint
 * Input: pointA, pointB
 * Output: the distance between pointA and pointB
 */

package exercise13;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalDistanceJUnitTest {
	
	Point pointA;
	Point pointB;
	
	Distance points;

	@Test
	public void testCalDistance1() {
		pointA = new Point(0, 0);
		pointB = new Point(0, 0);
		
		points = new Distance(pointA, pointB);
		
		double ex = 0;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance2() {
		pointA = new Point(1, 3);
		pointB = new Point(2, 4);
		
		points = new Distance(pointA, pointB);
		
		double ex = 1.4142;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance3() {
		pointA = new Point(4, 5);
		pointB = new Point(8, 9);
		
		points = new Distance(pointA, pointB);
		
		double ex = 5.657;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance4() {
		pointA = new Point(-1, -1);
		pointB = new Point(-3, -3);
		
		points = new Distance(pointA, pointB);
		
		double ex = 2.828;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance5() {
		pointA = new Point(-1, -1);
		pointB = new Point(3, 3);
		
		points = new Distance(pointA, pointB);
		
		double ex = 5.657;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance6() {
		pointA = new Point(0, 0);
		pointB = new Point(0, 0);
		
		points = new Distance(pointA, pointB);
		
		double ex = -1;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance7() {
		pointA = new Point(1, -1);
		pointB = new Point(-3, 3);
		
		points = new Distance(pointA, pointB);
		
		double ex = 32;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance8() {
		pointA = new Point(1, 3);
		pointB = new Point(1, 3);
		
		points = new Distance(pointA, pointB);
		
		double ex = 1;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance9() {
		pointA = new Point(1, 1);
		pointB = new Point(2, 2);
		
		points = new Distance(pointA, pointB);
		
		double ex = 1;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance10() {
		pointA = new Point(1, 3);
		pointB = new Point(2, 4);
		
		points = new Distance(pointA, pointB);
		
		double ex = 1.4;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}

}
