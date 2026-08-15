public class Account {
    protected String Account_Number;
    protected double balance;

    public Account(String  accountNumber, double balance) {
        this.Account_Number = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount >= 0){
            balance += amount;
            System.out.println("Deposited $ " + amount);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public void displayBalance() {
        System.out.println("Account Number: " + Account_Number + " | Current Balance: $" + balance);
    }

}
