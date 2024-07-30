package observer.mail.model;

import observer.mail.Observer;
import observer.mail.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
    private List<Observer> observers;
    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observers == null) throw new NullPointerException("Null Observer");

        if(!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate(Observer observer) {
        return message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to my topic: " + message);
        this.message = message;
        notifyObservers();
    }
}
