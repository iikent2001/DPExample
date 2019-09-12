package twelve.total.duck.factory;

import twelve.total.duck.quackable.QuackCounterD;
import twelve.total.duck.quackable.Quackable;

public class RealDuckCounterFactory implements DuckFactory{
	
	private DuckFactory duck;
	
	public RealDuckCounterFactory(DuckFactory duck) {
		this.duck = duck;
	}
	
	@Override
	public Quackable createGoo() {
		return new QuackCounterD( duck.createGoo());
	}

	@Override
	public Quackable createGoose() {
		return new QuackCounterD( duck.createGoose());
	}

	@Override
	public Quackable createHook() {
		return new QuackCounterD( duck.createHook());
	}

	@Override
	public Quackable createQuack() {
		return new QuackCounterD( duck.createQuack());
	}

}
