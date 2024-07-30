package factory.headfirst.pizza.ingredients;

import factory.headfirst.pizza.ingredients.cheese.Cheese;
import factory.headfirst.pizza.ingredients.cheese.GoatCheese;
import factory.headfirst.pizza.ingredients.dough.Dough;
import factory.headfirst.pizza.ingredients.dough.ThinCrustDough;
import factory.headfirst.pizza.ingredients.meat.Bacon;
import factory.headfirst.pizza.ingredients.meat.Meat;
import factory.headfirst.pizza.ingredients.meat.Pepperoni;
import factory.headfirst.pizza.ingredients.sauce.Ketchup;
import factory.headfirst.pizza.ingredients.sauce.Sauce;
import factory.headfirst.pizza.ingredients.veggies.Garlic;
import factory.headfirst.pizza.ingredients.veggies.Mushroom;
import factory.headfirst.pizza.ingredients.veggies.Tomato;
import factory.headfirst.pizza.ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new Ketchup();
    }

    @Override
    public List<Veggies> createVeggies() {
        return new ArrayList<>(Arrays.asList(new Garlic(), new Tomato(), new Mushroom()));
    }

    @Override
    public Meat createMeat() {
        return new Bacon();
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
