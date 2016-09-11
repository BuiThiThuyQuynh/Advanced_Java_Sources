/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for subOperation() method of Exercise12Operation
 * Input: firstNumber, secondNumber
 * Output: minus of two numbers
 */

package exercise12;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubOperationJUnitTest {

	Operation operation;
	
	@Test
	public void testSubOperation1() {
		operation = new Operation(0, 0);
		double ex = 0;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation2() {
		operation = new Operation(-1, -2);
		double ex = 1;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation3() {
		operation = new Operation(1, 2);
		double ex = -1;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation4() {
		operation = new Operation(3, -1);
		double ex = 4;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation5() {
		operation = new Operation(-1, 3);
		double ex = -4;
		double ac = operation.subOperation();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation6() {
		operation = new Operation(0, 0);
		double ex = -1;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation7() {
		operation = new Operation(2, -1);
		double ex = 1;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation8() {
		operation = new Operation(-2, 1);
		double ex = -1;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation9() {
		operation = new Operation(-3, -1);
		double ex = -4;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testSubOperation10() {
		operation = new Operation(4, 6);
		double ex = 2;
		double ac = operation.subOperation();
		assertNotEquals(ex, ac, 0.001);
	}

}
