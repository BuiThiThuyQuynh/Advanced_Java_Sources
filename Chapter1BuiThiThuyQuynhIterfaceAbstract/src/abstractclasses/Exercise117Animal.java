/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an animal
 */

package abstractclasses;

public abstract class Exercise117Animal {

	protected String name;
	protected String food;
	
	public Exercise117Animal() {
		
	}

	public Exercise117Animal(String name, String food) {
		this.name = name;
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	
	/**
	 * Function: print information of animal
	 * Input: no
	 * Output: no
	 */
	public abstract void printInfo();
}
