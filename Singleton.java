public class Singleton {
    private static Singleton instance;  // Step 1: Static variable to hold single object

    private Singleton() {               // Step 2: Private constructor
        System.out.println("Singleton object created");
    }

    public static Singleton getInstance() {  // Step 3: Public static method
        if (instance == null) {
            instance = new Singleton();      // Object created only once
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();  // First call
        obj1.showMessage();

        Singleton obj2 = Singleton.getInstance();  // Second call
        obj2.showMessage();

        System.out.println(obj1 == obj2);          // Checking object identity
    }
}
