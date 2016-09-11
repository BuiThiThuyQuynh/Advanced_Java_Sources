package exercise129;

/**
 * The Student class implements an application that
 * simply gets shared documents of teacher and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class Student {

	/**
	 * This is the main method which makes use of shareDocument() method of Teacher class.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		
		Teacher teacher = Teacher.getInstance();
		
		// Display the shared document
		System.out.println(teacher.shareDocument());

	}

}
