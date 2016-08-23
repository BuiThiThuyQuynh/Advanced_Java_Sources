/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for addOperation() method of Exercise12Operation
 * Input: firstNumber, secondNumber
 * Output: summary of two numbers
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise12Operation;

public class Exercise12AddOperationJUnitTest {

	Exercise12Operation operation;
	
	@Test
	public void testAddOperation1() {
		operation = new Exercise12Operation(0, 0);
		double ex = 0;
		double ac = operation.addOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation2() {
		operation = new Exercise12Operation(-1, -2);
		double ex = -3;
		double ac = operation.addOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation3() {
		operation = new Exercise12Operation(1, 2);
		double ex = 3;
		double ac = operation.addOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation4() {
		operation = new Exercise12Operation(3, -1);
		double ex = 2;
		double ac = operation.addOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation5() {
		operation = new Exercise12Operation(-1, 3);
		double ex = 2;
		double ac = operation.addOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation6() {
		operation = new Exercise12Operation(0, 0);
		double ex = 1;
		double ac = operation.addOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation7() {
		operation = new Exercise12Operation(2, -1);
		double ex = 3;
		double ac = operation.addOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation8() {
		operation = new Exercise12Operation(-2, 1);
		double ex = 3;
		double ac = operation.addOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation9() {
		operation = new Exercise12Operation(-3, -1);
		double ex = 4;
		double ac = operation.addOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testAddOperation10() {
		operation = new Exercise12Operation(4, 6);
		double ex = 9;
		double ac = operation.addOperation();
		assertNotEquals(ex, ac, 0.001);
	}

}
