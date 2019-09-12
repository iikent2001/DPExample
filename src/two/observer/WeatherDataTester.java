package two.observer;

import two.observer.observer.CurrentConditionDisplay;
import two.observer.observer.PressureDisplay;
import two.observer.subject.WeatherData;

public class WeatherDataTester {
	public static void main(String...strings) {
		WeatherData station = new WeatherData();
		CurrentConditionDisplay condition = new CurrentConditionDisplay(station);
		station.setMeasurement(80, 60, 50.5f);
		PressureDisplay pressure = new PressureDisplay(station);
		station.setMeasurement(60, 50, 44.5f);
		station.setMeasurement(100, 200, 9.5f);
		condition.unRegister();
		station.setMeasurement(50, 60, 13.5f);
		pressure.unRegister();
		System.out.println("all un");
		station.setMeasurement(50, 60, 13.5f);
		System.out.println("end");
	}
	
}
