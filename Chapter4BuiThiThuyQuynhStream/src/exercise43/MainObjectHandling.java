package exercise43;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * <h1>Working with list student using stream</h1>
 * The MainObjectHandling program implements an application that
 * 	handles object using stream.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-12
 */
public class MainObjectHandling {
	
	/**
	 * This is the main method which handles object using stream (show list, filter)
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// Creating, initialization list student and add default value for it.
		List<Student> list1 = new ArrayList<Student>();
		
		list1.add(new Student("Quynh", "Bui", 22, 6, 7));
		list1.add(new Student("Kiet", "Le", 22, 6, 7));
		list1.add(new Student("Thao", "Truong", 22, 8, 7));
		list1.add(new Student("Thanh", "Le", 22, 8, 9));
		list1.add(new Student("Phi", "Le", 22, 10, 8.9));
		list1.add(new Student("Tuan", "Nguyen", 22, 3, 7));
		list1.add(new Student("Tien", "Nguyen", 22, 9, 5));
		list1.add(new Student("Anh", "Bui", 22, 9, 9));
		list1.add(new Student("Xuan", "Trinh", 22, 8.5, 9.4));
		list1.add(new Student("Hien", "Ho", 22, 6.3, 7.4));
		
		// Print list student on the screen
		System.out.println("====== List of students ===========");
		System.out.println("First name\tLast name\tAge\tMark 1\tMark 2\tAverage");
		list1.stream().forEach(System.out::println);
		
		/*
		 *  Count number of students have age greater than 
		 *  or equal to 18 and print on the screen
		 */
		int countAge = (int) list1.stream().filter(student -> student.getAge() >= 18).count();
		System.out.println("Number of student have old >= 18: " + countAge);
		
		/*
		 * Count number of student have first name start 'H' 
		 * and print on the screen
		 */
		int countName = (int) list1.stream()
				   .filter(student -> student.getFirstName().startsWith("H")).count();
		System.out.println("Number of student have first name start 'H': " + countName);
		
		/*
		 *  Get first student have first name start 'H' 
		 *  and print on the screen
		 */
		Optional<Student> firstStudent = list1.stream()
				   .filter(student -> student.getFirstName().startsWith("H")).findFirst();
		
		System.out.println("====== First student have first name start with 'H' ===========");
		System.out.println("First name\tLast name\tAge\tMark 1\tMark 2\tAverage");
		System.out.println(firstStudent.get().toString());
		
		/*
		 *  Statistic in list student: Highest average mark, lowest average mark,
		 *  sum of all average mark and average of all average marks. 
		 *  Then, result was printed on the screen
		 */
		DoubleSummaryStatistics stats = list1.stream()
											 .mapToDouble(student -> student.calAverage())
											 .summaryStatistics();
		
		System.out.println("Highest average mark in list: " + stats.getMax());
		System.out.println("Lowest average mark in list: " + stats.getMin());
		System.out.println("Sum of all average mark: " + stats.getSum());
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println("Average of all average marks: " + df.format(stats.getAverage()));
		
		
		/*
		 *  Get list very good student have average mark >= 8 
		 *  and print on the screen
		 */
		List<Student> list3 = list1.stream()
								   .filter(student -> student.calAverage() >= 8)
								   .collect(Collectors.toList());
		System.out.println("====== List of very good students ===========");
		System.out.println("First name\tLast name\tAge\tMark 1\tMark 2\tAverage");
		list3.stream().forEach(System.out::println);
		
	}

}
