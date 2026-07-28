public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Singleton Pattern ===");

        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        
        System.out.println("Logger 1 HashCode: " + logger1.hashCode());
        System.out.println("Logger 2 HashCode: " + logger2.hashCode());

        
        if (logger1 == logger2) {
            System.out.println("SUCCESS: Both logger1 and logger2 point to the same instance.");
        } else {
            System.out.println("FAILURE: logger1 and logger2 point to different instances.");
        }

        
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");
        
        System.out.println("=== Singleton Pattern Test Complete ===");
    }
}
