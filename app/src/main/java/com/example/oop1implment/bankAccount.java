package com.example.oop1implment;

public class bankAccount {
    public static class BankAccount {
        private String accountID;
        private double balance;

        // Constructor with balance
        public BankAccount(String accountID, double balance) {
            this.accountID = accountID;
            this.balance = balance;
        }

        // No-argument constructor (balance is set to 0)
        public BankAccount(String accountID) {
            this.accountID = accountID;
            this.balance = 0;
        }

        // Getter for accountID
        public String getAccountID() {
            return accountID;
        }

        // Setter for accountID
        public void setAccountID(String accountID) {
            this.accountID = accountID;
        }

        // Getter for balance
        public double getBalance() {
            return balance;
        }

        // Setter for balance
        public void setBalance(double balance) {
            this.balance = balance;
        }

        // Withdraw method
        public boolean withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                return true; // Successful withdrawal
            } else {
                return false; // Insufficient funds
            }
        }

        // Deposit method
        public void deposit(double amount) {
            balance += amount;
        }

        // Example usage
        public void main(String[] args) {
            // Create an account with an initial balance of 500
            BankAccount account = new BankAccount("123456", 500);

            // Deposit money
            account.deposit(200);
            System.out.println("Balance after deposit: " + account.getBalance());  // Output: 700.0

            // Withdraw money
            boolean success = account.withdraw(300);
            System.out.println("Withdrawal success: " + success + ", Remaining balance: " + account.getBalance());  // Output: true, 400.0

            // Try to withdraw more than the balance
            success = account.withdraw(500);
            System.out.println("Withdrawal success: " + success + ", Remaining balance: " + account.getBalance());  // Output: false, 400.0
        }
    }

}
