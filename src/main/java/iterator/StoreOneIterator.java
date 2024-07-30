package iterator;

//the class could also be called StoreOneInventory
public class StoreOneIterator implements Iterator{


    private Product[] products;
    int position = 0;

    public StoreOneIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        return position < products.length && products[position] != null;
    }

    @Override
    public Object next() {
        return products[position++];
    }
}
