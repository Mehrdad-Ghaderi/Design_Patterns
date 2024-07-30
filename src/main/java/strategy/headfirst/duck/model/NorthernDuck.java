package strategy.headfirst.duck.model;

import strategy.headfirst.duck.fly.FlyRocketPowered;

import strategy.headfirst.duck.quack.NorthenDuckQuack;

public class NorthernDuck extends Duck {

    public NorthernDuck() {
        quackBehavior = new NorthenDuckQuack();
        flyBehavior = new FlyRocketPowered();
    }

    @Override
    public void display() {
        System.out.println("Run Run Run! it's a northern duck");
    }
}
