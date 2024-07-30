package prototype.udemy.javalib;

public class Person implements Animal{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hi");
    }

    @Override
    public Animal clone() {
        Person person = null;

        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return person;
    }

}
