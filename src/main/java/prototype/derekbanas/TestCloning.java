package prototype.derekbanas;

public class TestCloning {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();
        Sheep cloneSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(cloneSheep);

        System.out.println("Sally hash: " + sally.hashCode());
        System.out.println("Clone hash: " + cloneSheep.hashCode());
    }
}
