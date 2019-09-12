package two.observer.observer;

import two.observer.subject.Subject;

public class CurrentConditionDisplay implements DisplayElement,Observer {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void unRegister() {
		weatherData.removeObserver(this);
		System.out.println("CurrentConditionDisplay unRegister");
	}

	@Override
	public void display() {
		System.out.println("in CurrentConditionDisplay temperature:"+temperature+"  humidity:"+humidity);
	}

}
