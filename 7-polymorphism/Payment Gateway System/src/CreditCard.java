public class CreditCard extends PaymentMethod{

    private String cardHolder;
    private int cardNumber;

    CreditCard( String cardHolder, int cardNumber){
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount){
        System.out.println("Paid $" + amount + " using Credit Card ending with" + cardNumber % 1000);
    }

}
