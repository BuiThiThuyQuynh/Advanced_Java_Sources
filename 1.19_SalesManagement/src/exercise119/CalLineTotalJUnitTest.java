/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description JUnit Test for calLineTotal() of OrderDetail class
 * @return line total of order
 */
public class CalLineTotalJUnitTest {

	OrderDetail orderDetail;
	Product product;
	
	@Test
	public void testCalLineTotal1() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(10, product);
		
		double ex = 70000;
		double ac = orderDetail.calLineTotal();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal2() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Sugar", 20000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(4, product);
		
		double ex = 80000;
		double ac = orderDetail.calLineTotal();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal3() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Salt", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(2, product);
		
		double ex = 14000;
		double ac = orderDetail.calLineTotal();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal4() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Oil", 77000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(2, product);
		
		double ex = 154000;
		double ac = orderDetail.calLineTotal();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal5() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Snack", 10000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(3, product);
		
		double ex = 30000;
		double ac = orderDetail.calLineTotal();
		assertEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal6() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(10, product);
		
		double ex = 7000;
		double ac = orderDetail.calLineTotal();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal7() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Sugar", 20000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(10, product);
		
		double ex = 10;
		double ac = orderDetail.calLineTotal();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal8() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 8800.12);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(10, product);
		
		double ex = 88001;
		double ac = orderDetail.calLineTotal();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal9() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Oil", 77000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(10, product);
		
		double ex = 77000 * 5;
		double ac = orderDetail.calLineTotal();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@Test
	public void testCalLineTotal10() {
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetail = new OrderDetail(0, product);
		
		double ex = 7000;
		double ac = orderDetail.calLineTotal();
		assertNotEquals(ex, ac, 0.001);
	}

}
