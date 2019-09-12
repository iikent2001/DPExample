package ten.state.firstState.states;

import ten.state.firstState.machine.Machine;

public class SoldState implements State{
	
	private Machine machine;
	
	public  SoldState(Machine machine) {
		this.machine = machine;
	}

	@Override
	public void insert() {
		System.out.println("can't insert"+this.getClass().getSimpleName());
	}

	@Override
	public void eject() {
		System.out.println("can't eject"+this.getClass().getSimpleName());
	}

	@Override
	public void turn() {
		System.out.println("can't turn"+this.getClass().getSimpleName());
	}

	@Override
	public void dispense() {
		machine.release();
		if(machine.getCount()>0) {
			machine.setState(machine.getNoCentState());
		}else {
			System.out.println("sold out!!");
			machine.setState(machine.getSoldOutState());
		}
	}

}
