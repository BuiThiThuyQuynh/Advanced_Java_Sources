/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version: 2.0
 */

package exercise19;

/**
 * @description class manages the information of a type of laptop extends from Computer class
 */
public class Laptop extends Computer {
	
	private double weight;
	private int timeOfPin;
	private int sizeOfScreen;
	
	public Laptop() {
		super();
	}
	
	public Laptop(String id, double price, String manufactory, int quantity, double weight,
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
	
	/**
	 * @description function for printing the information of a type of laptop
	 * @return string for the information of laptop
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Weight: " + this.weight + "kg\n";
		result += "Time of PIN: " + this.timeOfPin + " hours\n";
		result += "Size of screen: " + this.sizeOfScreen + " inch\n";
		return result;
	}
	
}
