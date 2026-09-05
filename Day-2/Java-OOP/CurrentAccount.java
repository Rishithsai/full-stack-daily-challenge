public class CurrentAccount extends BankAccount {

    private double overdraftLimit;

    // Constructor
    public CurrentAccount(
            String accountNumber,
            String accountHolderName,
            double balance,
            double overdraftLimit) {

        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid withdrawal amount.");

        } else if (amount > getBalance() + overdraftLimit) {

            System.out.println("Withdrawal exceeds overdraft limit.");

        } else {

            double newBalance = getBalance() - amount;

            setBalance(newBalance);

            System.out.println("Withdrawn: " + amount);
        }
    }

    // Override displayAccountDetails
    @Override
    public void displayAccountDetails() {

        super.displayAccountDetails();

        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
