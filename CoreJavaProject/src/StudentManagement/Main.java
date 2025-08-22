package StudentManagement;

import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        StudentManager manager = new StudentManager();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Student Information Management System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. View All Students");
	            System.out.println("3. Update Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Search Student");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Age: ");
	                    int age = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter Grade: ");
	                    String grade = scanner.nextLine();
	                    System.out.print("Enter Subjects: ");
	                    String subjects = scanner.nextLine();
	                    System.out.print("Enter Contact: ");
	                    String contact = scanner.nextLine();
	                    manager.addStudent(name, age, grade, subjects, contact);
	                    break;
	                case 2:
	                    manager.viewStudents();
	                    break;
	                case 3:
	                    System.out.print("Enter Student ID to Update: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter Name: ");
	                    name = scanner.nextLine();
	                    System.out.print("Enter Age: ");
	                    age = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.print("Enter Grade: ");
	                    grade = scanner.nextLine();
	                    System.out.print("Enter Subjects: ");
	                    subjects = scanner.nextLine();
	                    System.out.print("Enter Contact: ");
	                    contact = scanner.nextLine();
	                    manager.updateStudent(id, name, age, grade, subjects, contact);
	                    break;
	                case 4:
	                    System.out.print("Enter Student ID to Delete: ");
	                    id = scanner.nextInt();
	                    manager.deleteStudent(id);
	                    break;
	                case 5:
	                    System.out.print("Enter Name to Search: ");
	                    name = scanner.nextLine();
	                    manager.searchStudent(name);
	                    break;
	                case 6:
	                    System.out.println("Exiting... Thank you!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

}
