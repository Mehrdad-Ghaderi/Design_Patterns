package adaptor.headfirst.adaptors;

import adaptor.headfirst.duck.Duck;
import adaptor.headfirst.turkey.Turkey;


public class TurkeyAdaptor implements Duck {

    Turkey turkey;

    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        String bool;
        Boolean.valueOf(true);
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
