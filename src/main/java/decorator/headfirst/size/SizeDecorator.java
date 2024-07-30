package decorator.headfirst.size;

import decorator.headfirst.beverage.Beverage;

public abstract class SizeDecorator extends Beverage {
    public abstract String getDescription();
}
