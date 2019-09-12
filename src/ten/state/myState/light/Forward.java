package ten.state.myState.light;

import ten.state.myState.trafficLight.TrafficLight;

public class Forward extends ArrowLight{

	public Forward(TrafficLight trafficLight, Light light) {
		super(trafficLight, light);
	}

	@Override
	public void flash() {
		decorated.flash();
		System.out.println("Forward "+trafficLight.getCurrentSec());
	}

}
