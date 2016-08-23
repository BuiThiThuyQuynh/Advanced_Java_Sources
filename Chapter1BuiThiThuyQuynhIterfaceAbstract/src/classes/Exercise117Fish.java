/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of a fish, extends class Exercise117Animal
 * 		and implements Exercise117ISwimming, Exercise117IGrowthNormal
 * 			 and Exercise117IWater
 */

package classes;

import abstractclasses.Exercise117Animal;
import interfaces.Exercise117IGrowthNormal;
import interfaces.Exercise117IWater;
import interfaces.Exercise117Swimming;

public class Exercise117Fish extends Exercise117Animal
	implements Exercise117Swimming, Exercise117IGrowthNormal, Exercise117IWater {

	private String skinType;
	
	public Exercise117Fish() {
		
	}
	
	public Exercise117Fish(String name, String food, String skinType) {
		super(name, food);
		this.skinType = skinType;
	}

	public String getSkinType() {
		return skinType;
	}

	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}
	
	@Override
	public void swim() {
		System.out.println(this.name + " can swim");
	}
	
	@Override
	public void growthNormal() {
		System.out.println(this.name + " growth normal, not shed, not molt");
	}
	
	@Override
	public void liveInWater() {
		System.out.println(this.name + " live in water");
	}
	
	@Override
	public void printInfo() {
		System.out.println(this.name + " is a fish");
		swim();
		growthNormal();
		liveInWater();
	}
}
