/**
 * 
 */
package exercise53;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * <h1>Calculate max of array using multi-thread</h1>
 * The MaxOfArrayThread program implements an application that
 * 	generates a array and finds max of this using multi-thread
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-13
 */
public class MaxOfArrayThread {
	
	/**
	 * This method is used to create and start n Thread,
	 * then finds max of array was generated.
	 * @param array This is array which was generated.
	 * @param numThreads This is number of threads want to create.
	 * @return int This is sum of array.
	 */
	public static int getMax(int[] array, int numThreads) throws InterruptedException {
		
		int len = array.length;
		List<Integer> list = new ArrayList<Integer>();
		
		// Create and start thread
		MaxThread[] thread = new MaxThread[numThreads];
		
		for (int i = 0; i < numThreads; i++) {
			thread[i] = new MaxThread((i * len) / numThreads, ((i + 1) * len / numThreads), array);
			thread[i].start();
		}
		
		// Wait for the threads to finish and find max of their results
		for (int i = 0; i < numThreads; i++) {
			thread[i].join();
			list.add(thread[i].getMax());
		}
		
		int max = list.stream().mapToInt(x -> x).summaryStatistics().getMax();
		return max;
	}

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// Enter number of array and number of threads.
			System.out.println("Enter length of array: ");
			int n = Integer.parseInt(input.readLine());
			
			while (n <= 0) {
				System.out.println("Length of array must be greater than 0");
				System.out.println("Enter length of array: ");
				n = Integer.parseInt(input.readLine());
			}
			
			System.out.println("Enter number of threads: ");
			int numThreads = Integer.parseInt(input.readLine());
			
			while (numThreads <= 0) {
				System.out.println("Number of threads must be greater than 0");
				System.out.println("Enter number of threads: ");
				numThreads = Integer.parseInt(input.readLine());
			}
			
			// Create random array.
			Random random = new Random();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = random.nextInt(100);
			}
			
			// Find sum of array
			int max = getMax(array, numThreads);
			
			// Print array on the screen
			for (int item : array)
				System.out.print(item + " ");
			
			// Print result
			System.out.println("\nMax: " + max);
		}
		catch (IOException | NumberFormatException 
				| InterruptedException e) {
			System.out.println("Exception: " + e);
		}
	}
}
