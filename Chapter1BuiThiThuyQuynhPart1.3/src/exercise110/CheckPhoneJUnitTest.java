/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise110;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @description JUnit Test for checkPhone() method of MainManagementInformation class
 * @param phone number
 * @return phone number is validate or not
 */
public class CheckPhoneJUnitTest {

	@Test
	public void testCheckPhone1() {
		boolean ac = MainManagementInformation.checkPhone("0987654321");
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPhone2() {
		boolean ac = MainManagementInformation.checkPhone("0987324565");
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPhone3() {
		boolean ac = MainManagementInformation.checkPhone("01234545646");
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPhone4() {
		boolean ac = MainManagementInformation.checkPhone("01234567892");
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPhone5() {
		boolean ac = MainManagementInformation.checkPhone("0987611111");
		assertTrue(ac);
	}
	
	@Test
	public void testCheckPhone6() {
		boolean ac = MainManagementInformation.checkPhone("09876543210");
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPhone7() {
		boolean ac = MainManagementInformation.checkPhone("09876321");
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPhone8() {
		boolean ac = MainManagementInformation.checkPhone("0287654321");
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPhone9() {
		boolean ac = MainManagementInformation.checkPhone("0387654321");
		assertFalse(ac);
	}
	
	@Test
	public void testCheckPhone10() {
		boolean ac = MainManagementInformation.checkPhone("019876543221");
		assertFalse(ac);
	}

}
