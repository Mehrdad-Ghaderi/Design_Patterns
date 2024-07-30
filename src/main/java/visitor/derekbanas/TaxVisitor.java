package visitor.derekbanas;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor() {
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor: Price with Tax");
        return Double.parseDouble(decimalFormat.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco: Price with Tax");
        return Double.parseDouble(decimalFormat.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }


    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessiti: Price with Tax");
        return Double.parseDouble(decimalFormat.format((necessityItem.getPrice() * 0) + necessityItem.getPrice()));
    }
}
