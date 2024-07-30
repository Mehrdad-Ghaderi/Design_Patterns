package visitor.derekbanas;

public class VisitorTest {
    public static void main(String[] args) {
        TaxVisitor taxCalc = new TaxVisitor();
        TaxHoliday taxHolidayCals = new TaxHoliday();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigarette = new Tobacco(19.99);

        System.out.println(milk.accept(taxCalc));
        System.out.println(vodka.accept(taxCalc));
        System.out.println(cigarette.accept(taxCalc));

        System.out.println("TAX HOLIDAY PRICES");

        System.out.println(milk.accept(taxHolidayCals));
        System.out.println(vodka.accept(taxHolidayCals));
        System.out.println(cigarette.accept(taxHolidayCals));

    }
}
