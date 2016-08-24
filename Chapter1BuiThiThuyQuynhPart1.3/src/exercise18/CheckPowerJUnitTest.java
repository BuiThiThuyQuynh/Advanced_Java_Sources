/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * JUnit Test for checkPower() method of Exercise18Handling
 * Input: infantryman, trooper
 * Output: result of checking (1 if power of infantryman <= 0
 * 							   2 if power of trooper <= 0
 * 							   3 if others)
 */

package exercise18;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPowerJUnitTest {
	
	Infantryman infan;
	Trooper trooper;

	@Test
	public void testCheckPower1() {
		infan = new Infantryman("Italia", 10, "Gun");
		trooper = new Trooper("France", 12, "Boom");
		
		int ex = 3;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower2() {
		infan = new Infantryman("Italia", 7, "Gun");
		trooper = new Trooper("France", -3, "Boom");
		
		int ex = 2;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower3() {
		infan = new Infantryman("Italia", 0, "Gun");
		trooper = new Trooper("France", 12, "Boom");
		
		int ex = 1;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower4() {
		infan = new Infantryman("Italia", 10, "Gun");
		trooper = new Trooper("France", 0, "Boom");
		
		int ex = 2;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower5() {
		infan = new Infantryman("Italia", -2, "Gun");
		trooper = new Trooper("France", 12, "Boom");
		
		int ex = 1;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower6() {
		infan = new Infantryman("Italia", 10, "Gun");
		trooper = new Trooper("France", 12, "Boom");
		
		int ex = 1;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower7() {
		infan = new Infantryman("Italia", -2, "Gun");
		trooper = new Trooper("France", 12, "Boom");
		
		int ex = 2;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower8() {
		infan = new Infantryman("Italia", 10, "Gun");
		trooper = new Trooper("France", -3, "Boom");
		
		int ex = 3;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower9() {
		infan = new Infantryman("Italia", 10, "Gun");
		trooper = new Trooper("France", 12, "Boom");
		
		int ex = 1;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertNotEquals(ex, ac);
	}
	
	@Test
	public void testCheckPower10() {
		infan = new Infantryman("Italia", 10, "Gun");
		trooper = new Trooper("France", 12, "Boom");
		
		int ex = 2;
		int ac = MainManagementFighting.checkPower(infan, trooper);
		assertNotEquals(ex, ac);
	}

}
