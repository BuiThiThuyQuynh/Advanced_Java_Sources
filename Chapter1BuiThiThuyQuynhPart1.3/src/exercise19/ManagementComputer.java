/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise19;

/**
 * @description class manages the computers included laptops and desktops
 */
public class ManagementComputer {
	
	public ManagementComputer() {
		
	}

	/**
	 * @description calculation fee of array computers
	 * @return totals amount of computers in array
	 */
	public double sumFee(Computer[] computers) {
		double result = 0;
		for (int i = 0; i < computers.length; i++)
			result += computers[i].calFee();
		return result;
	}
	
	/**
	 * @description function for printing the information of array computers
	 * @return string for the information of array computers
	 */
	public String printInformation(Computer[] computers) {
		String result = "";
		for (int i = 0; i < computers.length; i++) {
			result += computers[i].toString();
			result += "------------------------\n";
		}
		
		return result;
	}
}
