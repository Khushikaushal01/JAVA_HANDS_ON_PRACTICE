public class StrategyTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Strategy Pattern ===");

        double totalCartAmount = 450.75;

        
        System.out.println("--- Scenario 1: Paying with Credit Card ---");
        PaymentStrategy ccStrategy = new CreditCardPayment(
                "Khushi Kaushal", 
                "1234567890123456", 
                "999", 
                "12/28"
        );
        PaymentContext context = new PaymentContext(ccStrategy);
        context.executePayment(totalCartAmount);
        System.out.println();

        
        System.out.println("--- Scenario 2: Swapping to PayPal ---");
        PaymentStrategy paypalStrategy = new PayPalPayment(
                "khushikaushal108@gmail.com", 
                "secure_pwd_123"
        );
        context.setPaymentStrategy(paypalStrategy);
        context.executePayment(totalCartAmount);

        System.out.println("=== Strategy Pattern Test Complete ===");
    }
}
