package ten.state.myState;

import ten.state.myState.trafficLight.TrafficLight;

public class MyStateTester {

	public static void main(String...strings) {
		new TrafficLight(9).start();
		new TrafficLight(4).start();
	}
}
