/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an transport, extends class Exercise116Moving
 */

package classes;

public class Exercise116Transport extends Exercise116Moving {

	protected String numberID;
	protected String owner;
	protected String color;
	protected String manufactory;
	
	public Exercise116Transport() {
		
	}
	
	public Exercise116Transport(double distance, double time, double usedFuel,
			String numberID, String owner, String color, String manufactory) {
		super(distance, time, usedFuel);
		this.numberID = numberID;
		this.owner = owner;
		this.color = color;
		this.manufactory = manufactory;
	}
	
	@Override
	public String toString() {
		String result = "Number ID: " + this.numberID + "\n";
		result += "Owner: " + this.owner + "\n";
		result += "Color: " + this.color + "\n";
		result += "Manufactory: " + this.manufactory + "\n";
		return result;
	}
}
