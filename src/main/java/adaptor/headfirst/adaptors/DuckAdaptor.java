package adaptor.headfirst.adaptors;

import adaptor.headfirst.duck.Duck;
import adaptor.headfirst.turkey.Turkey;

public class DuckAdaptor implements Turkey {

    Duck duck;

    public DuckAdaptor(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
