package builder;

public class User {
    private final String firstName;
    private final String lastName;
    private String id;
    private int age;
    private String phoneNumber;
    private String address;
    private boolean active;

    //The constructor of User takes in a Builder as the input parameter
    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.active = builder.active;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", active=" + active +
                '}';
    }

    /**
     * This is a Builder, which creates a Builder with all the properties of a User.
     * Once the desired fields are initialized, the Builder is then passed on to an actual
     * User constructor, and then the values in the Builder  will be assigned to all or some
     * of the properties of User.
     * All the methods of a Builder sre often parameterized
     * And they all return a Builder
     */
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String id;
        private int age;
        private String phoneNumber;
        private String address;
        private boolean active;

        public UserBuilder(String firstName, String lastName) { //input arguments are optional
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public UserBuilder id(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder active(boolean active) {
            this.active = active;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


}
