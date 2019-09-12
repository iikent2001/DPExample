package ten.state.myState.trafficLight;

import ten.state.myState.light.Forward;
import ten.state.myState.light.GreenLight;
import ten.state.myState.light.Light;
import ten.state.myState.light.RedLight;
import ten.state.myState.light.TurnLeft;
import ten.state.myState.light.YellowLight;

public class TrafficLight {
	
	private Light greenLight;
	private Light yellowLight;
	private Light redLight;
	private Light currentLight;
	
	private int currentSec;
	private int totalSec;
	
	public TrafficLight(int totalSec) {
		this.totalSec = totalSec;
		greenLight =new TurnLeft(this,new Forward(this, new GreenLight(this)));
		yellowLight = new YellowLight(this);
		redLight =  new RedLight(this);
		this.currentLight = greenLight;
	}
	
	public void start() {
		while(currentSec<totalSec) {
			this.flash();
			currentSec++;
		}
	}
	
	public void flash() {
		currentLight.flash();
	}

	public Light getGreenLight() {
		return greenLight;
	}

	public Light getYellowLight() {
		return yellowLight;
	}

	public Light getRedLight() {
		return redLight;
	}
	
	public void setCurrentLight(Light currentLight) {
		this.currentLight = currentLight;
	}

	public int getCurrentSec() {
		return currentSec;
	}

	public int getTotalSec() {
		return totalSec;
	}
	
}
