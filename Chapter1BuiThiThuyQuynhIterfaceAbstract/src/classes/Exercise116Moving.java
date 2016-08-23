/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of moving
 */

package classes;

public class Exercise116Moving {
	
	protected double distance;
	protected double time;
	protected double usedFuel;
	
	public Exercise116Moving() {
		
	}
	
	public Exercise116Moving(double distance, double time, double usedFuel) {
		this.distance = distance;
		this.time = time;
		this.usedFuel = usedFuel;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getUsedFuel() {
		return usedFuel;
	}

	public void setUsedFuel(double usedFuel) {
		this.usedFuel = usedFuel;
	}
}
