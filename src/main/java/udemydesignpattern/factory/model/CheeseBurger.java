package udemydesignpattern.factory.model;

public class CheeseBurger extends Hamburger {
    private final String cheese;

    public CheeseBurger() {
        name = "Cheese Burger";
        sauce = "Normal sauce";
        bun = "Normal buns";
        cheese = "Cedar";
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding " + cheese);
    }

    @Override
    public void cook() {
        System.out.println("Cooking cheese burger");
    }
}
