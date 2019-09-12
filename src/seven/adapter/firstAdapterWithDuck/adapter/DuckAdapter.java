package seven.adapter.firstAdapterWithDuck.adapter;

import seven.adapter.firstAdapterWithDuck.model.Duck;
import seven.adapter.firstAdapterWithDuck.model.Turkey;

public class DuckAdapter implements Duck{
	private Turkey turkey;
	public DuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	@Override
	public void fly() {
		turkey.fly();
	}
	@Override
	public void quack() {
		turkey.gloglo();
	}
}
