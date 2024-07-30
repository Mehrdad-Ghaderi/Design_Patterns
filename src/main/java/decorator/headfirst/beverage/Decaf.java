package decorator.headfirst.beverage;

public class Decaf extends Beverage{
    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
