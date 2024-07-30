package factory.headfirst.pizza.ingredients;

import factory.headfirst.pizza.ingredients.cheese.Cheese;
import factory.headfirst.pizza.ingredients.cheese.GoatCheese;
import factory.headfirst.pizza.ingredients.dough.Dough;
import factory.headfirst.pizza.ingredients.dough.ThickCrustDough;
import factory.headfirst.pizza.ingredients.meat.Beef;
import factory.headfirst.pizza.ingredients.meat.Meat;
import factory.headfirst.pizza.ingredients.meat.Pepperoni;
import factory.headfirst.pizza.ingredients.sauce.Ketchup;
import factory.headfirst.pizza.ingredients.sauce.Sauce;
import factory.headfirst.pizza.ingredients.veggies.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TehranPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new Ketchup();
    }

    @Override
    public List<Veggies> createVeggies() {
        return new ArrayList<>(Arrays.asList(new Mushroom(), new Garlic(), new BellPepper(), new Corn()));
    }

    @Override
    public Meat createMeat() {
        return new Beef();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }
}
