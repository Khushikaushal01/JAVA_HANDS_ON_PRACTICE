public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Adapter Pattern ===");

        
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        payPalProcessor.processPayment(150.00);

        
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        stripeProcessor.processPayment(250.50);

        System.out.println("=== Adapter Pattern Test Complete ===");
    }
}
