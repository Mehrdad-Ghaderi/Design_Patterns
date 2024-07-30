package factory.headfirst.pizza;

import factory.headfirst.pizza.ingredients.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "Chicago Style Deep Dish Cheese Pizza";
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        toppings = pizzaIngredientFactory.createVeggies();
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
