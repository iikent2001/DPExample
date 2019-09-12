package seven.adapter.firstAdapterWithDuck;

import seven.adapter.firstAdapterWithDuck.adapter.DuckAction;
import seven.adapter.firstAdapterWithDuck.adapter.DuckAdapter;
import seven.adapter.firstAdapterWithDuck.model.Duck;
import seven.adapter.firstAdapterWithDuck.model.NormalDuck;
import seven.adapter.firstAdapterWithDuck.model.StrangeTurkey;
import seven.adapter.firstAdapterWithDuck.model.Turkey;

public class DuckAdapterTester {

	public static void main(String...strings) {
		//new DuckAdapter(new Turkey)
		//duck.action()
		
		Duck duck = new NormalDuck();
		Turkey turkey = new StrangeTurkey();
		DuckAction.Action(duck);
		//DuckAction.Action(turkey); error
		DuckAction.Action(new DuckAdapter(turkey));
	}
	
	
}
