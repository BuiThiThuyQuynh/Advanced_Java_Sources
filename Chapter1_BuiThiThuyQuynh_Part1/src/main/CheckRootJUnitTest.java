package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckRootJUnitTest {
	LinenearEquation le = new LinenearEquation();
	
	@Test
	public void testCheckRoot1() {
		String ex = "Numerous roots";
		double root = le.calRoot(0, 0);
		String ac = TestLinenearEquation.checkRoot(root, 0, 0);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckRoot2() {
		String ex = "No root";
		double root = le.calRoot(0, -2);
		String ac = TestLinenearEquation.checkRoot(root, 0, -2);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckRoot3() {
		String ex = "0";
		double root = le.calRoot(-2, 0);
		String ac = TestLinenearEquation.checkRoot(root, -2, 0);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckRoot4() {
		String ex = "No root";
		double root = le.calRoot(0, -3);
		String ac = TestLinenearEquation.checkRoot(root, 0, -3);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckRoot5() {
		double ex = -0.5;
		double root = le.calRoot(4, 2);
		String ac = TestLinenearEquation.checkRoot(root, 4, 2);
		double acc = Double.parseDouble(ac);
		assertEquals(ex, acc, 0.001);
	}
	
	@Test
	public void testCheckRoot6() {
		String ex = "No root";
		double root = le.calRoot(-3, 0);
		String ac = TestLinenearEquation.checkRoot(root, -3, 0);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckRoot7() {
		String ex = "0.5";
		double root = le.calRoot(2, 1);
		String ac = TestLinenearEquation.checkRoot(root, 2, 1);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckRoot8() {
		double ex = 0.4;
		double root = le.calRoot(3, 1);
		String ac = TestLinenearEquation.checkRoot(root, 3, 1);
		double acc = Double.parseDouble(ac);
		assertEquals(ex, acc, 0.001);
	}
	
	@Test
	public void testCheckRoot9() {
		String ex = "No root";
		double root = le.calRoot(0, 0);
		String ac = TestLinenearEquation.checkRoot(root, 0, 0);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckRoot10() {
		String ex = "Numerous roots";
		double root = le.calRoot(0, -3);
		String ac = TestLinenearEquation.checkRoot(root, 0, -3);
		assertEquals(ex, ac);
	}

}
