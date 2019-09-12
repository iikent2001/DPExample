package one.strategy.duck.duck;


public class RedHeadDuck extends Duck{

	@Override
	public void display() {
		System.out.println("the "+ this.getClass().getName() + " display");
	}
	
//public class RedHeadDuck extends Duck implements Flyable,Quackable{
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
