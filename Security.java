import java.util.*;

// Student class
class Student {
    private String username;
    private String password;
    private double cgpa;

    public Student(String username, String password, double cgpa) {
        this.username = username;
        this.password = password;
        this.cgpa = cgpa;
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public double getCGPA() {
        return cgpa;
    }
}

// Main system
public class SecureStudentSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample student database
        List<Student> students = new ArrayList<>();
        students.add(new Student("student1", "pass1", 8.5));
        students.add(new Student("student2", "pass2", 9.2));

        System.out.println("=== Secure Student Login ===");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        Student loggedInStudent = null;

        // Authenticate user
        for (Student s : students) {
            if (s.getUsername().equals(username) && s.validatePassword(password)) {
                loggedInStudent = s;
                break;
            }
        }

        if (loggedInStudent != null) {
            System.out.println("\nLogin successful!");

            // Only show THIS student's data
            System.out.println("\n=== Your Academic Details ===");
            System.out.println("Username: " + loggedInStudent.getUsername());
            System.out.println("CGPA: " + loggedInStudent.getCGPA());

            System.out.println("\n⚠️ You cannot view other students' data (Security enforced)");

        } else {
            System.out.println("\nInvalid login! Access denied.");
        }

        scanner.close();
    }
}