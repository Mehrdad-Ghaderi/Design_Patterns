package decorator.headfirst.condiments;

import decorator.headfirst.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
