
//Eager Initialization
public class SingletonClass {

    private static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {

        return INSTANCE;
    }
}

// Lazy Initialization
public class SingletonClass {
    private static SingletonClass instance = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();

            return instance;

        }

    }

}