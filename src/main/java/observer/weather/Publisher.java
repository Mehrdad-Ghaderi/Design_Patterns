package observer.weather;

public interface Publisher {
    void registerListener(EventListener eventListener);
    void removeListener(EventListener eventListener);
    void notifyListeners();
}
