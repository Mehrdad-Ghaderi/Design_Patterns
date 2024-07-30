package singleton;

public class Singleton {

    //lazy
    private static Singleton instance;
    //eager
    //private static Singleton instance = new Singleton();

    private Singleton() {
    }

    //lazy get
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //double-checked
    //public static volatile Singleton instance;
    /*public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }*/


    //eager get
    /*public static synchronized Singleton getInstance() {
        return instance;
    }*/
}
