package strategy.headfirst.duck.model;

import strategy.headfirst.duck.fly.NoFly;
import strategy.headfirst.duck.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }

    @Override
    public void swim() {
        System.out.println("Model duck, too heavy to float");
    }
}
