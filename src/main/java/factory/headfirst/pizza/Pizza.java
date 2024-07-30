package factory.headfirst.pizza;

import factory.headfirst.pizza.ingredients.dough.Dough;
import factory.headfirst.pizza.ingredients.sauce.Sauce;
import factory.headfirst.pizza.ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    List<Veggies> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough ..." + dough);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Baking for 25 minutes at 220' Celsius");
    }

    public void cut() {
        System.out.println("cutting the " + name + " into diagonal slices");
    }

    public void box() {
        System.out.println("Putting the pizza into an official pizza box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public List<Veggies> getToppings() {
        return toppings;
    }

    public void setToppings(List<Veggies> toppings) {
        this.toppings = toppings;
    }
}
