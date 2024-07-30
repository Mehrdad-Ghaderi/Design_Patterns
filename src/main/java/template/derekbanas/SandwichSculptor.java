package template.derekbanas;

public class SandwichSculptor {

    public static void main(String[] args) {
        Hoagie customer12 = new ItalianHoagie();
        customer12.makeSandwich();
        System.out.println("\n");
        Hoagie customer13 = new VeggieHoagie();
        customer13.makeSandwich();
    }
}
