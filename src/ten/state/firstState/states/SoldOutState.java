package ten.state.firstState.states;

import ten.state.firstState.machine.Machine;

public class SoldOutState implements State{
	
	private Machine machine;
	
	public SoldOutState(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void insert() {
		System.out.println("SoldOut(insert) "+this.getClass().getSimpleName());
		
	}

	@Override
	public void eject() {
		System.out.println("SoldOut(eject) "+this.getClass().getSimpleName());
	}

	@Override
	public void turn() {
		System.out.println("SoldOut(turn) "+this.getClass().getSimpleName());
	}

	@Override
	public void dispense() {
		System.out.println("SoldOut(dispense) "+this.getClass().getSimpleName());
	}

}
