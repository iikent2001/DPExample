package ten.state.myState.light;

import ten.state.myState.trafficLight.TrafficLight;

public class GreenLight  implements Light{
	
	private TrafficLight trafficLight;
	
	public GreenLight(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}

	@Override
	public void flash() {
		int greenLightFlashSec = trafficLight.getTotalSec()*2/3;
		if(trafficLight.getCurrentSec()<greenLightFlashSec) {
			System.out.println("Green Light "+trafficLight.getCurrentSec());
		}else {
			trafficLight.setCurrentLight(trafficLight.getYellowLight());
			trafficLight.flash();
		}
	}
	
}
