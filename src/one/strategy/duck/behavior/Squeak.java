package one.strategy.duck.behavior;

public class Squeak implements QuackBehavior {

	@Override
	public void action() {
		System.out.println("squeak squeak");
	}

}
