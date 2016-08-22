/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * JUnit Test for sumFeeLaptop() method of Exercise19ManagementComputer
 * Input: no
 * Output: totals amount of array laptop
 */

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Exercise19Laptop;
import classes.Exercise19ManagementComputer;

public class Exercise19SumFeeLaptop {

	Exercise19ManagementComputer computers = new Exercise19ManagementComputer();
	Exercise19Laptop[] laptops;
	
	@Test
	public void testSumFeeLaptop1() {
		laptops =  new Exercise19Laptop[3];
		laptops[0] = new Exercise19Laptop("001", 12000, "Sony", 10, 1.3, 5, 14);
		laptops[1] = new Exercise19Laptop("001", 10000, "Sony", 2, 1.3, 5, 14);
		laptops[2] = new Exercise19Laptop("001", 1000, "Sony", 1, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 141000;
		double ac = computers.sumFeeLapTop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop2() {
		laptops =  new Exercise19Laptop[1];
		laptops[0] = new Exercise19Laptop("001", 12000, "Sony", 14, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 12000 * 14;
		double ac = computers.sumFeeLapTop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop3() {
		laptops =  new Exercise19Laptop[2];
		laptops[0] = new Exercise19Laptop("001", 1000, "Sony", 14, 1.3, 5, 14);
		laptops[1] = new Exercise19Laptop("001", 12000, "Sony", 1, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 26000;
		double ac = computers.sumFeeLapTop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop4() {
		laptops =  new Exercise19Laptop[4];
		laptops[0] = new Exercise19Laptop("001", 1000, "Sony", 4, 1.3, 5, 14);
		laptops[1] = new Exercise19Laptop("001", 2000, "Sony", 3, 1.3, 5, 14);
		laptops[2] = new Exercise19Laptop("001", 3000, "Sony", 2, 1.3, 5, 14);
		laptops[3] = new Exercise19Laptop("001", 4000, "Sony", 1, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 20000;
		double ac = computers.sumFeeLapTop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop5() {
		laptops =  new Exercise19Laptop[2];
		laptops[0] = new Exercise19Laptop("001", 12000, "Sony", 1, 1.3, 5, 14);
		laptops[1] = new Exercise19Laptop("001", 12000, "Sony", 1, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 24000;
		double ac = computers.sumFeeLapTop();
		assertEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop6() {
		laptops =  new Exercise19Laptop[3];
		laptops[0] = new Exercise19Laptop("001", 12000, "Sony", 1, 1.3, 5, 14);
		laptops[1] = new Exercise19Laptop("001", 1000, "Sony", 1, 1.3, 5, 14);
		laptops[2] = new Exercise19Laptop("001", 2000, "Sony", 2, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 13000;
		double ac = computers.sumFeeLapTop();
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop7() {
		laptops =  new Exercise19Laptop[1];
		laptops[0] = new Exercise19Laptop("001", 12000, "Sony", 0, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 12000;
		double ac = computers.sumFeeLapTop();
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop8() {
		laptops =  new Exercise19Laptop[2];
		laptops[0] = new Exercise19Laptop("001", 12000, "Sony", 14, 1.3, 5, 14);
		laptops[1] = new Exercise19Laptop("001", 12000, "Sony", 3, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 24000;
		double ac = computers.sumFeeLapTop();
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop9() {
		laptops =  new Exercise19Laptop[1];
		laptops[0] = new Exercise19Laptop("001", 0, "Sony", 14, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 14;
		double ac = computers.sumFeeLapTop();
		assertNotEquals(ex, ac, 0);
		
	}
	
	@Test
	public void testSumFeeLaptop10() {
		laptops =  new Exercise19Laptop[4];
		laptops[0] = new Exercise19Laptop("001", 1000, "Sony", 1, 1.3, 5, 14);
		laptops[1] = new Exercise19Laptop("001", 1000, "Sony", 2, 1.3, 5, 14);
		laptops[2] = new Exercise19Laptop("001", 1000, "Sony", 3, 1.3, 5, 14);
		laptops[3] = new Exercise19Laptop("001", 1000, "Sony", 4, 1.3, 5, 14);
		
		computers.setLaptops(laptops);
		
		double ex = 4000;
		double ac = computers.sumFeeLapTop();
		assertNotEquals(ex, ac, 0);
		
	}

}
