package observer.headfirst;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Event event) {
        this.temperature = event.getTemperature();
        this.humidity = event.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and "
        + humidity + "% humidity");
    }
}
