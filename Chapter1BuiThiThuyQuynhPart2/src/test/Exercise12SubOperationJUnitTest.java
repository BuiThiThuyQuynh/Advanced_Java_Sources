/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for subOperation() method of Exercise12Operation
 * Input: firstNumber, secondNumber
 * Output: minus of two numbers
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise12Operation;

public class Exercise12SubOperationJUnitTest {

	Exercise12Operation operation;
	
	@Test
	public void testSubOperation1() {
		operation = new Exercise12Operation(0, 0);
		double ex = 0;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation2() {
		operation = new Exercise12Operation(-1, -2);
		double ex = 1;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation3() {
		operation = new Exercise12Operation(1, 2);
		double ex = -1;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation4() {
		operation = new Exercise12Operation(3, -1);
		double ex = 4;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation5() {
		operation = new Exercise12Operation(-1, 3);
		double ex = -4;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation6() {
		operation = new Exercise12Operation(0, 0);
		double ex = -1;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation7() {
		operation = new Exercise12Operation(2, -1);
		double ex = 1;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation8() {
		operation = new Exercise12Operation(-2, 1);
		double ex = -1;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation9() {
		operation = new Exercise12Operation(-3, -1);
		double ex = -4;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation10() {
		operation = new Exercise12Operation(4, 6);
		double ex = 2;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}

}
