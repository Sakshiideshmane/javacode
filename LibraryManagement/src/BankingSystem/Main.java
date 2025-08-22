package BankingSystem;

import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Bank bank = new Bank();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Banking System ---");
	            System.out.println("1. Create Account");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Transfer Money");
	            System.out.println("5. View Account Details");
	            System.out.println("6. View All Accounts");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Account Holder Name: ");
	                    String name = scanner.nextLine();
	                    bank.createAccount(name);
	                    break;
	                case 2:
	                    System.out.print("Enter Account Number: ");
	                    int accountNumber = scanner.nextInt();
	                    System.out.print("Enter Amount to Deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    bank.deposit(accountNumber, depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter Account Number: ");
	                    accountNumber = scanner.nextInt();
	                    System.out.print("Enter Amount to Withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    bank.withdraw(accountNumber, withdrawAmount);
	                    break;
	                case 4:
	                    System.out.print("Enter Sender Account Number: ");
	                    int fromAccount = scanner.nextInt();
	                    System.out.print("Enter Receiver Account Number: ");
	                    int toAccount = scanner.nextInt();
	                    System.out.print("Enter Amount to Transfer: ");
	                    double transferAmount = scanner.nextDouble();
	                    bank.transfer(fromAccount, toAccount, transferAmount);
	                    break;
	                case 5:
	                    System.out.print("Enter Account Number: ");
	                    accountNumber = scanner.nextInt();
	                    bank.viewAccount(accountNumber);
	                    break;
	                case 6:
	                    bank.viewAllAccounts();
	                    break;
	                case 7:
	                    System.out.println("Exiting... Thank you!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

}
