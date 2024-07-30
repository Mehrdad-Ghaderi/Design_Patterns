package facade.udemy.subsystem;

public class CPU {
    public void freeze() {
        System.out.println("Computer freezing");
    }

    public void jump(long position) {
        System.out.println("jumping to " + position);
    }
    public void execute() {
        System.out.println("Computer executing commands ...");
    }
}
