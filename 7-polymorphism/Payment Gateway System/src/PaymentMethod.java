public class PaymentMethod {
    private double amount;

    PaymentMethod(){
    }
    public void processPayment(double amount){
        System.out.println("Processing a generic payment of $" + amount);
    }
}
