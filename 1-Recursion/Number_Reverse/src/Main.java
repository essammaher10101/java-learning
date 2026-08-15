import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       int number = 12345;
       int reversedNumber = reverse1(number);
       System.out.println("Original number: " + number);
       System.out.println("Reversed number: " + reversedNumber);
    }




    public static int reverse1(int num) {
        if (num < 10) {
            return num;
        }
        return (num % 10) * (int) Math.pow(10, (int) Math.log10(num)) + reverse1(num / 10);
    }
}
