public abstract class Subscription {
    protected String planName;
    protected double baseMonthlyPrice;

    public Subscription(String planName, double baseMonthlyPrice){
        this.baseMonthlyPrice = baseMonthlyPrice;
        this.planName = planName;
    }

    public void printInvoice(){
        System.out.println("Plan: " + planName + " | Base Price: $" + baseMonthlyPrice);
    }

    public abstract double calculateFinalPrice();
}
