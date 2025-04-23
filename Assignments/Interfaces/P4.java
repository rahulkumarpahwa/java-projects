import java.util.ArrayList;
import java.util.List;

// Main class
public class P4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create accounts
        SavingsAccount savingsAccount = new SavingsAccount("Rahul Kumar", 1000);
        CurrentAccount currentAccount = new CurrentAccount("Lucky Dosanjh", 5000);

        // Add accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Perform operations
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.calculateInterest();
        savingsAccount.viewBalance();

        currentAccount.deposit(1000);
        currentAccount.withdraw(3000);
        currentAccount.viewBalance();

        // View all accounts in the bank
        bank.viewAllAccounts();
    }
}

// Interface for accounts
interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    void calculateInterest();

    void viewBalance();
}

// Bank class to manage accounts
class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account);
    }

    public void viewAllAccounts() {
        System.out.println("List of all accounts:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}

// SavingsAccount class implementing Account interface
class SavingsAccount implements Account {
    private String accountHolder;
    private double balance;
    private static final double INTEREST_RATE = 0.03; // 3% interest rate

    public SavingsAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest added to Savings Account. New balance: " + balance);
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}

// CurrentAccount class implementing Account interface
class CurrentAccount implements Account {
    private String accountHolder;
    private double balance;
    private static final double OVERDRAFT_LIMIT = 2000;

    public CurrentAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest is calculated for Current Account.");
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}