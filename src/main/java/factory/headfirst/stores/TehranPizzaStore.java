package factory.headfirst.stores;

import factory.headfirst.pizza.Pizza;
import factory.headfirst.pizza.TehranStyleCheesePizza;
import factory.headfirst.pizza.TehranStylePepperoniPizza;
import factory.headfirst.pizza.TehranStyleVeggiePizza;
import factory.headfirst.pizza.ingredients.TehranPizzaIngredientFactory;

public class TehranPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        type = type.toLowerCase();
        var pizzaIngredientFactory = new TehranPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new TehranStyleCheesePizza(pizzaIngredientFactory);
            pizza.setName("Tehran Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new TehranStylePepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Tehran Pepperoni Pizza");
        } else if (type.equals("Veggie")) {
            pizza = new TehranStyleVeggiePizza(pizzaIngredientFactory);
            pizza.setName("Tehran Veggie Pizza");
        } else {
            pizza = null;
        }
        return pizza;
    }
}
