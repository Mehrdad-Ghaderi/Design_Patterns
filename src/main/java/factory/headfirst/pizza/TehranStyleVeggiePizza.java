package factory.headfirst.pizza;

import factory.headfirst.pizza.ingredients.PizzaIngredientFactory;
import factory.headfirst.pizza.ingredients.TehranPizzaIngredientFactory;

public class TehranStyleVeggiePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;
    public TehranStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        toppings = pizzaIngredientFactory.createVeggies();
    }
}
