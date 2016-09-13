package exercise54;

/**
 * The ThreadCounter class shares counter variable 
 * and for multi-thread increasing this variable
 *  using multi-thread.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-13
 */
public class ThreadCounter extends Thread {
	
	private int counter = 0;
	private String threadName;
	
	public ThreadCounter(String threadName) {
		this.threadName = threadName;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	@Override
	public synchronized void run() {
		try {
			// Increasing counter variable 10 times after sleep 1000 millisecond.			
			System.out.println("======= Thread " + threadName + "============");
			for (int i = 0; i < 10; i++) {
				System.out.println("Counter: " + counter);
				counter++;
			}
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
