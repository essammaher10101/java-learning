public class Product {
    private String name;
    private double price;
    protected double discountPercentage = 0.10;
    static {
        System.out.println("System Initialized");
    }

    {
        System.out.println("New Product Created");
    }

    public double calculateDiscountedPrice(double price) {
        return price - (price * discountPercentage);
    }
    @Override
    public String toString(){
        System.out.println("Name: " + name + ", Price: " + price);
        return null;
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Double.compare(product.price, price) == 0 && name.equals(product.name);
    }
}
