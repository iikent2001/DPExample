package one.strategy.duck.behavior;

public class Mute implements QuackBehavior {

	@Override
	public void action() {
		System.out.println("......");
	}

}
