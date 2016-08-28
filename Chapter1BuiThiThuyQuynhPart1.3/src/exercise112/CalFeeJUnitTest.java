/**
 * @athor Bui Thi Thuy Quynh
 * @date 28/08/2016
 * @version 2.0
 */

package exercise112;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * @description JUnit Test for calFee() method of Book class
 * @param0 no
 * @return fee of a book
 */
public class CalFeeJUnitTest {

	Book book;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee1() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 status of book (new or old)
		 */
		book = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 23000, 23, "Education", "new");
		
		double ex = 23000 * 23;
		double ac = book.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee2() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 status of book (new or old)
		 */
		book = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 12000, 1, "Education", "new");
		
		double ex = 12000;
		double ac = book.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee3() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 tax of book
		 */
		book = new ReferenceBook("TB01", "C Programming", new Date("23/12/2015"), 14000, 24, "Education", 0.2);
		
		double ex = 14000 * 24 + (14000 * 24) * 0.2;
		double ac = book.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee4() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 tax of book
		 */
		book = new ReferenceBook("TB01", "C Programming", new Date("23/12/2015"), 14000, 0, "Education", 0.2);
		
		double ex = 0;
		double ac = book.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee5() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 status of book (new or old)
		 */
		book = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 23000, 25, "Education", "new");
		
		double ex = 23000 * 25;
		double ac = book.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee6() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 status of book (new or old)
		 */
		book = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 23000, 23, "Education", "new");
		
		double ex = 23000;
		double ac = book.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee7() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 status of book (new or old)
		 */
		book = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 23000, 2, "Education", "old");
		
		double ex = 46000;
		double ac = book.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee8() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 tax of book
		 */
		book = new ReferenceBook("TB01", "C Programming", new Date("23/12/2015"), 14000, 24, "Education", 0.7);
		
		double ex = 7000 * 24 * 0.7;
		double ac = book.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee9() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 status of book (new or old)
		 */
		book = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 23000, 2, "Education", "new");
		
		double ex = 23000;
		double ac = book.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee10() {
		/**
		 * @param0 id of book
		 * @param1 name of book
		 * @param2 entered date of book
		 * @param3 price of book
		 * @param4 quantity of book
		 * @param5 manufactory of book
		 * @param6 tax of book
		 */
		book = new ReferenceBook("TB01", "C Programming", new Date("23/12/2015"), 14000, 24, "Education", 0.2);
		
		double ex = 14000 * 24;
		double ac = book.calFee();
		assertNotEquals(ex, ac, 0);
	}

}