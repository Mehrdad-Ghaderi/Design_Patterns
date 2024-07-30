package decorator.headfirst;

import decorator.headfirst.beverage.Beverage;
import decorator.headfirst.beverage.Decaf;
import decorator.headfirst.beverage.Espresso;
import decorator.headfirst.beverage.HouseBlend;
import decorator.headfirst.condiments.Mocha;
import decorator.headfirst.condiments.Soy;
import decorator.headfirst.condiments.WhippedMilk;
import decorator.headfirst.size.Grande;
import decorator.headfirst.size.Tall;
import decorator.headfirst.size.Venti;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new WhippedMilk(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + ": $" + beverage1.cost());
        beverage1 = new Tall(beverage1);
        System.out.println("Made Tall: " + beverage1.getDescription() + ": $" + beverage1.cost());

        Beverage beverage2 = new Decaf();
        beverage2 = new WhippedMilk(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());
        beverage2 = new Venti(beverage2);
        System.out.println( "Venti added: " + beverage2.getDescription() + ": $" + beverage2.cost());

        Beverage beverage3 = new Soy(new WhippedMilk(new Mocha(new HouseBlend())));
        System.out.println(beverage3.getDescription() + ": $" + beverage3.cost());

        Beverage beverage4 = new Grande(new Soy(new WhippedMilk(new Mocha(new HouseBlend()))));
        System.out.println(beverage4.getDescription() + ": $" + beverage4.cost());


    }
}
