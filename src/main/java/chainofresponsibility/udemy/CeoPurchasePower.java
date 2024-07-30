package chainofresponsibility.udemy;

public class CeoPurchasePower extends PurchasePower{
    @Override
    protected double getAllowable() {
        return BASE * 100000;
    }

    @Override
    protected String getRole() {
        return "CEO";
    }
}
