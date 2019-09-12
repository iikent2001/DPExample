package twelve.total.duck.factory;

import twelve.total.duck.quackable.Goo;
import twelve.total.duck.quackable.GooseAdaptor;
import twelve.total.duck.quackable.GooseQuack;
import twelve.total.duck.quackable.Hook;
import twelve.total.duck.quackable.Quack;
import twelve.total.duck.quackable.Quackable;

public class RealDuckFactory implements DuckFactory{

	public Quackable createGoo() {
		return new Goo();
	}
	
	public Quackable createGoose() {
		return new GooseAdaptor( new GooseQuack());
	}
	
	public Quackable createHook() {
		return new Hook();
	}
	
	public Quackable createQuack() {
		return new Quack();
	}
}
