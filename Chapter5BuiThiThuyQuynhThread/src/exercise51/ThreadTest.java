package exercise51;

/**
 * <h1>Work with thread</h1>
 * The ThreadTest program implements an application that
 * 	creates 3 thread and lets run simultaneously
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-12
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo("Google");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("Yahoo");
		t2.start();
		
		ThreadDemo t3 = new ThreadDemo("Facebook");
		t3.start();
	}
}
