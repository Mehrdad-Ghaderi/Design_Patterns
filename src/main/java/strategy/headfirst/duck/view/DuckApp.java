package strategy.headfirst.duck.view;

import strategy.headfirst.duck.fly.FlyRocketPowered;
import strategy.headfirst.duck.model.*;
import strategy.headfirst.duck.quack.Quack;

public class DuckApp {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        performAction(mallardDuck);

        Duck redHeadDuck = new RedHeadDuck();
        performAction(redHeadDuck);

        Duck rubberDuck = new RubberDuck();
        performAction(rubberDuck);

        Duck modelDuck = new ModelDuck();
        performAction(modelDuck);
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.setQuackBehavior(new Quack());
        System.out.println("*********************");
        modelDuck.performFly();
        modelDuck.performQuack();
    }

    private static void performAction(Duck duck) {
        System.out.println("*********************");
        duck.display();
        duck.performQuack();
        duck.performFly();
        duck.swim();
        System.out.println("*********************");
    }
}
