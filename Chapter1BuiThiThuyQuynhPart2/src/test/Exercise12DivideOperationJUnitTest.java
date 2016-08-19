/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for DivideOperation() method of Exercise12Operation
 * Input: firstNumber, secondNumber
 * Output: Divideplication of two numbers
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise12Operation;

public class Exercise12DivideOperationJUnitTest {

	Exercise12Operation operation;
	
	@Test
	public void testDivideOperation1() {
		operation = new Exercise12Operation(0, 3);
		double ex = 0;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation2() {
		operation = new Exercise12Operation(-1, -2);
		double ex = 0.5;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation3() {
		operation = new Exercise12Operation(1, 2);
		double ex = 0.5;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation4() {
		operation = new Exercise12Operation(3, -1);
		double ex = -3;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation5() {
		operation = new Exercise12Operation(-1, 3);
		double ex = -0.333;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation6() {
		operation = new Exercise12Operation(1, 1);
		double ex = -1;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation7() {
		operation = new Exercise12Operation(2, -1);
		double ex = 2;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation8() {
		operation = new Exercise12Operation(-3, 1);
		double ex = -0.3;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation9() {
		operation = new Exercise12Operation(-3, -1);
		double ex = 0.3;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation10() {
		operation = new Exercise12Operation(1, 8);
		double ex = 0.1;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}

}
