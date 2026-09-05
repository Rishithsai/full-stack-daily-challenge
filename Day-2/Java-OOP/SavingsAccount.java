public class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public SavingsAccount(
            String accountNumber,
            String accountHolderName,
            double balance,
            double interestRate) {

        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Add interest
    public void addInterest() {

        double interest = getBalance() * interestRate / 100;

        deposit(interest);

        System.out.println("Interest added: " + interest);
    }

    // Override displayAccountDetails
    @Override
    public void displayAccountDetails() {

        super.displayAccountDetails();

        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
