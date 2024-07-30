package strategy.headfirst.duck.quack;

public class NorthenDuckQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Northern quack");
    }
}
