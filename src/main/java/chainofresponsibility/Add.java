package chainofresponsibility;

public class Add implements Chain {
    private Chain nextInChain;


    @Override
    public void setNextInChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public int calculate(Function function) {
        if (function.getFunction().equals("+")) {
            return function.getNumber1() + function.getNumber2();
        } else {
            return nextInChain.calculate(function);
        }

    }
}
