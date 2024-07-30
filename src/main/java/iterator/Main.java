package iterator;

import iterator.store.StoreOne;
import iterator.store.StoreTwo;

public class Main {
    public static void main(String[] args) {
        StoreOne storeOne = new StoreOne();

        StoreTwo storeTwo = new StoreTwo();

        Seller seller = new Seller(storeOne, storeTwo);
        seller.showProducts();

    }
}
