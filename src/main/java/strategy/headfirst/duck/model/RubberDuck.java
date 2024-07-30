package strategy.headfirst.duck.model;

import strategy.headfirst.duck.fly.NoFly;
import strategy.headfirst.duck.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Looks like a rubber duck!");
    }

    @Override
    public void swim() {
        System.out.println("Rubber duck is floating");

    }
}
