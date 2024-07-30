package udemydesignpattern.factory.interfaces.store;

import udemydesignpattern.factory.interfaces.HamburgerStore;
import udemydesignpattern.factory.model.Hamburger;

public class IranianHamburgeStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        return null;
    }
}
