package strategy.headfirst.duck.fly;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't possibly fly!");
    }
}
