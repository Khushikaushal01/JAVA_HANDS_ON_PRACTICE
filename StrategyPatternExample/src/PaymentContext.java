public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    
    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Error: Payment strategy not selected.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
