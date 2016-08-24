/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * JUnit Test for fight() method of Exercise18Trooper
 * Input: no
 * Output: power of trooper after decreasing
 */

package exercise18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TrooperFightJUnitTest {

	Trooper trooper;
	
	@Test
	public void testFightOfTrooper1() {
		trooper = new Trooper("Trooper", 10, "Mine");
		int ex = 7;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper2() {
		trooper = new Trooper("Trooper", 8, "Mine");
		int ex = 5;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper3() {
		trooper = new Trooper("Trooper", 6, "Mine");
		int ex = 3;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper4() {
		trooper = new Trooper("Trooper", 15, "Mine");
		int ex = 12;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper5() {
		trooper = new Trooper("Trooper", 0, "Mine");
		int ex = -3;
		int ac = trooper.fight();
		assertEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper6() {
		trooper = new Trooper("Trooper", 10, "Mine");
		int ex = 8;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper7() {
		trooper = new Trooper("Trooper", 3, "Mine");
		int ex = 1;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper8() {
		trooper = new Trooper("Trooper", 0, "Mine");
		int ex = 0;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper9() {
		trooper = new Trooper("Trooper", 12, "Mine");
		int ex = 12;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testFightOfTrooper10() {
		trooper = new Trooper("Trooper", 10, "Mine");
		int ex = 9;
		int ac = trooper.fight();
		assertNotEquals(ex, ac);
	}
}
