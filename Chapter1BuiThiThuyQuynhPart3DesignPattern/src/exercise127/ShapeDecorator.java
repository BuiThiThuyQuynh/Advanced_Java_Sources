package exercise127;

/**
 * The ShapeDecorator class implements the draw() method of Shape interface that
 * simply decorates for shape which was drawn and prints the output on the screen.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-05
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape shape;
	
	public ShapeDecorator() {
		
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	/**
	 * This method is used to decorate a shape, override draw() method of Shape interface.
	 * @param No.
	 * @return Nothing.
	 */
	@Override
	public void draw() {
		if (shape != null)
			shape.draw();
	}
}
