/**
 * @author Bui Thi Thuy Quynh
 * @date 24/08/2016
 * @version 1.0
 */

package exercise118;

import static org.junit.Assert.*;

import org.junit.Test;

/**
* @description JUnit Test for calFee() method of Gift class into GiftBox
* @return fee included gift box fee and gift fee
*/
public class CalFeeGiftJUnitTest {

	/**
	 * @param0 shape of gift box
	 * @param1 color of gift box
	 */
	GiftBox giftbox = new GiftBox("Heart", "Red");
	
	GiftBox.Gift gift;
	
	@Test
	public void testCalFee1() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 1.5);
		
		double ex = 10300;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee2() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 1500);
		
		double ex = 310000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee3() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 0.3);
		
		double ex = 10060;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee4() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 0);
		
		double ex = 10000;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee5() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 1);
		
		double ex = 10200;
		double ac = gift.calFee();
		assertEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee6() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 0);
		
		double ex = 0;
		double ac = gift.calFee();
		assertNotEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee7() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 2.333);
		
		double ex = 104466;
		double ac = gift.calFee();
		assertNotEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee8() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 3.212);
		
		double ex = 10642;
		double ac = gift.calFee();
		assertNotEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee9() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 3.212);
		
		double ex = 10000;
		double ac = gift.calFee();
		assertNotEquals(ex, ac, 0.01);
	}
	
	@Test
	public void testCalFee10() {
		/**
		 * @param0 name of gift
		 * @param1 weight of gift
		 */
		gift = giftbox.new Gift("Book", 3.212);
		
		double ex = 642.4;
		double ac = gift.calFee();
		assertNotEquals(ex, ac, 0.01);
	}

}
