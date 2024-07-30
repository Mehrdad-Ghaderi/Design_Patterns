package observer.weather;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Listener listener = new Listener(counter);

        counter.findNumsDivisibleBy5(50);
        counter.notifyListeners();

    }
}
