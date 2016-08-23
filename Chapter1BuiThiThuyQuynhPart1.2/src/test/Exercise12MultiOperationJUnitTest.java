/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for multiOperation() method of Exercise12Operation
 * Input: firstNumber, secondNumber
 * Output: the result of multiplication between two numbers
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise12Operation;

public class Exercise12MultiOperationJUnitTest {

	Exercise12Operation operation;
	
	@Test
	public void testMultiOperation1() {
		operation = new Exercise12Operation(0, 0);
		double ex = 0;
		double ac = operation.multiOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation2() {
		operation = new Exercise12Operation(-1, -2);
		double ex = 2;
		double ac = operation.multiOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation3() {
		operation = new Exercise12Operation(1, 2);
		double ex = 2;
		double ac = operation.multiOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation4() {
		operation = new Exercise12Operation(3, -1);
		double ex = -3;
		double ac = operation.multiOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation5() {
		operation = new Exercise12Operation(-1, 3);
		double ex = -3;
		double ac = operation.multiOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation6() {
		operation = new Exercise12Operation(0, 0);
		double ex = -1;
		double ac = operation.multiOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation7() {
		operation = new Exercise12Operation(2, -1);
		double ex = 2;
		double ac = operation.multiOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation8() {
		operation = new Exercise12Operation(-2, 1);
		double ex = 2;
		double ac = operation.multiOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation9() {
		operation = new Exercise12Operation(-3, -1);
		double ex = -3;
		double ac = operation.multiOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testMultiOperation10() {
		operation = new Exercise12Operation(4, 6);
		double ex = 30;
		double ac = operation.multiOperation();
		assertNotEquals(ex, ac, 0.001);
	}

}
