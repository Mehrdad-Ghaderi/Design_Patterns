package observer.weather;

import java.util.List;

public abstract class Event {
    int index;
    List<Event> getSupportedEvent() {
        return null;
    }
}
