public class ChemicalProduct extends Product implements HazardousMaterial {
    private String permitNumber;

    public ChemicalProduct(String name, double weight, double basePrice, String permitNumber) {
        super(name, weight, basePrice);
        this.permitNumber = permitNumber;

    }

    //Abstract Class
    @Override
    public double calculateShippingCost() {
        // تكلفة شحن المنتجات الكيميائية أعلى + رسوم الأمان
        return 50.0 + (weight * 5.0) + getHazardSafetyFee();
    }

    //interface class
    @Override
    public double getHazardSafetyFee() {
        return 25.00;
    }

    @Override
    public String getSafetyPermitNumber() {
        return this.permitNumber;
    }


}
