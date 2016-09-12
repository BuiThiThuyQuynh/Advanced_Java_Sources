package exercise42;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * <h1>Work with list number using stream</h1>
 * The MainNumberHandling program implements an application that
 * 	handles number using stream.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-12
 */
public class MainNumberHandling {
	
	/**
	 * This method is used to check number is prime or not.
	 * @param x This is number need checking.
	 * @return boolean This is checking result.
	 */
	public static boolean isPrime(int x) {
		if (x < 2)
			return false;
		for (int i = 2; i < x; i ++) {
			if (x % i == 0)
				return false;
		}
		
		return true;
	}
	
	/**
	 * This method is used to check number is square number or not.
	 * @param x This is number need checking.
	 * @return boolean This is checking result.
	 */
	public static boolean isSquareNumber(int x) {
		if (x < 1)
			return false;
		for (int i = 1; i <= x; i++) {
			if (i * i == x)
				return true;
		}
		return false;
	}

	/**
	 * This is the main method which handles number using stream (show list, filter)
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		
		// Creating and initialization a list number random.
		Random random = new Random();
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		list1.add(random.nextInt(20));
		
		// Print list student on the screen
		System.out.println("======== List 1 ==========");
		list1.stream().forEach(System.out::println);
		
		/*
		 * Create list 2 from list1 with elements is square value of list 1
		 * and print on the screen
		 */
		List<Integer> list2 = list1.stream().map(i -> i * i)
								   .collect(Collectors.toList());
		System.out.println("======== List 2 ==========");
		list2.stream().forEach(System.out::println);
		
		/* Statistic list 2: max value in list, min value in list,
		 * sum value of list and average value of list.
		 * Then, result was printed on the screen
		 */
		IntSummaryStatistics statsList2 = list2.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Max value of list 2: " + statsList2.getMax());
		System.out.println("Min value of list 2: " + statsList2.getMin());
		System.out.println("Sum value of list 2: " + statsList2.getSum());
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("Average value of list 2: " + df.format(statsList2.getAverage()));
		
		/*
		 *  Create list 3 with prime values of list 1
		 *  and print on the screen
		 */
		List<Integer> list3 = list1.stream().filter(x -> isPrime(x)).collect(Collectors.toList());
		System.out.println("======== List 3 ==========");
		list3.stream().forEach(System.out::println);
		
		/*
		 *  Create list 3 with square number values of list 1
		 *  and print on the screen
		 */
		List<Integer> list4 = list1.stream().filter(x -> isSquareNumber(x)).collect(Collectors.toList());
		System.out.println("======== List 4 ==========");
		list4.stream().forEach(System.out::println);
	}
}
