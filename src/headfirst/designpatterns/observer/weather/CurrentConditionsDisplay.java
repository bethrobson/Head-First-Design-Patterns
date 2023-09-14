package headfirst.designpatterns.observer.weather;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	private float snowFallInches;

	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure, float snowFallInches) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.snowFallInches = snowFallInches;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity and "
			+ snowFallInches + " inches of snowfall.");
	}
}
