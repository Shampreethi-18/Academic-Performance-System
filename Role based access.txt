import java.util.Scanner;

class User {
    private String username;
    private String role;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Assigned Role: " + role);
    }

    public void accessSystem() {
        System.out.println("\n=== Access Control ===");

        switch (role) {
            case "Student":
                System.out.println(username + " can access: View CGPA, View Academic Status");
                break;
            case "Faculty":
                System.out.println(username + " can access: Enter Grades, Update Subject Records");
                break;
            case "Admin":
                System.out.println(username + " can access: Manage Users, Assign Roles, Generate Reports");
                break;
            default:
                System.out.println("No valid role assigned.");
        }
    }
}

public class RoleBasedAccessSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Administrator Role Assignment Module ===");

        // Admin enters username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Admin selects role
        System.out.println("Select Role to Assign:");
        System.out.println("1. Student");
        System.out.println("2. Faculty");
        System.out.println("3. Admin");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();

        String assignedRole;

        switch (choice) {
            case 1:
                assignedRole = "Student";
                break;
            case 2:
                assignedRole = "Faculty";
                break;
            case 3:
                assignedRole = "Admin";
                break;
            default:
                System.out.println("Invalid role selection. Role assignment failed.");
                scanner.close();
                return;
        }

        // Create user and assign role
        User user = new User(username, assignedRole);

        System.out.println("\nRole assigned successfully!");
        user.displayUserInfo();

        // Show authorized access
        user.accessSystem();

        scanner.close();
    }
}