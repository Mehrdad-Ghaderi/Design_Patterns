package strategy.headfirst.duck.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Can't make a sound!");
    }
}
