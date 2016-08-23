/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manages the information of a trooper extends from Exercise18Soldier class
 */

package classes;

public class Exercise18Trooper extends Exercise18Soldier {
	
	public Exercise18Trooper(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	
	@Override
	public int fight() {
		this.power -= 3;
		return this.power;
	}
}
