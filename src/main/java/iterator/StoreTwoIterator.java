package iterator;

import java.util.ArrayList;

public class StoreTwoIterator implements Iterator {
    private ArrayList<Product> products;
    private int position = 0;

    public StoreTwoIterator(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        if (position >= products.size() || products.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return products.get(position++);
    }
}
