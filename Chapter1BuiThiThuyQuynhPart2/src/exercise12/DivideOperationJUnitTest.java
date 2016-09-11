/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for divideOperation() method of Exercise12Operation
 * Input: firstNumber, secondNumber
 * Output: Divisor of two numbers
 */

package exercise12;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideOperationJUnitTest {

	Operation operation;
	
	@Test
	public void testDivideOperation1() {
		operation = new Operation(0, 3);
		double ex = 0;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation2() {
		operation = new Operation(-1, -2);
		double ex = 0.5;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation3() {
		operation = new Operation(1, 2);
		double ex = 0.5;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation4() {
		operation = new Operation(3, -1);
		double ex = -3;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation5() {
		operation = new Operation(-1, 3);
		double ex = -0.333;
		double ac = operation.divideOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation6() {
		operation = new Operation(1, 1);
		double ex = -1;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation7() {
		operation = new Operation(2, -1);
		double ex = 2;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation8() {
		operation = new Operation(-3, 1);
		double ex = -0.3;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation9() {
		operation = new Operation(-3, -1);
		double ex = 0.3;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testDivideOperation10() {
		operation = new Operation(1, 8);
		double ex = 0.1;
		double ac = operation.divideOperation();
		assertNotEquals(ex, ac, 0.001);
	}

}
