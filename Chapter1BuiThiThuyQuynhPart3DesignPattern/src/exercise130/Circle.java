package exercise130;

/**
 * The Circle class implements the draw() method of Shape interface that
 * simply draws a circle.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class Circle implements Shape {

	/**
	 * This method is used to draw a circle, override draw() method of Shape interface.
	 * @param No.
	 * @return String This is notification that circle was drawn.
	 */
	@Override
	public String draw() {
		return "You are drawing a CIRCLE";
	}
}
