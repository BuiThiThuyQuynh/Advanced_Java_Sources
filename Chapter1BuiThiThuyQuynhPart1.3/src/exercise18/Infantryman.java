/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manages the information of an infantryman extends from Exercise18Soldier class
 */

package exercise18;

public class Infantryman extends Soldier {
	
	public Infantryman(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	
	@Override
	public int fight() {
		this.power -= 2;
		return this.power;
	}
}
