public abstract class Product {
    private String name;
    protected double weight;
    protected double basePrice;

    public Product(String name, double weight, double basePrice) {
        this.name = name;
        this.weight = weight;
        this.basePrice = basePrice;
    }
    public String getName() {
        return this.name;
    }

    public void printDetails() {
        System.out.println("Product: " + name + " | Weight: " + weight + "kg | Price: $" + basePrice);
    }
    public abstract double calculateShippingCost();
}
