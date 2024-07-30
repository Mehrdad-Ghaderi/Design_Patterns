package observer.weather;

import java.util.ArrayList;
import java.util.List;

public interface EventListener {
    void onEvent(ArrayList<Integer> numsDivisibleBy5);

    List<Event> getSupportedEvent();

}
