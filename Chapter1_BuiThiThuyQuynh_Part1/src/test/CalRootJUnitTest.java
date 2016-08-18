package test;

import static org.junit.Assert.*;
import main.LinenearEquation;

import org.junit.Test;

public class CalRootJUnitTest {
	
	LinenearEquation le = new LinenearEquation();

	/*
	 * return of le.calRoot:
	 * 0: Numerous roots
	 * b: no root
	 * -b/a: other
	 */
	@Test
	public void testCheckRoot1() {
		double ex = 0;
		double ac = le.calRoot(0, 0);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot2() {
		double ex = -3;
		double ac = le.calRoot(0, -3);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot3() {
		double ex = 0;
		double ac = le.calRoot(3, 0);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot4() {
		double ex = 3;
		double ac = le.calRoot(0, 3);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot5() {
		double ex = -0.5;
		double ac = le.calRoot(4, 2);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot6() {
		double ex = 0.4;
		double ac = le.calRoot(3, -1);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot7() {
		double ex = 0;
		double ac = le.calRoot(8, 1);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot8() {
		double ex = 3;
		double ac = le.calRoot(0, -3);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot9() {
		double ex = -3;
		double ac = le.calRoot(0, 3);
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCheckRoot10() {
		double ex = -1;
		double ac = le.calRoot(5, 0);
		assertEquals(ex, ac, 0.001);
	}

}
