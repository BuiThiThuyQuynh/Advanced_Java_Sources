package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Bui Thi Thuy Quynh
 * @since 2016-09-19
 * @version 1.0
 * 
 * This is class using lambda expression to sort list string.
 */
public class LambdaHandling {

	static List<String> list;
	
	/**
	 * This method is used to set default value for list string.
	 * @param No.
	 * @return Nothing.
	 */
	public static void setDefaultList() {
		list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Grape");
		list.add("Watermelon");
		list.add("Melon");
		list.add("Lemon");
		list.add("Pomegranates");
		list.add("Grapefruit");
		list.add("Kiwi");
		list.add("Pear");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Strawberry");
		list.add("Durian");
		list.add("Mangosteen");
	}
	
	/**
	 * This method is used to sort list string by increasing length of string.
	 * @param No.
	 * @return Nothing.
	 */
	public static void sortIncreasingLength() {
		// Sort from short to long length
		System.out.println("========= SORT LIST FROM SHORT LENGTH TO LONG LENGTH ============");
		Collections.sort(list, (s1, s2) -> new Integer(s1.length()).compareTo(new Integer(s2.length())));
		list.stream().forEach(System.out::println);
	}
	
	/**
	 * This method is used to sort list string by decreasing length of string.
	 * @param No.
	 * @return Nothing.
	 */
	public static void sortDecreasingLength() {
		// Sort from short to long length
		System.out.println("========= SORT LIST FROM LONG LENGTH TO SHORT LENGTH ============");
		Collections.sort(list, (s1, s2) -> new Integer(s2.length()).compareTo(new Integer(s1.length())));
		list.stream().forEach(System.out::println);
	}
	
	/**
	 * This method is used to sort list string by alphabet.
	 * @param No.
	 * @return Nothing.
	 */
	public static void sortAlphabet() {
		// Sort list by Alphabet.
		System.out.println("========= SORT LIST BY ALPHABET ============");
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		list.stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		setDefaultList();
		sortIncreasingLength();
		sortDecreasingLength();
		sortAlphabet();	
	}
}
