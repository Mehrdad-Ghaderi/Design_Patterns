package visitor.derekbanas;

import java.text.DecimalFormat;

//This class is the same as TaxVisitor but specific for holidays, on which tax rates are different
public class TaxHoliday implements Visitor{
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxHoliday() {
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor: Price with Tax");
        return Double.parseDouble(decimalFormat.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco: Price with Tax");
        return Double.parseDouble(decimalFormat.format((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice()));
    }


    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity: Price with Tax");
        return Double.parseDouble(decimalFormat.format((necessityItem.getPrice() * 0) + necessityItem.getPrice()));
    }

}
