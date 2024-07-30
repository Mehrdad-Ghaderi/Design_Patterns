package template.derekbanas;

public abstract class Hoagie {

    boolean afterFirstCondimen = false; // just to go to next line after printing
    final void makeSandwich(){
        cutBun();
        if (customerWantsMeat()) {
            addMeat();
            afterFirstCondimen = true;
        }
        if (customerWantsCheese()) {
            if (afterFirstCondimen) {
                System.out.println();
            }
            addCheese();
            afterFirstCondimen = true;
        }
        if (customerWantsVegetables()) {
            if (afterFirstCondimen) {
                System.out.println();
            }
            addVegetables();
            afterFirstCondimen = true;

        }
        if (customerWantsCondiments()) {
            if (afterFirstCondimen) {
                System.out.println();
            }
            addCondiment();
            afterFirstCondimen = true;

        }
        wrapTheHoagie();
    }

    public final void cutBun() {
        System.out.println("The Hoagie is Cut");
    }
    abstract void addMeat();

    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiment();

    boolean customerWantsMeat(){
        return true;
    }

    private boolean customerWantsCheese() {
        return true;
    }
    private boolean customerWantsVegetables() {
        return true;
    }
    private boolean customerWantsCondiments() {
        return true;
    }

    public final void wrapTheHoagie() {
        if (afterFirstCondimen) {
            System.out.println();
        }
        System.out.println("Wrapping the Hoagie");
        afterFirstCondimen = false;
    }
}
