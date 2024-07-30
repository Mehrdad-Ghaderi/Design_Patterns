package strategy.headfirst.duck.model;

import strategy.headfirst.duck.fly.FlyRocketPowered;
import strategy.headfirst.duck.quack.MuteQuack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyRocketPowered();
    }

    @Override
    public void display() {
        System.out.println("Looks like a Red Head Duck!");
    }
}
