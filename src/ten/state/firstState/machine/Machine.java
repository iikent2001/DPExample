package ten.state.firstState.machine;

import ten.state.firstState.states.HasCent;
import ten.state.firstState.states.NoCentState;
import ten.state.firstState.states.SoldOutState;
import ten.state.firstState.states.SoldState;
import ten.state.firstState.states.State;

public class Machine {
	
	private State noCentState;
	private State hasCentState;
	private State soldState;
	private State soldOutState;
	
	private State currentState;
	private int count;
	
	public Machine(int balls) {
		this.noCentState = new NoCentState(this);
		this.hasCentState = new HasCent(this);
		this.soldState = new SoldState(this);
		this.soldOutState = new SoldOutState(this);
		this.count = balls;
		if(balls>0) {
			currentState = noCentState; 
		}
	}
	
	public void insert() {
		currentState.insert();
	}
	public void eject() {
		currentState.eject();
	}
	public void turn() {
		currentState.turn();
		currentState.dispense();
	}
	
	public void setState(State state) {
		this.currentState = state;
	}
	
	public void release() {
		System.out.println("release a balls");
		if(this.count!=0)
			this.count--;
	}

	public State getNoCentState() {
		return noCentState;
	}

	public State getHasCentState() {
		return hasCentState;
	}
	
	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public int getCount() {
		return count;
	}
	
}
