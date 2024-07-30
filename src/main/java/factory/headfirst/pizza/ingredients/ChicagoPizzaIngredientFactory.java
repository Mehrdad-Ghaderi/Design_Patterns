package factory.headfirst.pizza.ingredients;

import factory.headfirst.pizza.ingredients.cheese.Cheese;
import factory.headfirst.pizza.ingredients.cheese.ReggianoCheese;
import factory.headfirst.pizza.ingredients.dough.Dough;
import factory.headfirst.pizza.ingredients.dough.ThickCrustDough;
import factory.headfirst.pizza.ingredients.meat.Beef;
import factory.headfirst.pizza.ingredients.meat.Meat;
import factory.headfirst.pizza.ingredients.meat.Pepperoni;
import factory.headfirst.pizza.ingredients.sauce.Mustard;
import factory.headfirst.pizza.ingredients.sauce.Sauce;
import factory.headfirst.pizza.ingredients.veggies.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new Mustard();
    }

    @Override
    public List<Veggies> createVeggies() {
        return new ArrayList<>(Arrays.asList(new Garlic(), new BellPepper(), new Mushroom(), new Onion()));
    }

    @Override
    public Meat createMeat() {
        return new Beef();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
