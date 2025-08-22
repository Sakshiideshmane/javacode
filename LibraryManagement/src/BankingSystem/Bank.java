package BankingSystem;

import java.util.HashMap;

public class Bank {
	    private HashMap<Integer, Account> accounts = new HashMap<>();
	    private int nextAccountNumber = 1001;

	    // Create a new account
	    public int createAccount(String name) {
	        int accountNumber = nextAccountNumber++;
	        accounts.put(accountNumber, new Account(accountNumber, name));
	        System.out.println("Account created successfully! Account Number: " + accountNumber);
	        return accountNumber;
	    }

	    // Deposit money
	    public void deposit(int accountNumber, double amount) {
	        Account account = accounts.get(accountNumber);
	        if (account != null) {
	            account.deposit(amount);
	            System.out.println("Deposited $" + amount + " to account " + accountNumber);
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    // Withdraw money
	    public void withdraw(int accountNumber, double amount) {
	        Account account = accounts.get(accountNumber);
	        if (account != null) {
	            if (account.withdraw(amount)) {
	                System.out.println("Withdrew $" + amount + " from account " + accountNumber);
	            } else {
	                System.out.println("Insufficient funds in account " + accountNumber);
	            }
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    // Transfer money
	    public void transfer(int fromAccount, int toAccount, double amount) {
	        Account sender = accounts.get(fromAccount);
	        Account receiver = accounts.get(toAccount);

	        if (sender == null || receiver == null) {
	            System.out.println("One or both accounts not found.");
	            return;
	        }

	        if (sender.withdraw(amount)) {
	            receiver.deposit(amount);
	            System.out.println("Transferred $" + amount + " from account " + fromAccount + " to account " + toAccount);
	        } else {
	            System.out.println("Insufficient funds in account " + fromAccount);
	        }
	    }

	    // View account details
	    public void viewAccount(int accountNumber) {
	        Account account = accounts.get(accountNumber);
	        if (account != null) {
	            System.out.println(account);
	            System.out.println("--- Transaction History ---");
	            account.getTransactionHistory().forEach(System.out::println);
	        } else {
	            System.out.println("Account not found.");
	        }
	    }

	    // View all accounts
	    public void viewAllAccounts() {
	        System.out.println("\n--- All Accounts ---");
	        accounts.values().forEach(System.out::println);
	    }

}
