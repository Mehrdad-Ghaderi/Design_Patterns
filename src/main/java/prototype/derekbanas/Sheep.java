package prototype.derekbanas;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being cloned");
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return sheep;
    }

    @Override
    public String toString() {
        return "sheep is here";
    }
}
