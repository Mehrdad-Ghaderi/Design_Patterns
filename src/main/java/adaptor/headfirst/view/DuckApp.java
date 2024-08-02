package adaptor.headfirst.view;

import adaptor.headfirst.adaptors.*;
import adaptor.headfirst.duck.*;
import adaptor.headfirst.turkey.*;

public class DuckApp {
    public static void main(String[] args) {

        //Here a duck and a turkey are created
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
