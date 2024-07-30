package factory.headfirst.stores;

import factory.headfirst.pizza.NYStyleCheesePizza;
import factory.headfirst.pizza.NYStylePepperoniPizza;
import factory.headfirst.pizza.Pizza;
import factory.headfirst.pizza.ingredients.NYPizzaIngredientFactory;

public class NewYorkPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        type = type.toLowerCase();
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza(new NYPizzaIngredientFactory());
            pizza.setName("NY Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza(new NYPizzaIngredientFactory());
            pizza.setName("NY Pepperoni Pizza");
        } else pizza = null;
        return pizza;
    }
}
