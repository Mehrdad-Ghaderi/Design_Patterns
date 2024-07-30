package observer.observerweather;

import java.util.ArrayList;

public class WeatherData implements Publisher {
    private ArrayList<WeatherDataListener> weatherDataListeners;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        weatherDataListeners = new ArrayList<>();
    }

    public void registerObserver(WeatherDataListener o) {
        weatherDataListeners.add(o);
    }

    public void removeObserver(WeatherDataListener o) {
        if (weatherDataListeners.contains(o)) {
            weatherDataListeners.remove(o);
        }
       /* int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }*/
        else System.out.println("No such element!");
    }

    public void notifyObservers() {
        WeatherEvent weatherEvent = new WeatherEvent(temperature, humidity, pressure);
        for (WeatherDataListener weatherDataListener : weatherDataListeners) {
            weatherDataListener.onEvent(weatherEvent);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
