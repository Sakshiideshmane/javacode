package StudentManagement;

import java.util.*;
import java.util.stream.Collectors;

public class StudentManager {
	    private List<Student> students = new ArrayList<>();
	    private int nextId = 1;

	    // Add a new student
	    public void addStudent(String name, int age, String grade, String subjects, String contact) {
	        students.add(new Student(nextId++, name, age, grade, subjects, contact));
	        System.out.println("Student added successfully!");
	    }

	    // View all students
	    public void viewStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students found.");
	            return;
	        }
	        students.forEach(System.out::println);
	    }

	    // Update a student's information
	    public void updateStudent(int id, String name, int age, String grade, String subjects, String contact) {
	        for (Student student : students) {
	            if (student.getId() == id) {
	                student.setName(name);
	                student.setAge(age);
	                student.setGrade(grade);
	                student.setSubjects(subjects);
	                student.setContact(contact);
	                System.out.println("Student updated successfully!");
	                return;
	            }
	        }
	        System.out.println("Student not found.");
	    }

	    // Delete a student
	    public void deleteStudent(int id) {
	        students.removeIf(student -> student.getId() == id);
	        System.out.println("Student deleted successfully!");
	    }

	    // Search students by name
	    public void searchStudent(String name) {
	        List<Student> results = students.stream()
	                .filter(student -> student.getName().equalsIgnoreCase(name))
	                .collect(Collectors.toList());
	        if (results.isEmpty()) {
	            System.out.println("No students found with name: " + name);
	        } else {
	            results.forEach(System.out::println);
	        }
	    }

}
