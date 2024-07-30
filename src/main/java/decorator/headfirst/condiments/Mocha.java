package decorator.headfirst.condiments;

import decorator.headfirst.beverage.Beverage;

public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .9 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

}
