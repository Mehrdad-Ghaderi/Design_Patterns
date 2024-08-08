package chainofresponsibility;

/**
 * This class implements Chain, so it has to implement the methods in Chain.java
 * If the Function passed to calculate method is +, the calculation is done in
 * in this class; otherwise, the next class set in nextInChain will take care of
 * the Function.
 */
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
