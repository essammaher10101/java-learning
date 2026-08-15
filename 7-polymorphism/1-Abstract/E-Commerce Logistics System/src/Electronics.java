public class Electronics extends Product implements WarrantyEligible{

    private int warrantyMonths;

    public Electronics(String name, double weight, double basePrice, int warrantyMonths) {
        super(name, weight, basePrice);
        this.warrantyMonths = warrantyMonths;
    }

    //abstract methode
    @Override
    public double calculateShippingCost() {
        return 10.0 + (weight * 1.5); // تكلفة ثابتة + وزن
    }

    //interface methode
    @Override
    public int getWarrantyMonths() {
        return this.warrantyMonths;
    }
    @Override
    public void applyWarrantyClaim() {
        System.out.println("Processing warranty claim for " + getName() + " (" + warrantyMonths + " months valid).");
    }

}
