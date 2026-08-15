import static java.lang.Math.max;

public class Bank_Account {
    private final int AccountNumber;
    private static final String Bank_Name = "Al_Ahli_Bank";
    private static int totalAccountsCreated;

    public Bank_Account(int AccountNumber){
        this.AccountNumber = AccountNumber;
        totalAccountsCreated++;
    }
    static class BankPolicy{
        public void calculateTransactionFee(double amount) {
           double fee = max(5.0,amount * 0.02);
           System.out.println("BankName : " + Bank_Name);
           System.out.println("Fee of (" + amount + ")Is : " + fee + "Pounds.");
        }
    }
}
