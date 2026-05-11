import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car car = new Car();
        System.out.println(car.color);
        Car car1 = new Car("Red");
        System.out.println(car1.color);

    }
}
