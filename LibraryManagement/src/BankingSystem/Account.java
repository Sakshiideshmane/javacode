package BankingSystem;

import java.util.ArrayList;

public class Account {
	    private int accountNumber;
	    private String accountHolderName;
	    private double balance;
	    private ArrayList<String> transactionHistory;

	    // Constructor
	    public Account(int accountNumber, String accountHolderName) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = 0.0;
	        this.transactionHistory = new ArrayList<>();
	        this.transactionHistory.add("Account created with initial balance: $0.00");
	    }

	    // Getters and Setters
	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        transactionHistory.add("Deposited: $" + amount + ", New Balance: $" + balance);
	    }

	    public boolean withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            transactionHistory.add("Withdrew: $" + amount + ", New Balance: $" + balance);
	            return true;
	        } else {
	            transactionHistory.add("Failed Withdrawal: $" + amount + ", Insufficient Funds");
	            return false;
	        }
	    }

	    public ArrayList<String> getTransactionHistory() {
	        return transactionHistory;
	    }

	    @Override
	    public String toString() {
	        return "Account [Account Number=" + accountNumber + ", Account Holder=" + accountHolderName +
	               ", Balance=$" + balance + "]";
	    }

}
