package builder;

import builder.withinterface.Person;

public class Main {

    public static void main(String[] args) {

        User user = new User
                .UserBuilder("Mehrdad", "G")
                .id("123654789")
                .age(40)
                .active(true)
                .address("Toronto")
                .phoneNumber("111 111 1111")
                .build();

        System.out.println(user);

        //with interface
        Person person = new Person.Builder("Mehrdad", "G")
                .address("Mont")
                .age(39)
                .phoneNumber("222 222 2222")
                .build();
        System.out.println(person);
    }
}
