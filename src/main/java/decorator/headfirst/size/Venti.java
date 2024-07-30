package decorator.headfirst.size;

import decorator.headfirst.beverage.Beverage;

public class Venti extends SizeDecorator{
    Beverage beverage;

    public Venti(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + (beverage.cost() * 40 / 100);
    }

    @Override
    public String getDescription() {
        return "Venti " + beverage.getDescription();
    }
}
