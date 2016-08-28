/**
 * Author: Bui Thi Thuy Quynh
 * Date: 28/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calfFee() method of TransactionGold class
 * Input: no
 * Output: fee of transaction gold
 */

package exercise111;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class CalFeeTransactionGoldJUnitTest {

	TransactionGold gold;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee1() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 0, TypeGold.GOLD18K);
		
		double ex = 0;
		double ac = gold.calFee();
		assertEquals(ex, ac, 0.001);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee2() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD24K.getPrice(), 2, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLD24K.getPrice() * 2;
		double ac = gold.calFee();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee3() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD24K.getPrice(), 23, TypeGold.GOLD24K);
		
		double ex = TypeGold.GOLD24K.getPrice() * 23;
		double ac = gold.calFee();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee4() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLDSJC.getPrice(), 12, TypeGold.GOLDSJC);
		
		double ex = TypeGold.GOLDSJC.getPrice() * 12;
		double ac = gold.calFee();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee5() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 12, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLD18K.getPrice() * 12;
		double ac = gold.calFee();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee6() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 0, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLD18K.getPrice();
		double ac = gold.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee7() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 12, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLD24K.getPrice() * 12;
		double ac = gold.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee8() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 0, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLD18K.getPrice();
		double ac = gold.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee9() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 12, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLD24K.getPrice() * 12;
		double ac = gold.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee10() {
		gold = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 2, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLDSJC.getPrice() * 2;
		double ac = gold.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	
}
