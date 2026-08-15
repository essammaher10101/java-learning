//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing SavingAccount ---");
        Saving_Account savings = new Saving_Account("SAV123", 1000.0, 5.0); // 5% interest rate
        savings.displayBalance();
        savings.deposit(500);
        savings.addInterest();
        savings.displayBalance();

        System.out.println("\n--- Testing LoanAccount ---");
        LoanAccount loan = new LoanAccount("LN987", 5000.0); // $5000 loan debt
        loan.displayBalance();
        loan.payEMI(500);
        loan.displayBalance();
    }
}