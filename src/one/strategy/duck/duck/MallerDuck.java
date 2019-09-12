package one.strategy.duck.duck;

import one.strategy.duck.behavior.FlyWithWings;
import one.strategy.duck.behavior.Squeak;

public class MallerDuck extends Duck{
	
	public MallerDuck() {
		addBehavior(new FlyWithWings());
		addBehavior(new Squeak());
	}
	
	
	@Override
	public void display() {
		System.out.println("the "+ this.getClass().getName() + " display");
	}

//public class MallerDuck extends Duck implements Flyable,Quackable{
//	@Override
//	public void quack() {
//		System.out.println("quack");
//		
//	}
//
//	@Override
//	public void fly() {
//		System.out.println("fly");
//	}
}
