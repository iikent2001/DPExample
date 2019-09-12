package ten.state.myState.light;

import ten.state.myState.trafficLight.TrafficLight;

public abstract class ArrowLight implements Light{
	
	protected TrafficLight trafficLight;
	protected Light decorated;
	
	public ArrowLight(TrafficLight trafficLight,Light light) {
		this.trafficLight = trafficLight;
		this.decorated = light;
	}
}
