package observer.derekbanas;

import java.util.ArrayList;

public class StockGrabber implements Subject{
    private ArrayList<Observer> observers;
    double ibmPrice;
    double aaplePrice;
    double googlePrice;

    public StockGrabber() {
         observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(ibmPrice, aaplePrice, googlePrice);
        }
    }

    public double getIbmPrice() {
        return ibmPrice;
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public double getAaplePrice() {
        return aaplePrice;
    }

    public void setAaplePrice(double aaplePrice) {
        this.aaplePrice = aaplePrice;
        notifyObservers();
    }

    public double getGooglePrice() {
        return googlePrice;
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObservers();
    }
}
