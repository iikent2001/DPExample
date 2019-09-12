package ten.state.myState.light;

import ten.state.myState.trafficLight.TrafficLight;

public class YellowLight implements Light{
	
	private TrafficLight trafficLight;
	
	public YellowLight(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}

	@Override
	public void flash() {
		System.out.println("Yellow Light "+trafficLight.getCurrentSec());
		trafficLight.setCurrentLight(trafficLight.getRedLight());
	}
}
