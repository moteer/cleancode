package de.kodschul.cleancode.encapsulation.bad;

/**
 * Enhance encapsulation of this class
 */
class BankAccount {
    public String accountHolder;
    public double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount; // Directly modifying the balance
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; // Directly modifying the balance
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}
