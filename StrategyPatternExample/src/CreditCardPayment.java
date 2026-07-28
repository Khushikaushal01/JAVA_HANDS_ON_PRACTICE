public class CreditCardPayment implements PaymentStrategy {
    private final String cardHolderName;
    private final String cardNumber;
    private final String cvv;
    private final String expiryDate;

    public CreditCardPayment(String cardHolderName, String cardNumber, String cvv, String expiryDate) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount + "...");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + maskCardNumber(cardNumber));
        System.out.println("Status: Approved!");
    }

    private String maskCardNumber(String number) {
        if (number == null || number.length() < 4) return "****";
        return "**** **** **** " + number.substring(number.length() - 4);
    }
}
