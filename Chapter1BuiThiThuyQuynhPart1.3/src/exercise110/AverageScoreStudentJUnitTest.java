/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise110;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

/**
 * @description JUnit Test for averageScore() method of Student class
 * @return average score of student
 */
public class AverageScoreStudentJUnitTest {
	
	Student student;

	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore1() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 7);
		
		double ex = 7;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore2() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 1, 7);
		
		double ex = 4;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore3() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 2.3, 7);
		
		double ex = 4.65;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore4() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 10);
		
		double ex = 8.5;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore5() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 0, 7);
		
		double ex = 3.5;
		double ac = student.averageScores();
		assertEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore6() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 7);
		
		double ex = 14;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore7() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 0);
		
		double ex = 7;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore8() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 0, 0);
		
		double ex = 2;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore9() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 4);
		
		double ex = 5;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAverageScore10() {
		/**
		 * @param0 name of student
		 * @param1 date of birth
		 * @param2 address of student
		 * @param3 class of student
		 * @param4 score of semester 1
		 * @param5 score of student 2
		 */
		student = new Student("Bui Quynh", new Date("01/01/1997"), "District 9, HCMC", "01234567890", 
				"P01", 7, 5);
		
		double ex = 4;
		double ac = student.averageScores();
		assertNotEquals(ex, ac, 0.001);
	}

}
