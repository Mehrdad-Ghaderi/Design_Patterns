package iterator;

import iterator.store.StoreOne;
import iterator.store.StoreTwo;

public class Seller {
    private StoreOne storeOne;
    private StoreTwo storeTwo;

    public Seller(StoreOne storeOne, StoreTwo storeTwo) {
        this.storeOne = storeOne;
        this.storeTwo = storeTwo;
    }

    public void showProducts() {
        Iterator storeOneIterator = storeOne.createIterator();
        Iterator storeTwoIterator = storeTwo.createIterator();
        System.out.println("StoreOne Products:");
        showProducts(storeOneIterator);

        System.out.println("StoreTwo Products:");
        showProducts(storeTwoIterator);

    }

    private void showProducts(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println(product);
        }
    }


}
