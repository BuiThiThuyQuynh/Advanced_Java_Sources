/**
 * @author: Bui Thi Thuy Quynh
 * @date: 22/08/2016
 * @version: 2.0
 */

package exercise18;

/**
* @description class manages the information of a soldier
 */
public class Soldier {

	protected String name;
	protected int power;
	protected String weapon;
	
	public Soldier() {
		
	}
	
	public Soldier(String name, int power, String weapon) {
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	/**
	 * @description function for decreasing power of a soldier after fight
	 * @return power of soldier will decrease 1 after fight
	 */
	public int fight() {
		this.power -= 1;
		return this.power;
	}
	
	/**
	 * @description function for check power of a soldier after fight
	 * @return power of soldier is out of or not
	 */
	public boolean checkPower() {
		return this.power > 0;
	}
	
	/**
	 * @description function for printing information of soldier
	 * @return string about information of soldier
	 */
	@Override
	public String toString() {
		return checkPower() ? this.name + ": " + this.power : this.name  + " is out of power";
	}
}
