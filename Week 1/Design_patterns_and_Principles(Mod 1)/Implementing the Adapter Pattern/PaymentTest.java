public class PaymentTest {
    public static void main(String[] args) {
        // Using PayPal
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(2500);

        // Using Stripe
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(4300);
    }
}
