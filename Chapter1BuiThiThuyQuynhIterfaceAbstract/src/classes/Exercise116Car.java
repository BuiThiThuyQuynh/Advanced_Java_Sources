/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of a car, extends class Exercise116Transport
 * 		and implements Exercise116IMoving
 */

package classes;

import java.text.DecimalFormat;

import interfaces.Exercise116IMoving;
import interfaces.Exercise116IUsingFuel;

public class Exercise116Car extends Exercise116Transport 
		implements Exercise116IMoving, Exercise116IUsingFuel {
	
	private String gear;
	private String model;
	
	public Exercise116Car() {
		
	}
	
	public Exercise116Car(double distance, double time, double usedFuel,
			String numberID, String owner, String color, String manufactory,
			String gear, String model) {
		super(distance, time, usedFuel, numberID, owner, color, manufactory);
		this.gear = gear;
		this.model = model;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###.000");
		String result = super.toString();
		result += "Gear: " + this.gear + "\n";
		result += "Model: " + this.model + "\n";
		result += "Speed: " + format.format(this.calSpeed()) + "\n";
		result += "Fuel used: " + format.format(this.calFuelUsed()) + "\n";
		return result;
	}
	
	@Override
	public double calSpeed() {
		if (this.time == 0)
			return 0;
		return this.distance / this.time;
	}
	
	@Override
	public double calFuelUsed() {
		if (this.usedFuel == 0)
			return 0;
		return this.distance / this.usedFuel;
	}
}
