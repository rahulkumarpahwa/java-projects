package Assignments.Basics.Extra;

// Base class
class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully");
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Derived class
class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000.0;
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName,
            double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        // Check minimum balance requirement
        if (balance - amount >= MIN_BALANCE) {
            return super.withdraw(amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of ₹" + MIN_BALANCE + " must be maintained");
            return false;
        }
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: ₹" + interest);
    }
}

// Main class to test the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Create a regular bank account
        BankAccount regularAccount = new BankAccount("BA001", "John Doe", 5000);
        System.out.println("Regular Bank Account:");
        regularAccount.displayBalance();

        regularAccount.deposit(2000);
        regularAccount.withdraw(3000);
        regularAccount.displayBalance();

        System.out.println("\n-----------------------\n");

        // Create a savings account
        SavingsAccount savingsAccount = new SavingsAccount("SA001", "Jane Smith", 10000, 4.5);
        System.out.println("Savings Account:");
        savingsAccount.displayBalance();

        savingsAccount.deposit(5000);
        savingsAccount.displayBalance();

        // Try to withdraw amount that would leave balance below minimum
        savingsAccount.withdraw(14500);

        // Try valid withdrawal
        savingsAccount.withdraw(5000);
        savingsAccount.displayBalance();

        // Apply interest
        savingsAccount.applyInterest();
        savingsAccount.displayBalance();
    }
}
