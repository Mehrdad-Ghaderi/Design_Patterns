package decorator.headfirst.beverage;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 2.19;
    }
}
