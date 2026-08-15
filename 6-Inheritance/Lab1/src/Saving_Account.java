public class Saving_Account extends Account {
    private double interestRate;

    public Saving_Account(String accountNumber, double balance,double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(){
    }
}
