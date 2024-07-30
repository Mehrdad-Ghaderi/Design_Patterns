package strategy.headfirst.duck.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quacking!");
    }


}
