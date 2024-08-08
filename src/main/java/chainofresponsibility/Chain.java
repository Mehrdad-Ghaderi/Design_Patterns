package chainofresponsibility;

/**
 *The Chain interface can be implemented by classes which are expected to fo the calculation.
 * Any class implementing this can have its own implementation of the method 'calculate().'
 * If the calculation is done, the chain ends right there. If the calculation cannot be done
 * by the class, the function will be passed to the next class that is set in nextInChain variable,
 * and the function then will be calculated by the class. This will continue until either one of
 * the classes implementing Chain can do the calculation.
 */
public interface Chain {

    void setNextInChain(Chain nextInChain);
    int calculate(Function function);
}
