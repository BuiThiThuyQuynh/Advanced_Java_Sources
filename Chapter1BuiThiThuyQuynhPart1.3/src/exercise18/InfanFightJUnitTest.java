/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * JUnit Test for fight() method of Exercise18Infantryman
 * Input: no
 * Output: power of infantryman after decreasing
 */

package exercise18;

import static org.junit.Assert.*;

import org.junit.Test;

public class InfanFightJUnitTest {

	Infantryman infan;
	
	@Test
	public void testFightOfInfan1() {
		infan = new Infantryman("Infan", 10, "Gun");
		int ex = 8;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan2() {
		infan = new Infantryman("Infan", 8, "Gun");
		int ex = 6;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan3() {
		infan = new Infantryman("Infan", 6, "Gun");
		int ex = 4;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan4() {
		infan = new Infantryman("Infan", 15, "Gun");
		int ex = 13;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan5() {
		infan = new Infantryman("Infan", 0, "Gun");
		int ex = -2;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan6() {
		infan = new Infantryman("Infan", 10, "Gun");
		int ex = 7;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan7() {
		infan = new Infantryman("Infan", 3, "Gun");
		int ex = 0;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan8() {
		infan = new Infantryman("Infan", 0, "Gun");
		int ex = 0;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan9() {
		infan = new Infantryman("Infan", 12, "Gun");
		int ex = 12;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan10() {
		infan = new Infantryman("Infan", 10, "Gun");
		int ex = 9;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}

}
