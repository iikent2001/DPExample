package twelve.total.duck.quackable;

import java.util.ArrayList;
import java.util.List;

public class DuckGroup  extends Quackable{
	
	public List<Quackable> ducks = new ArrayList<Quackable>();
	
	public void add(Quackable...quackables) {
		for(Quackable duck :quackables) {
			ducks.add(duck);
		}
	}

	@Override
	public void quack() {
		for(Quackable duck :ducks) {
			duck.quack();
		}
	}

}
