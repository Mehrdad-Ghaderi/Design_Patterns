package chainofresponsibility.derekbanas.prac;

public class Subtract implements Chain {
    private Chain nextInchain;


    @Override
    public void setNextInChain(Chain nextInChain) {
        this.nextInchain = nextInChain;
    }

    @Override
    public int calculate(Function function) {
        if (function.getFunction().equals("-")) {
            return function.getNumber1() - function.getNumber2();
        } else return nextInchain.calculate(function);
    }
}
