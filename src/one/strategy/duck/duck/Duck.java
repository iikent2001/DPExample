package one.strategy.duck.duck;

import java.util.HashMap;
import java.util.Map;

import one.strategy.duck.behavior.AnimalBehavior;

public abstract class Duck {
	
	protected Map<String,AnimalBehavior> behaviors;
	
	public Duck() {
		this.behaviors = new HashMap<String,AnimalBehavior>();
	}
	
	public void addBehavior (AnimalBehavior behavior) {
		behaviors.put(behavior.getClass().getInterfaces()[0].getSimpleName(), behavior);
	}
	
	public AnimalBehavior getBehavior (String behavior) {
		return behaviors.get(behavior);
	}
	
	public abstract void display();
	
//	protected FlyBehavior flyBefavior;
//	protected QuackBehavior quackBehavior;

//	public void swin() {
//		System.out.println("the "+ this.getClass().getName() + "swin");
//	}
	
//	public void quack() {
//		quackBehavior.action();
//	}
//	
//	public void fly() {
//		flyBefavior.action();
//	}
	
	//假的鴨不會飛不會叫哭哭
//	public void quack() {
//		System.out.println("the "+ this.getClass().getName() + "quack");
//	}
//	
//	public void fly() {
//		System.out.println("the "+ this.getClass().getName() + "fly");
//	}
	
}
