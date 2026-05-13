public interface Flayable {
    void fly();
    default void land() {
        System.out.println("Landing safely");
    }
}

class FlingCar implements Flayable {
    @Override
    public void fly() {
        System.out.println("The flying car is taking off!");
    }

    public void land() {
        System.out.println("The flying car is landing smoothly!");
    }
}
