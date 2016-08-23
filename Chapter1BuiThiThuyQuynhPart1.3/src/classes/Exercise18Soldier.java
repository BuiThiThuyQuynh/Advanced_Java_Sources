/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manages the information of a soldier
 */

package classes;

public class Exercise18Soldier {

	protected String name;
	protected int power;
	protected String weapon;
	
	public Exercise18Soldier() {
		
	}
	
	public Exercise18Soldier(String name, int power, String weapon) {
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
	 * Function: decreasing power of a soldier
	 * Input: no
	 * Output: no
	 */
	public int fight() {
		this.power -= 1;
		return this.power;
	}
	
	@Override
	public String toString() {
		return this.name +": " + this.power;
	}
}
