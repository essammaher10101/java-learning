import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Factorial Number ");
        int factorial = input.nextInt();
        int result = factorial(factorial);
        System.out.println("Factorial Of (" + factorial + ") Is : " + result);

    }
    public static int factorial(int n){
        //Base Case
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}