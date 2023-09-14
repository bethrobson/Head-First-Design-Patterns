package headfirst.designpatterns.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	private float snowFallInches;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure, snowFallInches);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.snowFallInches = snowFallInches;
		measurementsChanged();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure, float snowFallInches) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.snowFallInches = snowFallInches;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
