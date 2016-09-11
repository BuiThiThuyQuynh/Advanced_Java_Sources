package exercise127;

/**
 * The Circle class implements the draw() method of Shape interface that
 * simply draws a circle and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-05
 */
public class Circle implements Shape {

	/**
	 * This method is used to draw a circle, override draw() method of Shape interface.
	 * @param args Unused.
	 * @return Nothing.
	 */
	@Override
	public void draw() {
		System.out.print("Circle with");
	}
}
