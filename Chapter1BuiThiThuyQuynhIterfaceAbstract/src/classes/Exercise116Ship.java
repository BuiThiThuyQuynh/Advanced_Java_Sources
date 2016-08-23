/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of a ship, extends class Exercise116Transport
 * 		and implements Exercise116IMoving
 */

package classes;

import java.text.DecimalFormat;

import interfaces.Exercise116IMoving;
import interfaces.Exercise116IUsingFuel;

public class Exercise116Ship extends Exercise116Transport 
	implements Exercise116IMoving, Exercise116IUsingFuel {

	private double weight;
	private int capacity;
	private int speedStraight;
	private int speedReverse;
	private double fuelForStartup;
	private String typeOfFuel;
	
	public Exercise116Ship() {
		
	}
	
	public Exercise116Ship(double distance, double time, double usedFuel,
			String numberID, String owner, String color, String manufactory,
			double weight, int capacity, int speedStraight, int speedReverse,
			double fuelForStartup, String typeOfFuel) {
		super(distance, time, usedFuel, numberID, owner, color, manufactory);
		this.weight = weight;
		this.capacity = capacity;
		this.speedStraight = speedStraight;
		this.speedReverse = speedReverse;
		this.fuelForStartup = fuelForStartup;
		this.typeOfFuel = typeOfFuel;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSpeedStraight() {
		return speedStraight;
	}

	public void setSpeedStraight(int speedStraight) {
		this.speedStraight = speedStraight;
	}

	public int getSpeedReverse() {
		return speedReverse;
	}

	public void setSpeedReverse(int speedReverse) {
		this.speedReverse = speedReverse;
	}

	public double getFuelForStartup() {
		return fuelForStartup;
	}

	public void setFuelForStartup(double fuelForStartup) {
		this.fuelForStartup = fuelForStartup;
	}

	public String getTypeOfFuel() {
		return typeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel) {
		this.typeOfFuel = typeOfFuel;
	}
	
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#,###.000");
		String result = super.toString();
		result += "Weight: " + this.weight + "\n";
		result += "Capacity: " + this.capacity + "\n";
		result += "Speed straight with water: " + this.speedStraight + "\n";
		result += "Speed reverse with water: " + this.speedReverse + "\n";
		result += "Fuel used for startup: " + this.fuelForStartup + "\n";
		result += "Type of fuel: " + this.typeOfFuel + "\n";
		result += "Speed: " + format.format(this.calSpeed()) + "\n";
		result += "Fuel used: " + format.format(this.calFuelUsed()) + "\n";
		return result;
	}
	
	@Override
	public double calSpeed() {
		if (this.time == 0)
			return 0;
		double result = this.distance / this.time + this.speedStraight - this.speedReverse;
		return result;
	}
	
	@Override
	public double calFuelUsed() {
		if ((this.usedFuel - this.fuelForStartup) == 0)
			return 0;
		double result = this.distance / (this.usedFuel - this.fuelForStartup);
		return result;
	}
	
}
