package one.strategy.duck.behavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void action() {
		System.out.println("cant fly");
	}

}
