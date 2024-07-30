package adaptor.headfirst.first.adaptor;

import adaptor.headfirst.first.duck.Duck;
import adaptor.headfirst.first.turkey.Turkey;

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
