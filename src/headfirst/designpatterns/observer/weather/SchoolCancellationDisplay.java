package headfirst.designpatterns.observer.weather;

/**
 * SchoolCancellationDisplay displays a snow day under snowy or cold conditions
 */
public class SchoolCancellationDisplay implements DisplayElement, Observer {

    public static final int SNOWDAY_SNOWFALL_MIN = 12;
    public static final int SNOWDAY_TEMP_MAX = 0;

    /**
     * This display is an Observer of WeatherData, which holds the snow and temp conditions
     * that determine if school gets canceled
     *
     * @param weatherData
     */
    SchoolCancellationDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("SNOW DAY!");
    }

    /**
     * Determine whether to display the cancellation
     *
     * @param temp
     * @param humidity
     * @param pressure
     * @param snowFallInches
     */
    @Override
    public void update(float temp, float humidity, float pressure, float snowFallInches) {
        if (snowFallInches > SNOWDAY_SNOWFALL_MIN || temp < SNOWDAY_TEMP_MAX) {
            display();
        }
    }
}
