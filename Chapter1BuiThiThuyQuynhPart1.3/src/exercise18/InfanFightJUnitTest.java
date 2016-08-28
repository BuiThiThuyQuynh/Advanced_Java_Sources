/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 1.0
 */

package exercise18;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description JUnit Test for fight() method of Infantryman class
 * @return power of infantryman will decrease 2 after fight
 */
public class InfanFightJUnitTest {

	Infantryman infan;
	
	@Test
	public void testFightOfInfan1() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 10, "Gun");
		
		int ex = 8;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan2() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 8, "Gun");
		
		int ex = 6;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan3() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 6, "Gun");
		
		int ex = 4;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan4() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 15, "Gun");
		
		int ex = 13;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan5() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 0, "Gun");
		
		int ex = -2;
		int ac = infan.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan6() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 10, "Gun");
		
		int ex = 7;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan7() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 3, "Gun");
		
		int ex = 0;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan8() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 0, "Gun");
		
		int ex = 0;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan9() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 12, "Gun");
		
		int ex = 12;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfInfan10() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		infan = new Infantryman("Infan", 10, "Gun");
		
		int ex = 9;
		int ac = infan.fight();
		assertNotEquals(ex, ac);
	}

}
