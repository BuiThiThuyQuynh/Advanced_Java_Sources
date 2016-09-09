package exercise32;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bui Thi Thuy Quynh
 * @date 09/09/2016
 * @version 1.0
 * 
 * @description Class calculate total amount use lambda expression
 */
public class TotalAmount {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[]{2, 3, 4, 5});
		int price = 5200;
		
		// Browse the array
		list.forEach(element -> System.out.println("Total amount: " 
				+ price * element));
	}

}
