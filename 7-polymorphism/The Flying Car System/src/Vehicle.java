public class Vehicle {
    protected String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    Truck(String brand, double loadCapacity) {
        super(brand);
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
