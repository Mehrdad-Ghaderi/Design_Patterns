package observer.observerweather;

public interface WeatherDataListener {
    void onEvent(WeatherEvent weatherEvent);

    void start(Publisher publisher);
    void stop();
}

