public class PaymentTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        context.executePayment(2500.00);

        // Paying with PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(1450.75);
    }
}
