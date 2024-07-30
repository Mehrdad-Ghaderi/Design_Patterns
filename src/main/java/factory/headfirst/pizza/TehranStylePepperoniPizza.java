package factory.headfirst.pizza;

import factory.headfirst.pizza.ingredients.PizzaIngredientFactory;

public class TehranStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public TehranStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
