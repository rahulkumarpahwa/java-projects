package Assignments.MultiThreading;

// Main class
public class P5 {
    public static void main(String[] args) {
        // Create a shared bank account
        BankAccount account = new BankAccount(1000); // Initial balance: 1000

        // Create multiple threads representing users
        Thread user1 = new Thread(new WithdrawTask(account, 500), "User1");
        Thread user2 = new Thread(new WithdrawTask(account, 700), "User2");
        Thread user3 = new Thread(new WithdrawTask(account, 300), "User3");

        // Start the threads
        user1.start();
        user2.start();
        user3.start();
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is attempting to withdraw: " + amount);

        if (amount <= balance) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
            balance -= amount;
            System.out
                    .println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount
                    + " but insufficient balance. Remaining balance: " + balance);
        }
    }
}

// WithdrawTask class implementing Runnable
class WithdrawTask implements Runnable {
    private BankAccount account;
    private double amount;

    public WithdrawTask(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
