package iterator.store;

import iterator.Iterator;
import iterator.Product;
import iterator.StoreTwoIterator;

import java.util.ArrayList;

public class StoreTwo {
    private ArrayList<Product> products = new ArrayList<>();

    public StoreTwo() {
        addItem("Sey", "T-T-shirt", 19.99);
        addItem("Soy", "T-Shirt", 24.99);
        addItem("Sah", "T-Pants", 30);
        addItem("Sum", "T-sneakers", 129.99);
    }

    private void addItem(String name, String description, double price) {
        products.add(new Product(name, description, price));
    }

    public Iterator createIterator() {
        return new StoreTwoIterator(products);
    }

}
