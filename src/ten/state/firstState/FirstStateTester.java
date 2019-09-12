package ten.state.firstState;

import ten.state.firstState.machine.Machine;

public class FirstStateTester {
	public static void main(String...strings) {
		Machine m = new Machine(2);
		m.insert();
		m.eject();
		m.insert();
		m.turn();
	}
}
