package observer.headfirst;

import observer.observerweather.WeatherEvent;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private Event event;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        if (observers.contains(observer)) {
            System.out.println("You are already subscribed");
        } else
            observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        } else throw new NoSuchElementException();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(event);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(Event event) {
        this.event = event;
        measurementsChanged();
    }
}
