package strategy.headfirst.duck.model;

import strategy.headfirst.duck.fly.FlyBehavior;
import strategy.headfirst.duck.quack.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;


    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("All ducks swim!");
    }

    public void display() {

    }
}
