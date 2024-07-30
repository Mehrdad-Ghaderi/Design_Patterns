package strategy.headfirst.duck.fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying on a rockeeeeeet!");
    }
}
