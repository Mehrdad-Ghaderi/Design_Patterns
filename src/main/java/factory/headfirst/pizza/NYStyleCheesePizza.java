package factory.headfirst.pizza;

import factory.headfirst.pizza.ingredients.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;
    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "NY Style Cheese Pizza";
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
