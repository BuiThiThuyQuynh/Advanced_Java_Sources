/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Abstract class manages the information of an instrument
 */

package abstractclasses;

public abstract class Exercise115Instrument {

	protected String name;
	protected String manufactory;
	
	public Exercise115Instrument() {
		
	}
	
	public Exercise115Instrument(String name, String manufactory) {
		this.name = name;
		this.manufactory = manufactory;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getManufactory() {
		return manufactory;
	}
	
	public void setManufactory(String manufactory) {
		this.manufactory = manufactory;
	}
	
	/**
	 * Function: how to play an instrument
	 * Input: no
	 * Output: string about how to play an instrument
	 */
	public abstract String play();
	
	@Override
	public String toString() {
		return "HOW TO PLAY: \n" + this.play();
	}
}
