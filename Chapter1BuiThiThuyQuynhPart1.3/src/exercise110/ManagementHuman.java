/**
 * @author Bui Thi Thuy Quynh
 * @date 28/08/2016
 * @version 1.0
 */
	
package exercise110;

/**
 * @description class manages the human
 */
public class ManagementHuman {

	/**
	 * @description function for printing the information of array human
	 * @return string for the information of array human
	 */
	public String printArray(Human[] human) {
		String result = "===============================\n";
		for (int i = 0; i < human.length; i++) {
			result += human[i].toString();
			result += "------------------------\n";
		}
		
		return result;
	}
}
