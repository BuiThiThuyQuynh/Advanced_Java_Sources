/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of a boa, extends class Exercise117Animal
 * 		and implements Exercise117ISwimming, Exercise117ISheding,
 * 			 Exercise117ICave, Exercise117IWater
 */

package classes;

import abstractclasses.Exercise117Animal;
import interfaces.Exercise117ICave;
import interfaces.Exercise117IWater;
import interfaces.Exercise117Sheding;
import interfaces.Exercise117Swimming;

public class Exercise117Boa extends Exercise117Animal 
	implements Exercise117Swimming, Exercise117Sheding,
		Exercise117ICave, Exercise117IWater{

	private double lenght;
	
	public Exercise117Boa() {
		
	}
	
	public Exercise117Boa(String name, String food, double lenght) {
		
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	
	@Override
	public void swim() {
		System.out.println(this.name + " can swim");
	}
	
	@Override
	public void shed() {
		System.out.println(this.name + " molt for growth");
	}
	
	@Override
	public void burrowing() {
		System.out.println(this.name + " live in the cave");
	}
	
	@Override
	public void liveInWater() {
		System.out.println(this.name + " can live in water");
	}
	
	@Override
	public void printInfo() {
		System.out.println(this.name + " is a boa");
		swim();
		shed();
		liveInWater();
		burrowing();
	}
}
