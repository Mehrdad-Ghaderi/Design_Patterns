package decorator.headfirst.size;

import decorator.headfirst.beverage.Beverage;

public class Tall extends Beverage {

    Beverage beverage;

    public Tall(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Tall " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost() + (beverage.cost() * 10 / 100);
    }
}
