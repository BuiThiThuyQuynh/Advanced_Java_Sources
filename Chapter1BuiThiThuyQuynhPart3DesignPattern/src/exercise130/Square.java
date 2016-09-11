package exercise130;

/**
 * The Square class implements the draw() method of Shape interface that
 * simply draws a square.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class Square implements Shape {

	/**
	 * This method is used to draw a square, override draw() method of Shape interface.
	 * @param No.
	 * @return String This is notification that square was drawn.
	 */
	@Override
	public String draw() {
		return "You are drawing a SQUARE";
	}
}
