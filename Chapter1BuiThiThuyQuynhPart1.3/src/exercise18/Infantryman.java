/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise18;

/**
* @description class manages the information of an infantryman extends from Soldier class
 */
public class Infantryman extends Soldier {
	
	public Infantryman(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	
	/**
	 * @description function update power of infantryman after fight
	 * @return power of infantryman will decrease 2 after fight
	 */
	@Override
	public int fight() {
		this.power -= 2;
		return this.power;
	}
}
