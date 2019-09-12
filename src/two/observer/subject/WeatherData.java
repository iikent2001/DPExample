package two.observer.subject;

import java.util.ArrayList;
import java.util.List;

import two.observer.observer.Observer;

public class WeatherData implements Subject{
	
	private List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}
	
	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if(i>=0) {
			observers.remove(i);
		}else {
			System.out.println("remove error index:"+i+"  "+observer.getClass().getSimpleName());
		}
	}
	
	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurement(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
}
