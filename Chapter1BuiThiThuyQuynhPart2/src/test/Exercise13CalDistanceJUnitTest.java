/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calDistance() method of Exercise13ManagementPoint
 * Input: pointA, pointB
 * Output: the distance between pointA and pointB
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise13Distance;
import classes.Exercise13Point;

public class Exercise13CalDistanceJUnitTest {
	
	Exercise13Point pointA;
	Exercise13Point pointB;
	
	Exercise13Distance points;

	@Test
	public void testCalDistance1() {
		pointA = new Exercise13Point(0, 0);
		pointB = new Exercise13Point(0, 0);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 0;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance2() {
		pointA = new Exercise13Point(1, 3);
		pointB = new Exercise13Point(2, 4);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 1.4142;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance3() {
		pointA = new Exercise13Point(4, 5);
		pointB = new Exercise13Point(8, 9);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 5.657;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance4() {
		pointA = new Exercise13Point(-1, -1);
		pointB = new Exercise13Point(-3, -3);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 2.828;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance5() {
		pointA = new Exercise13Point(-1, -1);
		pointB = new Exercise13Point(3, 3);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 5.657;
		double ac = points.calDistance();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance6() {
		pointA = new Exercise13Point(0, 0);
		pointB = new Exercise13Point(0, 0);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = -1;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance7() {
		pointA = new Exercise13Point(1, -1);
		pointB = new Exercise13Point(-3, 3);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 32;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance8() {
		pointA = new Exercise13Point(1, 3);
		pointB = new Exercise13Point(1, 3);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 1;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance9() {
		pointA = new Exercise13Point(1, 1);
		pointB = new Exercise13Point(2, 2);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 1;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalDistance10() {
		pointA = new Exercise13Point(1, 3);
		pointB = new Exercise13Point(2, 4);
		
		points = new Exercise13Distance(pointA, pointB);
		
		double ex = 1.4;
		double ac = points.calDistance();
		assertNotEquals(ex, ac, 0.001);
	}

}
