/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of a tiger, extends class Exercise117Animal
 * 		and implements Exercise117IRunning, Exercise117IGrowthNormal
 * 			 and Exercise117ICave
 */

package classes;

import abstractclasses.Exercise117Animal;
import interfaces.Exercise117ICave;
import interfaces.Exercise117IGrowthNormal;
import interfaces.Exercise117IRunning;

public class Exercise117Tiger extends Exercise117Animal
	implements Exercise117IRunning, Exercise117IGrowthNormal, Exercise117ICave{

	private String typeStrip;
	
	public Exercise117Tiger() {
		
	}
	
	public Exercise117Tiger(String name, String food, String typeStrip) {
		super(name, food);
		this.typeStrip = typeStrip;
	}

	public String getTypeStrip() {
		return typeStrip;
	}

	public void setTypeStrip(String typeStrip) {
		this.typeStrip = typeStrip;
	}
	
	@Override
	public void run() {
		System.out.println(this.name + " can run");
	}
	
	@Override
	public void growthNormal() {
		System.out.println(this.name + " growth normal, not shed, not molt");
	}
	
	@Override
	public void burrowing() {
		System.out.println(this.name + " live in the cave");
	}
	
	@Override
	public void printInfo() {
		System.out.println(this.name + " is a tiger");
		run();
		growthNormal();
		burrowing();
	}
}
