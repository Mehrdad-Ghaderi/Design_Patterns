package udemydesignpattern.factory.model;

public abstract class Hamburger {
    public String name;
    public String sauce;
    public String bun;
    public boolean isSpicy;

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("adding sauce " + sauce);
        System.out.println("adding buns " + bun);
    }

    public void cook() {
        System.out.println("Cooking");
    }
    public void box() {
        System.out.println("Boxing");
    }
}

