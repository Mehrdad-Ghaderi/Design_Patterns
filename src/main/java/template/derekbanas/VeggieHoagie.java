package template.derekbanas;

public class VeggieHoagie extends Hoagie {
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Pepper"};
    String[] condimentsUsed = {"Oil", "Vinegar"};


    boolean customerWantsMeat(){
        return false;
    }

    private boolean customerWantsCheese() {
        return false;
    }
    @Override
    void addMeat() { //Do nothing
    }

    @Override
    void addCheese() { // Do nothing

    }

    @Override
    void addVegetables() {
        System.out.print("Adding the Veggies: ");
        for (String veggie : veggiesUsed) {
            System.out.print(veggie + " ");
        }

    }

    @Override
    void addCondiment() {
        System.out.print("Adding the Condiments: ");
        for (String condiment : condimentsUsed) {
            System.out.print(condiment + " ");
        }

    }

}
