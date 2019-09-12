package ten.state.myState.light;

import ten.state.myState.trafficLight.TrafficLight;

public class RedLight implements Light{
	
	private TrafficLight trafficLight;
	
	public RedLight(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}

	@Override
	public void flash() {
		if(trafficLight.getCurrentSec()<=trafficLight.getTotalSec()) {
			System.out.println("Red Light "+trafficLight.getCurrentSec());
		}else {
			trafficLight.setCurrentLight(trafficLight.getGreenLight());
		}
	}

}
