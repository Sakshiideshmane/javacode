package StudentManagement;

public class Student {
	    private int id;
	    private String name;
	    private int age;
	    private String grade;
	    private String subjects;
	    private String contact;

	    // Constructor
	    public Student(int id, String name, int age, String grade, String subjects, String contact) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.grade = grade;
	        this.subjects = subjects;
	        this.contact = contact;
	    }

	    // Getters and Setters (Encapsulation)
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }

	    public String getSubjects() {
	        return subjects;
	    }

	    public void setSubjects(String subjects) {
	        this.subjects = subjects;
	    }

	    public String getContact() {
	        return contact;
	    }

	    public void setContact(String contact) {
	        this.contact = contact;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade +
	               ", Subjects: " + subjects + ", Contact: " + contact;
	    }
	
}
