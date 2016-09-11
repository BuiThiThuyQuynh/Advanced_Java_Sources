package exercise130;

/**
 * The SquareFactory class implements the getShape() method of ShapeFactory class that
 * simply created a square.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class SquareFactory extends ShapeFactory {

	/**
	 * This method is used to create a square, override getShape() method of ShapeFactory class.
	 * @param No.
	 * @return Shape This is square which was created.
	 */
	@Override
	public Shape getShape() {
		return new Square();
	}
}
