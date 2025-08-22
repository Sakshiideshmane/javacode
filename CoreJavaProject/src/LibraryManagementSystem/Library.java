package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	    private ArrayList<Book> books = new ArrayList<>();
	    private HashMap<Integer, User> users = new HashMap<>();
	    private int nextBookId = 1;
	    private int nextUserId = 101;

	    // Add a new book
	    public void addBook(String title, String author) {
	        Book book = new Book(nextBookId++, title, author);
	        books.add(book);
	        System.out.println("Book added successfully: " + book);
	    }

	    // Register a new user
	    public int registerUser(String name) {
	        int userId = nextUserId++;
	        users.put(userId, new User(userId, name));
	        System.out.println("User registered successfully: " + name + " (ID: " + userId + ")");
	        return userId;
	    }

	    // Issue a book
	    public void issueBook(int bookId, int userId) {
	        Book book = findBookById(bookId);
	        User user = users.get(userId);

	        if (book == null || user == null) {
	            System.out.println("Invalid book ID or user ID.");
	            return;
	        }

	        if (!book.isAvailable()) {
	            System.out.println("Book is already issued.");
	            return;
	        }

	        book.setAvailable(false);
	        user.borrowBook(book);
	        System.out.println("Book issued successfully to " + user.getName());
	    }

	    // Return a book
	    public void returnBook(int bookId, int userId) {
	        Book book = findBookById(bookId);
	        User user = users.get(userId);

	        if (book == null || user == null || !user.getBorrowedBooks().contains(book)) {
	            System.out.println("Invalid return request.");
	            return;
	        }

	        book.setAvailable(true);
	        user.returnBook(book);
	        System.out.println("Book returned successfully by " + user.getName());
	    }

	    // Find a book by ID
	    private Book findBookById(int bookId) {
	        return books.stream().filter(book -> book.getBookId() == bookId).findFirst().orElse(null);
	    }

	    // Display all books
	    public void displayBooks() {
	        System.out.println("\n--- Library Catalog ---");
	        books.forEach(System.out::println);
	    }

	    // Display user details
	    public void displayUserDetails(int userId) {
	        User user = users.get(userId);
	        if (user != null) {
	            System.out.println(user);
	            System.out.println("--- Borrowed Books ---");
	            user.getBorrowedBooks().forEach(System.out::println);
	        } else {
	            System.out.println("User not found.");
	        }
	    }
}
