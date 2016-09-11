package exercise130;

/**
 * The CircleFactory class implements the getShape() method of ShapeFactory class that
 * simply created a circle.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class CircleFactory extends ShapeFactory {

	/**
	 * This method is used to create a circle, override getShape() method of ShapeFactory class.
	 * @param No.
	 * @return Shape This is circle which was created.
	 */
	@Override
	public Shape getShape() {
		return new Circle();
	}
}
