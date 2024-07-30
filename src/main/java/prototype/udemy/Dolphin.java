package prototype.udemy;

public class Dolphin implements Prototype {

    private String name;
    private int age;

    public Dolphin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Dolphin(name, age);
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
