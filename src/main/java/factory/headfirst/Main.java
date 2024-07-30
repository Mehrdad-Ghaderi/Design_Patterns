package factory.headfirst;

import factory.headfirst.stores.ChicagoPizzaStore;
import factory.headfirst.stores.NewYorkPizzaStore;
import factory.headfirst.stores.PizzaStore;
import factory.headfirst.stores.TehranPizzaStore;

public class Main {
    public static void main(String[] args) {

        PizzaStore nyStore = new NewYorkPizzaStore();
        var nyCheese = nyStore.orderPizza("Cheese");
        System.out.println("Mehrdad Ordered " + nyCheese.getName() + "\n");

        PizzaStore chicStore = new ChicagoPizzaStore();
        var chicPep = chicStore.orderPizza("Pepperoni");
        System.out.println("Selda Ordered " + chicPep.getName() + "\n");

        PizzaStore tehStore = new TehranPizzaStore();
        var tehPep = tehStore.orderPizza("Pepperoni");
        System.out.println("Selda Ordered " + tehPep.getName() + "\n");
    }
}
