/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an stringed instrument, realization abstract class Exercise115Instrument
 */

package classes;

import abstractclasses.Exercise115Instrument;

public class Exercise115StringedInstrument extends Exercise115Instrument {

	private int numberString;
	
	public Exercise115StringedInstrument() {
		
	}
	
	public Exercise115StringedInstrument(String name, String manufactory, int numberString) {
		super(name, manufactory);
		this.numberString = numberString;
	}

	public int getNumberString() {
		return numberString;
	}

	public void setNumberString(int numberString) {
		this.numberString = numberString;
	}
	
	@Override
	public String play() {
		String result = "Name of instrument: " + this.name + "\n";
		result += "Number string: " + this.numberString + "\n";
		return result;
	}
}
