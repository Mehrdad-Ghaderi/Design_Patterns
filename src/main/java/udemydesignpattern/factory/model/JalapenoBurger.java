package udemydesignpattern.factory.model;

public class JalapenoBurger extends Hamburger{
    private String jalapeno;

    public JalapenoBurger() {
        name = "Cheese Burger";
        sauce = "Normal sauce";
        bun = "Normal buns";
        jalapeno = "Mexican jalapeno";
        isSpicy = true;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Adding " + jalapeno);
    }

    @Override
    public void cook() {
        System.out.println("Cooking jalapeno burger");
    }

    @Override
    public void box() {
        System.out.println("Boxing");
    }
}
