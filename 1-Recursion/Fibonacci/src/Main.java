import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The fibonacci Number :");
        int number = input.nextInt();

        System.out.println("Fibonacci (" + number + ") : " + Fibonacci(number) );
    }
    public static long Fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}