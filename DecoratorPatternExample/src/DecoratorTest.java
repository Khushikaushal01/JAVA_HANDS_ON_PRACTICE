public class DecoratorTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Decorator Pattern ===");

        
        System.out.println("--- Scenario 1: Only Email Notifier ---");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello World!");
        System.out.println();

        
        System.out.println("--- Scenario 2: Email + SMS Notifier ---");
        Notifier emailPlusSms = new SMSNotifierDecorator(new EmailNotifier());
        emailPlusSms.send("System maintenance starting in 10 mins.");
        System.out.println();

        
        System.out.println("--- Scenario 3: Email + SMS + Slack Notifier ---");
        Notifier allChannels = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        allChannels.send("CRITICAL: Server is down!");
        System.out.println();

        
        System.out.println("--- Scenario 4: Email + Slack Notifier ---");
        Notifier emailPlusSlack = new SlackNotifierDecorator(new EmailNotifier());
        emailPlusSlack.send("New team member joined.");
        
        System.out.println("=== Decorator Pattern Test Complete ===");
    }
}
