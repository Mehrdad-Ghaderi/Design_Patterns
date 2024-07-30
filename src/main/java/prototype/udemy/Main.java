package prototype.udemy;

public class Main {

    public static void main(String[] args) {
    prototype.udemy.javalib.Person person = new prototype.udemy.javalib.Person("sam", 25);
        System.out.println(person);
        prototype.udemy.javalib.Person person2 = (prototype.udemy.javalib.Person) person.clone();
        System.out.println(person2);

/*
        //Incorrect udemy version
        Person selda = new Person("Selda", 25);
        System.out.println("Person 1: " + selda);

        Person nina = (Person) selda.clone();
        System.out.println("Person 2: " + nina);

        Dolphin sam = new Dolphin("Sam", 45);
        System.out.println("Dolphin 2: " + sam);

        Dolphin jerry = (Dolphin) sam.clone();
        System.out.println("Dolphin 2: " + jerry);
*/



    }
}
