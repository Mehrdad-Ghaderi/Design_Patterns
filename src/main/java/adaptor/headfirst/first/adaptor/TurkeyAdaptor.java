package adaptor.headfirst.first.adaptor;

import adaptor.headfirst.first.duck.Duck;
import adaptor.headfirst.first.turkey.Turkey;


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
