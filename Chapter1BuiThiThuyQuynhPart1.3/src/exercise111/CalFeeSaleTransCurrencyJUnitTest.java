/**
 * Author: Bui Thi Thuy Quynh
 * Date: 24/08/2016
 * Version: 1.0
 * 
 * JUnit Test for calfFeeSale() method of TransactionCurrency class
 * Input: no
 * Output: fee of transaction currency in sale transaction
 */

package exercise111;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class CalFeeSaleTransCurrencyJUnitTest {

	TransactionCurrency currency;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale1() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 10, TypeCurrency.USD, TypeTransaction.SALE);
		double ex = 223.573;
		double ac = currency.calFeeSale();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale2() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 0, TypeCurrency.EUR, TypeTransaction.SALE);
		double ex = 0;
		double ac = currency.calFeeSale();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale3() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 20, TypeCurrency.AUD, TypeTransaction.SALE);
		double ex = 447.147;
		double ac = currency.calFeeSale();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale4() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 9, TypeCurrency.USD, TypeTransaction.SALE);
		double ex = 201.216;
		double ac = currency.calFeeSale();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale5() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 12, TypeCurrency.EUR, TypeTransaction.SALE);
		double ex = 268.288;
		double ac = currency.calFeeSale();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale6() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 13, TypeCurrency.USD, TypeTransaction.SALE);
		double ex = 22.250 * 0;
		double ac = currency.calFeeSale();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale7() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 24, TypeCurrency.USD, TypeTransaction.SALE);
		double ex = 0;
		double ac = currency.calFeeSale();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale8() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 12, TypeCurrency.USD, TypeTransaction.SALE);
		double ex = 22.250 * 12;
		double ac = currency.calFeeSale();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale9() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 17, TypeCurrency.USD, TypeTransaction.SALE);
		double ex = 22.335 * 16;
		double ac = currency.calFeeSale();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFeeSale10() {
		currency = new TransactionCurrency("ID01", new Date("01/01/2016"), TypeCurrency.USD.getPriceSale(), 0, TypeCurrency.USD, TypeTransaction.SALE);
		double ex = 22.335;
		double ac = currency.calFeeSale();
		assertNotEquals(ex, ac, 0.001);
	}

}
