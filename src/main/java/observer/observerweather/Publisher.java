package observer.observerweather;

public interface Publisher {
    public void registerObserver(WeatherDataListener o);
    public void removeObserver(WeatherDataListener o);
    public void notifyObservers();

}
