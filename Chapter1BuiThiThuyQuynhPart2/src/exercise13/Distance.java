/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages two points in the plane
 */

package exercise13;

public class Distance {
	
	private Point pointA;
	private Point pointB;
	
	public Distance() {
		
	}

	public Distance(Point pointA, Point pointB) {
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	/**
	 * Function: calculating the distance between 2 points
	 * Input: no
	 * Output: the distance between 2 points
	 */
	public double calDistance() {
		double result = Math.sqrt((pointA.getX() - pointB.getX()) * (pointA.getX() - pointB.getX())
				+ (pointA.getY() - pointB.getY()) * (pointA.getY() - pointB.getY()));
		return result;
	}
}
