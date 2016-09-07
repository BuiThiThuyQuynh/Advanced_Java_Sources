/**
 * @author Bui Thi Thuy Quynh
 * @created 01/09/2016
 * @version 1.0
 */

package exercise130;

/**
 * @description class concrete factory in factory pattern, extends from ShapeFactory
 */
public class SquareFactory extends ShapeFactory {

	// factory method
	@Override
	public Shape getShape() {
		return new Square();
	}
}