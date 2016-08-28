/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
* @description JUnit test for fight() method of Trooper
* @return power of trooper will decrease 3 after fight
*/
public class TrooperFightJUnitTest {

	Trooper trooper;
	
	@Test
	public void testFightOfTrooper1() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 10, "Mine");
		
		int ex = 7;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper2() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 8, "Mine");
		
		int ex = 5;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper3() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 6, "Mine");
		
		int ex = 3;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper4() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 15, "Mine");
		
		int ex = 12;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper5() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 0, "Mine");
		
		int ex = -3;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper6() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 10, "Mine");
		
		int ex = 8;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper7() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 3, "Mine");
		
		int ex = 1;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper8() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 0, "Mine");
		
		int ex = 0;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper9() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 12, "Mine");
		
		int ex = 12;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper10() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		trooper = new Trooper("Trooper", 10, "Mine");
		
		int ex = 9;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
}
