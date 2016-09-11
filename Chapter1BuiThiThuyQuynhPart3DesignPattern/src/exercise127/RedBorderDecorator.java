package exercise127;

/**
 * The RedBorderDecorator class extends from ShapeDecorator class that
 * simply decorates a shape with red border and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-05
 */
public class RedBorderDecorator extends ShapeDecorator {

	/**
	 * This method is used to decorate a shape with red border, override draw() method of ShapeDecorator class.
	 * @param No.
	 * @return Nothing.
	 */
	@Override
	public void draw() {
		super.draw();
		setBorder();
	}
	
	/**
	 * This method is used to set red border for a shape.
	 * @param No.
	 * @return Nothing.
	 */
	public void setBorder() {
		System.out.println(" red border");
	}
}
