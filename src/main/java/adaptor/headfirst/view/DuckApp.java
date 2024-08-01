package adaptor.headfirst.view;

import adaptor.headfirst.adaptors.DuckAdaptor;
import adaptor.headfirst.adaptors.TurkeyAdaptor;
import adaptor.headfirst.duck.Duck;
import adaptor.headfirst.duck.MallardDuck;
import adaptor.headfirst.first.duck.*;
import adaptor.headfirst.turkey.Turkey;
import adaptor.headfirst.turkey.WildTurkey;

public class DuckApp {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();

        Duck turkeyAdaptor = new TurkeyAdaptor(wildTurkey);
        Turkey duckAdaptor = new DuckAdaptor(mallardDuck);


        System.out.println("Mallard Duck says ...");
        mallardDuck.quack();
        mallardDuck.fly();
        System.out.println();

        System.out.println("Wild Turkey say ....");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println();

        System.out.println("Turkey Adaptor says ...");
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
        System.out.println();

        System.out.println("Duck Adaptor says ...");
        duckAdaptor.gobble();
        duckAdaptor.fly();
        System.out.println();
    }
}
