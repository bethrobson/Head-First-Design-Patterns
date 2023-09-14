package headfirst.designpatterns.observer.weather;

public class SchoolCancellationDisplay implements DisplayElement, Observer{

    SchoolCancellationDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("SNOW DAY!");
    }

    @Override
    public void update(float temp, float humidity, float pressure, float snowFallInches) {
        if (snowFallInches > 12 || temp < 0) {
            display();
        }
    }
}
