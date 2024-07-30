package udemydesignpattern.factory.interfaces;

import udemydesignpattern.factory.model.Hamburger;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type) {
        Hamburger hamburger = createHamburger(type);
        hamburger.prepare();
        hamburger.cook();
        hamburger.box();

        return hamburger;
    }

    public abstract Hamburger createHamburger(String type);
}
