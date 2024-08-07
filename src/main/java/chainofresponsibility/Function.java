package chainofresponsibility;

public class Function {
    private int number1;
    private int number2;
    private String function;

    public Function(int number1, int number2, String function) {
        this.number1 = number1;
        this.number2 = number2;
        this.function = function;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getFunction() {
        return function;
    }

}
