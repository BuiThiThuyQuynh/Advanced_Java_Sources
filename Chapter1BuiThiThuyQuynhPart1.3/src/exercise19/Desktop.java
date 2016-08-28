/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise19;

/**
 * @description class manages the information of a type of desktop extends from Computer class
 */
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
	
	/**
	 * @description function for printing the information of a type of desktop
	 * @return string for information of a type of desktop
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "CPU: " + this.cpu + "\n";
		result += "RAM: " + this.ram + "GB\n";
		return result;
	}
}
