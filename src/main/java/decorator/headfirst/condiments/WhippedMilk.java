package decorator.headfirst.condiments;

import decorator.headfirst.beverage.Beverage;

public class WhippedMilk extends CondimentDecorator {
    Beverage beverage;

    public WhippedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .5 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
