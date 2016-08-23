/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * JUnit Test for averageScore() method of Exercise110Student class
 * Input: no
 * Output: average score of student
 */

package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import classes.Exercise110Student;

public class Exercise110AverageScoreJUnitTest {
	
	Exercise110Student student;

	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore1() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 7);
		double ex = 7;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore2() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 1, 7);
		double ex = 4;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore3() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 2.3, 7);
		double ex = 4.65;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore4() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 10);
		double ex = 8.5;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore5() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 0, 7);
		double ex = 3.5;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore6() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 7);
		double ex = 14;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore7() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 0);
		double ex = 7;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore8() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 0, 0);
		double ex = 2;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore9() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 4);
		double ex = 5;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore10() {
		student = new Exercise110Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 5);
		double ex = 4;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}

}
