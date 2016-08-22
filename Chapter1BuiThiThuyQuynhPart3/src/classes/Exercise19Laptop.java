/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manages the information of a type of a type of laptop
 */

package classes;

public class Exercise19Laptop extends Exercise19Computer {
	
	private double weight;
	private int timeOfPin;
	private int sizeOfScreen;
	
	public Exercise19Laptop() {
		super();
	}
	
	public Exercise19Laptop(String id, double price, String manufactory, int quantity, double weight,
			int timeOfPin, int sizeOfScreen) {
		super(id, price, manufactory, quantity);
		this.weight = weight;
		this.timeOfPin = timeOfPin;
		this.sizeOfScreen =sizeOfScreen;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getTimeOfPin() {
		return timeOfPin;
	}

	public void setTimeOfPin(int timeOfPin) {
		this.timeOfPin = timeOfPin;
	}

	public int getSizeOfScreen() {
		return sizeOfScreen;
	}

	public void setSizeOfScreen(int sizeOfScreen) {
		this.sizeOfScreen = sizeOfScreen;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "Weight: " + this.weight + "kg\n";
		result += "Time of PIN: " + this.timeOfPin + " hours\n";
		result += "Size of screen: " + this.sizeOfScreen + " inch\n";
		return result;
	}
	
}
