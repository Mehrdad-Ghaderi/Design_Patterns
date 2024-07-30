package factory.headfirst.pizza.ingredients;

import factory.headfirst.pizza.ingredients.cheese.Cheese;
import factory.headfirst.pizza.ingredients.dough.Dough;
import factory.headfirst.pizza.ingredients.meat.Meat;
import factory.headfirst.pizza.ingredients.meat.Pepperoni;
import factory.headfirst.pizza.ingredients.sauce.Sauce;
import factory.headfirst.pizza.ingredients.veggies.Veggies;

import java.util.List;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    List<Veggies> createVeggies();
    Meat createMeat();

    Cheese createCheese();

    Pepperoni createPepperoni();
}
