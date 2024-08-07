package chainofresponsibility;

public class Divide implements Chain{
    private Chain nextInChain;


    @Override
    public void setNextInChain(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public int calculate(Function function) {
        if (function.getFunction().equals("/")) {
            return function.getNumber1() / function.getNumber2();
        }
        else{  System.out.println("Unsupported operation");}
        return Integer.MAX_VALUE;
    }

}
