/**
 * @athor Bui Thi Thuy Quynh
 * @date 28/08/2016
 * @version 2.0
 */

package exercise111;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * @description JUnit Test for calFee() method of TransactionGold class
 * @param0 no
 * @return fee of transaction
 */
public class CalFeeTransactionJUnitTest {

	Transaction transaction;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee1() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of gold
		 * @param3 quantity of gold
		 * @param4 type of gold
		 */
		transaction = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 0, TypeGold.GOLD18K);
		
		double ex = 0;
		double ac = transaction.calFee();
		assertEquals(ex, ac, 0.001);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee2() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of currency
		 * @param3 quantity of currency
		 * @param4 type of currency
		 * @param5 type of transaction
		 */
		transaction = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 
				0, TypeCurrency.EUR, TypeTransaction.SALE);
		
		double ex = 0;
		double ac = transaction.calFee();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee3() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of currency
		 * @param3 quantity of currency
		 * @param4 type of currency
		 * @param5 type of transaction
		 */
		transaction = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.AUD.getPricePurchase(), 
				20, TypeCurrency.AUD, TypeTransaction.PURCHASE);
		
		double ex = 16.530 * 20;
		double ac = transaction.calFee();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee4() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of gold
		 * @param3 quantity of gold
		 * @param4 type of gold
		 */
		transaction = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLDSJC.getPrice(), 12, TypeGold.GOLDSJC);
		
		double ex = TypeGold.GOLDSJC.getPrice() * 12;
		double ac = transaction.calFee();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee5() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of currency
		 * @param3 quantity of currency
		 * @param4 type of currency
		 * @param5 type of transaction
		 */
		transaction = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 
				12, TypeCurrency.EUR, TypeTransaction.SALE);
		
		double ex = 268.288;
		double ac = transaction.calFee();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee6() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of gold
		 * @param3 quantity of gold
		 * @param4 type of gold
		 */
		transaction = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 0, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLD18K.getPrice();
		
		double ac = transaction.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee7() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of currency
		 * @param3 quantity of currency
		 * @param4 type of currency
		 * @param5 type of transaction
		 */
		transaction = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 
				24, TypeCurrency.USD, TypeTransaction.SALE);
		
		double ex = 0;
		double ac = transaction.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee8() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of currency
		 * @param3 quantity of currency
		 * @param4 type of currency
		 * @param5 type of transaction
		 */
		transaction = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPricePurchase(), 
				12, TypeCurrency.USD, TypeTransaction.PURCHASE);
		
		double ex = 16.530 * 12;
		double ac = transaction.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee9() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of gold
		 * @param3 quantity of gold
		 * @param4 type of gold
		 */
		transaction = new TransactionGold("ID01", new Date("01/01/2016"), TypeGold.GOLD18K.getPrice(), 12, TypeGold.GOLD18K);
		
		double ex = TypeGold.GOLD24K.getPrice() * 12;
		double ac = transaction.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee10() {
		/**
		 * @param0 id of transaction
		 * @param1 date of transaction
		 * @param2 price of currency
		 * @param3 quantity of currency
		 * @param4 type of currency
		 * @param5 type of transaction
		 */
		transaction = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 
				0, TypeCurrency.USD, TypeTransaction.SALE);
		double ex = 22.335;
		double ac = transaction.calFee();
		assertNotEquals(ex, ac, 0.001);
	}
	
	
}
