package observer.derekbanas;

public class Main {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplePrice(677.00);
        stockGrabber.setGooglePrice(676.00);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(194.00);
        stockGrabber.setAaplePrice(680.00);
        stockGrabber.setGooglePrice(690.00);

    }
}
