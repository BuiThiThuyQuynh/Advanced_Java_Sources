/**
 * Author: Bui Thi Thuy Quynh
 * Date: 23/08/2016
 * Version: 1.0
 * 
 * Class manages the information of a bird, extends class Exercise117Animal
 * 		and implements Exercise117IFlying, Exercise117IMolting and Exercise117INest
 */

package classes;

import abstractclasses.Exercise117Animal;
import interfaces.Exercise117IFlying;
import interfaces.Exercise117IMolting;
import interfaces.Exercise117INest;

public class Exercise117Bird extends Exercise117Animal 
	implements Exercise117IFlying, Exercise117IMolting, Exercise117INest{

	private String color;
	
	public Exercise117Bird() {
		
	}
	
	public Exercise117Bird(String name, String food, String color) {
		super(name, food);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void fly() {
		System.out.println(this.name + " can fly");
	}
	
	@Override
	public void molt() {
		System.out.println(this.name + " molt to grown");
	}
	
	@Override
	public void nesting() {
		System.out.println(this.name + " nest for habition");
	}
	
	@Override
	public void printInfo() {
		System.out.println(this.name + " is a bird");
		this.fly();
		this.molt();
		this.nesting();
	}
}
