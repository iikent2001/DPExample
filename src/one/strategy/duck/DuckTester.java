package one.strategy.duck;

import one.strategy.duck.duck.Duck;
import one.strategy.duck.duck.MallerDuck;

public class DuckTester {

	public static void main(String...strings) {
//		Duck d = new MallerDuck();
//		d.display();
//		d.fly();
//		d.quack();
//		
//		Duck t = new ToyDuck();
//		t.display();
//		t.fly();
//		t.quack();
		
		//封裝behavior
		System.out.println("封裝behavior");
		Duck c = new MallerDuck();
		c.display();
		c.getBehavior("FlyBehavior").action();
		c.getBehavior("QuackBehavior").action();
	}
}
