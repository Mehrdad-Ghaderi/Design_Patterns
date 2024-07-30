package iterator.store;

import iterator.Iterator;
import iterator.Product;
import iterator.StoreOneIterator;

public class StoreOne {
    private static final int MAX_ITEMS = 4;
    private int numOfProducts = 0;
    private Product[] products = new Product[MAX_ITEMS];

    public StoreOne() {
        addItem("Hey", "O-T-shirt", 19.99);
        addItem("Hoy", "O-Shirt", 24.99);
        addItem("Hah", "O-Pants", 30);
        addItem("Hum", "O-sneakers", 129.99);
    }

    private void addItem(String name, String description, double price) {

        if (numOfProducts >= MAX_ITEMS) {
            System.out.println("catalog is full");
        } else {
            Product product = new Product(name, description, price);
            products[numOfProducts++] = product;
        }
    }

    public Iterator createIterator() {
        return new StoreOneIterator(products);
    }
}
