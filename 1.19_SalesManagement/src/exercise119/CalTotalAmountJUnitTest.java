/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * @description JUnit Test for calTotalAmount() of Order class
 * @return total amount of order
 */
public class CalTotalAmountJUnitTest {

	Order order;
	OrderDetail[] orderDetails;
	Product product;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount1() {
		orderDetails =  new OrderDetail[1];
		
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetails[0] = new OrderDetail(10, product);
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), true, orderDetails);
		
		double ex = 77000;
		double ac = order.calTotalAmount();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount2() {
		orderDetails =  new OrderDetail[0];
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), true, orderDetails);
		
		double ex = 0;
		double ac = order.calTotalAmount();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount3() {
		orderDetails =  new OrderDetail[2];
		
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetails[0] = new OrderDetail(10, product);
		
		product = new Product("Sugar", 20000);
		orderDetails[1] = new OrderDetail(2, product);
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), false, orderDetails);
		
		double ex = 110000;
		double ac = order.calTotalAmount();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount4() {
		orderDetails =  new OrderDetail[3];
		
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetails[0] = new OrderDetail(10, product);
		
		product = new Product("Sugar", 20000);
		orderDetails[1] = new OrderDetail(2, product);
		
		product = new Product("Salt", 7000);
		orderDetails[2] = new OrderDetail(1, product);
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), false, orderDetails);
		
		double ex = 117000;
		double ac = order.calTotalAmount();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount5() {
		orderDetails =  new OrderDetail[4];
		
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetails[0] = new OrderDetail(10, product);
		
		product = new Product("Sugar", 20000);
		orderDetails[1] = new OrderDetail(2, product);
		
		product = new Product("Oil", 77000);
		orderDetails[2] = new OrderDetail(1, product);
		
		product = new Product("Salt", 7000);
		orderDetails[3] = new OrderDetail(1, product);
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), true, orderDetails);
		
		double ex = 213400;
		double ac = order.calTotalAmount();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount6() {
		orderDetails =  new OrderDetail[0];
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), true, orderDetails);
		
		double ex = 1000;
		double ac = order.calTotalAmount();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount7() {
		orderDetails =  new OrderDetail[1];
		
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetails[0] = new OrderDetail(10, product);
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), true, orderDetails);
		
		double ex = 7000;
		double ac = order.calTotalAmount();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount8() {
		orderDetails =  new OrderDetail[2];
		
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetails[0] = new OrderDetail(10, product);
		
		product = new Product("Sugar", 20000);
		orderDetails[1] = new OrderDetail(10, product);
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), true, orderDetails);
		
		double ex = 27000;
		double ac = order.calTotalAmount();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount9() {
		orderDetails =  new OrderDetail[2];
		
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetails[0] = new OrderDetail(10, product);
		
		product = new Product("Sugar", 20000);
		orderDetails[1] = new OrderDetail(4, product);
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), true, orderDetails);
		
		double ex = 270000;
		double ac = order.calTotalAmount();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalTotalAmount10() {
		orderDetails =  new OrderDetail[2];
		
		/**
		 * @param0 name of product
		 * @param1 price of product
		 */
		product = new Product("Milk", 7000);
		
		/**
		 * @param0 quantity of product
		 * @param1 product
		 */
		orderDetails[0] = new OrderDetail(10, product);
		
		product = new Product("Sugar", 20000);
		orderDetails[1] = new OrderDetail(10, product);
		
		/**
		 * @param0 order date
		 * @param1 print order or not
		 * @param3 list order detail
		 */
		order = new Order(new Date("01/01/2916"), true, orderDetails);
		
		double ex = 70000;
		double ac = order.calTotalAmount();
		assertNotEquals(ex, ac, 0.001);
	}
	

}
