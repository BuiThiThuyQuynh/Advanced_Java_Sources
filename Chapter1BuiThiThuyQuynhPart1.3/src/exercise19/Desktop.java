/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manages the information of a type of desktop extends from exercise19Computer class
 */

package exercise19;

public class Desktop extends Computer {

	private String cpu;
	private int ram;
	
	public Desktop() {
		super();
	}
	
	public Desktop(String id, double price, String manufactory, int quantity, String cpu,
			int ram) {
		super(id, price, manufactory, quantity);
		this.cpu = cpu;
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "CPU: " + this.cpu + "\n";
		result += "RAM: " + this.ram + "GB\n";
		return result;
	}
}
