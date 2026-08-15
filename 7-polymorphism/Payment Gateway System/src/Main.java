//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the E-Commerce Store ===\n");

        PaymentMethod card = new CreditCard("Ahmed", 12345678);
        PaymentMethod paypal = new PayPal("ahmed@example.com");

        ShoppingCart.checkout(card, 150.00);

        ShoppingCart.checkout(paypal, 45.50);

    }

    class ShoppingCart {
        // Accepts any PaymentMethod (Polymorphic parameter)
        public static void checkout(PaymentMethod method, double amount) {
            System.out.println("--- Starting Checkout Process ---");
            method.processPayment(amount); // Calls the correct overridden method at runtime
            System.out.println("--- Checkout Completed ---\n");
        }
    }
}