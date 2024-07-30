package observer.weather;

import java.util.ArrayList;
import java.util.List;

public class Listener implements EventListener {
    private ArrayList<Integer> numbers;
    private Publisher counter;

    public Listener(Publisher counter) {
        counter.registerListener(this);
        numbers = new ArrayList<>();
        this.counter = counter;
    }

    @Override
    public void onEvent(ArrayList<Integer> numsDivisibleBy5) {
        numbers.addAll(numsDivisibleBy5);
        display();
    }

    public List<Event> getSupportedEvent() {
        return null;
    }

    public void display() {
        numbers.forEach(System.out::println);
    }
}
