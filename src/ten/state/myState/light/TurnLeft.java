package ten.state.myState.light;

import ten.state.myState.trafficLight.TrafficLight;

public class TurnLeft extends ArrowLight{
	
	
	public TurnLeft(TrafficLight trafficLight, Light light) {
		super(trafficLight, light);
	}

	@Override
	public void flash() {
		decorated.flash();
		if(trafficLight.getCurrentSec()>trafficLight.getTotalSec()*2/3/2 && trafficLight.getCurrentSec()<trafficLight.getTotalSec()*2/3) {
			System.out.println("Turn Left Light"+trafficLight.getCurrentSec());
		}
	}
	
}
