import java.util.logging.Logger;

public class LoggingDemo {

    private static final Logger logger =
            Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {

        logger.info("Application Started");

        logger.warning("This is a Warning Message");

        logger.severe("This is an Error Message");

        System.out.println("Program Executed Successfully");
    }
}