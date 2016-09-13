package exercise51;

/**
 * The ThreadDemo class create a thread.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-13
 */
public class ThreadDemo extends Thread {

	private Thread t;
	private String threadName;
	
	public ThreadDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating " + threadName);
	}
	
	@Override
	public void run() {
		System.out.println("Running " + threadName);
		
		try {
			for (int i = 3; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				
				// Let the thread sleep for a while
				Thread.sleep(1000);
			}
			
			System.out.println("Thread " + threadName + " exiting.");
		} 
		catch (InterruptedException e) {
			System.out.println("Exception: " + e);
		}
	}
	
	@Override
	public void start() {
		
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
}
