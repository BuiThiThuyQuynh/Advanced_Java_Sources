/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manages the information of an infantryman
 */

package classes;

public class Exercise18Infantryman extends Exercise18Soldier {
	
	public Exercise18Infantryman(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	
	@Override
	public int fight() {
		this.power -= 2;
		return this.power;
	}
}
