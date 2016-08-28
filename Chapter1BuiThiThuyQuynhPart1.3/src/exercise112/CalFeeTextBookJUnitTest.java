package exercise112;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class CalFeeTextBookJUnitTest {

	TextBook textbook;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee1() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 23000, 23, "Education", "new");
		
		double ex = 23000 * 23;
		double ac = textbook.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee2() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 12000, 1, "Education", "new");
		
		double ex = 12000;
		double ac = textbook.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee3() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 50000, 0, "Education", "old");
		
		double ex = 0;
		double ac = textbook.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee4() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 50000, 23, "Education", "old");
		
		double ex = 25000 * 23;
		double ac = textbook.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee5() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 11100, 10, "Education", "new");
		
		double ex = 111000;
		double ac = textbook.calFee();
		assertEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee6() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 50000, 0, "Education", "new");
		
		double ex = 50000;
		double ac = textbook.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee7() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 50000, 1, "Education", "old");
		
		double ex = 50000;
		double ac = textbook.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee8() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 14000, 24, "Education", "new");
		
		double ex = 7000 * 24;
		double ac = textbook.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee9() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 13000, 9, "Education", "new");
		
		double ex = 0;
		double ac = textbook.calFee();
		assertNotEquals(ex, ac, 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCalFee10() {
		textbook = new TextBook("TB01", "C Programming", new Date("23/12/2015"), 16000, 8, "Education", "new");
		
		double ex = 16000 * 4;
		double ac = textbook.calFee();
		assertNotEquals(ex, ac, 0);
	}

}