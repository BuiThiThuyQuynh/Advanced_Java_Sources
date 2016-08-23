/**
 * Author: Bui Thi Thuy Quynh
 * Date: 19/08/2016
 * Version: 1.0
 * 
 * Class manages two points in the plane
 */

package classes;

public class Exercise13Distance {
	
	private Exercise13Point pointA;
	private Exercise13Point pointB;
	
	public Exercise13Distance() {
		
	}

	public Exercise13Distance(Exercise13Point pointA, Exercise13Point pointB) {
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public Exercise13Point getPointA() {
		return pointA;
	}

	public void setPointA(Exercise13Point pointA) {
		this.pointA = pointA;
	}

	public Exercise13Point getPointB() {
		return pointB;
	}

	public void setPointB(Exercise13Point pointB) {
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
