package decorator.headfirst.condiments;

import decorator.headfirst.beverage.Beverage;

public class SteamedMilk extends CondimentDecorator{

    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", steamed milk";
    }
}
