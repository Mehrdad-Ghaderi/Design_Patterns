package chainofresponsibility;

public interface Chain {

    void setNextInChain(Chain nextInChain);
    int calculate(Function function);
}
