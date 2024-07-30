package mvc.johnpurcell.modelviewcontroller.model;

public class Person {
    private int id;
    private String name;
    private String password;

    public Person() {
    }

    public void Person(String name, String Password) {
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
