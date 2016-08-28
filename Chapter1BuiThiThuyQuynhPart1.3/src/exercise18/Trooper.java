/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */

package exercise18;

/**
*  @description class manages the information of a trooper extends from Soldier class
*/
public class Trooper extends Soldier {
	
	public Trooper(String name, int power, String weapon) {
		super(name, power, weapon);
	}
	
	/**
	 * @description function update power of trooper after fight
	 * @return power of trooper will decrease 3 after fight
	 */
	@Override
	public int fight() {
		this.power -= 3;
		return this.power;
	}
}
