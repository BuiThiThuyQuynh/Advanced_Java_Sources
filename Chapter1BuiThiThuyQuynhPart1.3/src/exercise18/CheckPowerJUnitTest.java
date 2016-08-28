/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version2 2.0
 */

package exercise18;

import static org.junit.Assert.*;

import org.junit.Test;

/**
* @description JUnit Test for checkPower() method of Soldier
* @return power of soldier is out of or not
*/
public class CheckPowerJUnitTest {
	
	Soldier soldier;

	@Test
	public void testCheckPower1() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Infantryman("Italia", 10, "Gun");
		
		boolean ac = soldier.checkPower();
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPower2() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Trooper("France", 6, "Gun");
		
		boolean ac = soldier.checkPower();
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPower3() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Infantryman("Italia", 0, "Gun");
		
		boolean ac = soldier.checkPower();
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPower4() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Trooper("France", 0, "Gun");
		
		boolean ac = soldier.checkPower();
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPower5() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Infantryman("Italia", -3, "Gun");
		
		boolean ac = soldier.checkPower();
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPower6() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Trooper("France", -2, "Gun");
		
		boolean ac = soldier.checkPower();
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPower7() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Infantryman("Italia", 5, "Gun");
		
		boolean ac = soldier.checkPower();
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPower8() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Trooper("France", 1, "Gun");
		
		boolean ac = soldier.checkPower();
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPower9() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Infantryman("Italia", -1, "Gun");
		
		boolean ac = soldier.checkPower();
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPower10() {
		/**
		 * @param0 name of soldier
		 * @param1 power of soldier
		 * @param2 weapon of soldier
		 */
		soldier = new Trooper("France", 7, "Gun");
		
		boolean ac = soldier.checkPower();
		assertTrue(ac);
	}
}
