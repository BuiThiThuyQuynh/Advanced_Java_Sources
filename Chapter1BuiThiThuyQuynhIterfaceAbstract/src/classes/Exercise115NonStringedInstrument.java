/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of a non stringed instrument, realization abstract class Exercise115Instrument
 */

package classes;

import abstractclasses.Exercise115Instrument;

public class Exercise115NonStringedInstrument extends Exercise115Instrument{

	private String usage;
	
	public Exercise115NonStringedInstrument() {
		
	}
	
	public Exercise115NonStringedInstrument(String name, String manufactory, String usage) {
		super(name, manufactory);
		this.usage = usage;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	@Override
	public String play() {
		return "Usage: " + this.usage;
	}
}
