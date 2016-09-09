package exercise31;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bui Thi Thuy Quynh
 * @date 09/09/2016
 * @version 1.0
 * 
 * @description Class print array use lambda expression
 */
public class PrintArray {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6 ,7);
		
		// Browse the array
		list.forEach(i -> System.out.println(i));
	}

}
