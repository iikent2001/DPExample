package one.strategy.duck.duck;

public class ToyDuck extends Duck{
	//TODO
	public ToyDuck(){
//		flyBefavior = new FlyNoWay();
//		quackBehavior = new Mute();
	}

	@Override
	public void display() {
		System.out.println("the "+ this.getClass().getName() + " display");
	}

}
