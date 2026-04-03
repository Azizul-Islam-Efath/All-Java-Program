public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        CreditCardStrategy creditCard = new CreditCardStrategy("1234-5678-9876-5432");
        PayPalStrategy payPal = new PayPalStrategy("user@example.com");

        cart.setPaymentStrategy(creditCard);
        cart.checkout(100);

        cart.setPaymentStrategy(payPal);
        cart.checkout(200);
    }
}
