import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Bank_Account acc1 = new Bank_Account(101);
        Bank_Account acc2 = new Bank_Account(102);

        Bank_Account.BankPolicy policy = new Bank_Account.BankPolicy();

        policy.calculateTransactionFee(100);
        policy.calculateTransactionFee(5000);
    }
}