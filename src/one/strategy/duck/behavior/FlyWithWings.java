package one.strategy.duck.behavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void action() {
		System.out.println("Flying");
	}

}
