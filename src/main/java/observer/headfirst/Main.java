package observer.headfirst;

import observer.observerweather.WeatherEvent;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentCondition = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(new Event(80, 65, 30.4f));
        weatherData.setMeasurements(new Event(82, 70, 29.2f));
        weatherData.setMeasurements(new Event(78, 90, 29.2f));
    }
}
