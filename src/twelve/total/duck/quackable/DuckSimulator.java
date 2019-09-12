package twelve.total.duck.quackable;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator implements DuckSubject{
	
	private List<Quackable> ducks = new ArrayList<Quackable>();
	
	public void simulate(Quackable duck){
		duck.quack();
	}

	@Override
	public void registry(Quackable duck) {
		this.ducks.add(duck);
		
	}

	@Override
	public void published() {
		this.invoke();
		
	}

	@Override
	public void invoke() {
		for(Quackable duck:ducks) {
			duck.update();
		}
		
	}

}
