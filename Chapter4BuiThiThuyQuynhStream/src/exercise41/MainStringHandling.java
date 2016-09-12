package exercise41;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <h1>Work with list String using stream</h1>
 * The MainStringHandling program implements an application that
 * 	handles String using stream.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-12
 */
public class MainStringHandling {

	public static void main(String[] args) {
		
		// Creating, initialization list String and add default value for it.
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Grape");
		list1.add("Watermelon");
		list1.add("Melon");
		list1.add("Lemon");
		list1.add("");
		list1.add("Grapefruit");
		list1.add("Kiwi");
		list1.add("Pear");
		list1.add("Pineapple");
		list1.add("Mango");
		list1.add("");
		list1.add("Durian");
		list1.add("Mangosteen");
		
		// Print list string on the screen.
		System.out.println("====== LIST STRING ========");
		list1.stream().forEach(System.out::println);
		
		/*
		 * Count empty element of list 1 and print on the screen.
		 */
		int countEmpty = (int) list1.stream().filter(s -> s.isEmpty()).count();
		System.out.println("===================");
		System.out.println("Number of empty element: " + countEmpty);
		
		/*
		 * Count elements of list 1 which have length >= 5
		 * and print on the screen.
		 */
		int countLenghtGreater = (int) list1.stream()
											.filter(s -> s.length() >= 5)
											.count();
		System.out.println("===================");
		System.out.println("Number of elements have length "
				+ "greater than or equal to 5: " + countLenghtGreater);
		
		/*
		 * Count element in list 1 which have start 'P' and print on the screen.
		 */
		int countStartA = (int) list1.stream().filter(s -> s.startsWith("P")).count();
		System.out.println("===================");
		System.out.println("Number of elements start with 'P': " + countStartA);
		
		/*
		 * Count elements in list 1 which have value equals to "Apple"
		 */
		int countApple = (int) list1.stream().filter(s -> s.equals("Apple")).count();
		System.out.println("===================");
		System.out.println("Number of elements have "
				+ "value equals to 'Apple': " + countApple);
		
		/*
		 * Create list 2 with elements not empty of list 1
		 * and print on the screen 
		 */
		List<String> list2 = list1.stream()
								  .filter(s -> !s.isEmpty())
								  .collect(Collectors.toList());
		System.out.println("====== List 2 ===========");
		list2.forEach(System.out::println);
		
		/*
		 * Create list 3 with elements have length from 3 to 6 of list 1 
		 * Then, join list 3 with separate is commas and print on the screen
		 */
		List<String> list3 = list1.stream()
								  .filter(s -> s.length() >= 3 && s.length() <= 6)
								  .collect(Collectors.toList());
		String list3Joined = list3.stream().collect(Collectors.joining(", "));
		System.out.println("======= List 3 ==========");
		System.out.println(list3Joined);
		
		/*
		 * Create list 4 with element value is element of list 1 join with " Apple"
		 * and print on the screen.
		 */
		List<String> list4 = list1.stream().map(s -> s.concat(" Apple"))
										   .collect(Collectors.toList());
		System.out.println("======= List 4 ==========");
		list4.forEach(System.out::println);
	}

}
