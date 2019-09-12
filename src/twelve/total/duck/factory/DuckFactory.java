package twelve.total.duck.factory;

import twelve.total.duck.quackable.Quackable;

public interface DuckFactory {
	
	public Quackable createGoo();
	
	public Quackable createGoose();
	
	public Quackable createHook();
	
	public Quackable createQuack();

}
