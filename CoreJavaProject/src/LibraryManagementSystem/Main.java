package LibraryManagementSystem;

import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Library library = new Library();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Library Management System ---");
	            System.out.println("1. Add Book");
	            System.out.println("2. Register User");
	            System.out.println("3. Issue Book");
	            System.out.println("4. Return Book");
	            System.out.println("5. Display Books");
	            System.out.println("6. Display User Details");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Book Title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter Book Author: ");
	                    String author = scanner.nextLine();
	                    library.addBook(title, author);
	                    break;
	                case 2:
	                    System.out.print("Enter User Name: ");
	                    String name = scanner.nextLine();
	                    library.registerUser(name);
	                    break;
	                case 3:
	                    System.out.print("Enter Book ID: ");
	                    int bookId = scanner.nextInt();
	                    System.out.print("Enter User ID: ");
	                    int userId = scanner.nextInt();
	                    library.issueBook(bookId, userId);
	                    break;
	                case 4:
	                    System.out.print("Enter Book ID: ");
	                    bookId = scanner.nextInt();
	                    System.out.print("Enter User ID: ");
	                    userId = scanner.nextInt();
	                    library.returnBook(bookId, userId);
	                    break;
	                case 5:
	                    library.displayBooks();
	                    break;
	                case 6:
	                    System.out.print("Enter User ID: ");
	                    userId = scanner.nextInt();
	                    library.displayUserDetails(userId);
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
