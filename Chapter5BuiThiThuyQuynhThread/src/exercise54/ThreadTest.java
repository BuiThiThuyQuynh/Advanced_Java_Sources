package exercise54;

/**
 * <h1>Increasing share variable using multi-thread</h1>
 * The ThreadTest program implements an application that
 * 	increases share variables using 10 threads.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-13
 */
public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		int counter = 0;
		
		// Create 10 threads and start all them using synchronized.
		ThreadCounter[] thread = new ThreadCounter[10];
		for (int i = 0; i < 10; i++) {
			synchronized (thread) {
				thread[i] = new ThreadCounter(String.valueOf(i));
				thread[i].start();
			}
		}
		
		// Wait for the threads to finish and sum of their results.
		for (int i = 0; i < 10; i++) {
			thread[i].join();
			counter += thread[i].getCounter();
		}
		
		// Print result on the screen.
		System.out.println("================================");
		System.out.println("Result: " + counter);
	}

}
