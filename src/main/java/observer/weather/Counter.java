package observer.weather;

import java.util.ArrayList;

public class Counter implements Publisher {
    private ArrayList<Integer> numbersDivisibleBy5;
    private ArrayList<EventListener> listeners;
    public Counter() {
        numbersDivisibleBy5 = new ArrayList<>();
        listeners = new ArrayList<>();
    }
    @Override
    public void registerListener(EventListener eventListener) {
        listeners.add(eventListener);
    }

    @Override
    public void removeListener(EventListener eventListener) {
        listeners.removeIf(e -> e == eventListener);
    }
    @Override
    public void notifyListeners() {
        for (EventListener e : listeners) {
            e.onEvent(numbersDivisibleBy5);
        }
    }
    public void findNumsDivisibleBy5(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                numbersDivisibleBy5.add(i);
            }
        }
    }
}
