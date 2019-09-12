package one.strategy.duck.duck;

public class WoodDuck extends Duck{

	@Override
	public void display() {
		System.out.println("the "+ this.getClass().getName() + " display");
	}

}
