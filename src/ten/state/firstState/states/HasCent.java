package ten.state.firstState.states;

import ten.state.firstState.machine.Machine;

public class HasCent implements State {

	private Machine machine;

	public HasCent(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void insert() {
		System.out.println("can't insert" + this.getClass().getSimpleName());
	}

	@Override
	public void eject() {
		System.out.println("eject cent");
		machine.setState(machine.getNoCentState());
	}

	@Override
	public void turn() {
		System.out.println("turn cent");
		machine.setState(machine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("can't dispense" + this.getClass().getSimpleName());
	}

}
