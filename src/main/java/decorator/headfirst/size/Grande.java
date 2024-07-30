package decorator.headfirst.size;

import decorator.headfirst.beverage.Beverage;

public class Grande extends Beverage {
    Beverage beverage;

    public Grande(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Grande " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + (beverage.cost() * 25 / 100);
    }
}
