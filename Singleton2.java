public class Singleton2 {
    private static Singleton2 instance = null;
    private int value;

    private Singleton2() {
        // Private constructor to prevent instantiation
    }

    public static Singleton2 get() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public static void destruct() {
        instance = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
