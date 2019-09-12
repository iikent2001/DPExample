package two.observer.observer;

import two.observer.subject.Subject;

public class PressureDisplay implements Observer,DisplayElement{
	
	private float pressure;
	private Subject weatherData;
	
	public PressureDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("in pressure station pressuer:"+pressure);
		
	}
	
	public void unRegister() {
		weatherData.removeObserver(this);
		System.out.println("PressureDisplay unRegister");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.pressure = pressure;
		display();
	}

}
