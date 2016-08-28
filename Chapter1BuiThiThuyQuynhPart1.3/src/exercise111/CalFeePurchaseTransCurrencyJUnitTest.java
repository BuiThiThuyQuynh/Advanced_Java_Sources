/**
 * Author: Bui Thi Thuy Quynh
 * Date: 27/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calfFeePurchase() method of TransactionCurrency class
 * Input: no
 * Output: fee of transaction in purchase transaction
 */

package exercise111;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class CalFeePurchaseTransCurrencyJUnitTest {

TransactionCurrency currency;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase1() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPricePurchase(), 10, TypeCurrency.USD, TypeTransaction.PURCHASE);
		double ex = 22.250 * 10;
		double ac = currency.calFeePurchase();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase2() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.EUR.getPricePurchase(), 0, TypeCurrency.EUR, TypeTransaction.PURCHASE);
		double ex = 0;
		double ac = currency.calFeePurchase();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase3() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.AUD.getPricePurchase(), 20, TypeCurrency.AUD, TypeTransaction.PURCHASE);
		double ex = 16.530 * 20;
		double ac = currency.calFeePurchase();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase4() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPricePurchase(), 9, TypeCurrency.USD, TypeTransaction.PURCHASE);
		double ex = 22.250 * 9;
		double ac = currency.calFeePurchase();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase5() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.EUR.getPricePurchase(), 12, TypeCurrency.EUR, TypeTransaction.PURCHASE);
		double ex = 24.457 * 12;
		double ac = currency.calFeePurchase();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase6() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPricePurchase(), 13, TypeCurrency.USD, TypeTransaction.PURCHASE);
		double ex = 22.250 * 0;
		double ac = currency.calFeePurchase();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase7() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPricePurchase(), 24, TypeCurrency.USD, TypeTransaction.PURCHASE);
		double ex = 22.335 * 24;
		double ac = currency.calFeePurchase();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase8() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPricePurchase(), 12, TypeCurrency.USD, TypeTransaction.PURCHASE);
		double ex = 16.530 * 12;
		double ac = currency.calFeePurchase();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase9() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPricePurchase(), 17, TypeCurrency.USD, TypeTransaction.PURCHASE);
		double ex = 24.457 * 17;
		double ac = currency.calFeePurchase();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeePurchase10() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPricePurchase(), 0, TypeCurrency.USD, TypeTransaction.PURCHASE);
		double ex = 22.250;
		double ac = currency.calFeePurchase();
		assertNotEquals(ex, ac, 0.001);
	}

}
