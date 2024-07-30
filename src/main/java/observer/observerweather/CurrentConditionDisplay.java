package observer.observerweather;

public class CurrentConditionDisplay implements WeatherDataListener, DisplayElement {
    private float temperature;
    private float humidity;
    public Publisher publisher;


    @Override
    public void start(Publisher publisher) {
        this.publisher = publisher;
        publisher.registerObserver(this);
    }

    public void stop() {
        publisher.removeObserver(this);
    }

    @Override
    public void onEvent(WeatherEvent weatherEvent) {
        temperature = weatherEvent.temperature();
        humidity = weatherEvent.humidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
