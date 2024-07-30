package observer.derekbanas;

public class StockObserver implements Observer{

    private double ibmPrice;
    private double aaplePrice;
    private double googlePrice;

    private static int observerIDTrcker = 0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTrcker;
        System.out.println("New observer " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.aaplePrice = aaplePrice;
        this.googlePrice = googlePrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID +
                "\nIBM: " + ibmPrice +
                "\nApple: " + aaplePrice +
                "\nGoggle: " + googlePrice
        );
    }


}
