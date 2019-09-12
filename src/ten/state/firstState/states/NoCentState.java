package ten.state.firstState.states;

import ten.state.firstState.machine.Machine;

public class NoCentState implements State{
	
	Machine machine;
	
	public NoCentState(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void insert() {
		System.out.println("you insert a cent");
		machine.setState(machine.getHasCentState());
		
	}

	@Override
	public void eject() {
		System.out.println("can't eject"+this.getClass().getSimpleName());
	}

	@Override
	public void turn() {
		System.out.println("can't return"+this.getClass().getSimpleName());
	}

	@Override
	public void dispense() {
		System.out.println("can't dispense"+this.getClass().getSimpleName());
	}

}
