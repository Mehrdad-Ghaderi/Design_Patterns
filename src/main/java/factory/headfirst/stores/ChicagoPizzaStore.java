package factory.headfirst.stores;

import factory.headfirst.pizza.*;
import factory.headfirst.pizza.ingredients.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        type = type.toLowerCase();
        var pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Pepperoni Pizza");
        } else pizza = null;
        return pizza;

    }
}
