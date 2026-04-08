import java.util.Scanner;

public class SecureLoginSystem {

    // Hardcoded valid credentials (for demo purpose)
    private static final String VALID_USERNAME = "student1";
    private static final String VALID_PASSWORD = "pass123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int attempts = 3;
        boolean loginSuccess = false;

        System.out.println("=== Secure Login System ===");

        while (attempts > 0) {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            // Validate credentials
            if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                loginSuccess = true;
                System.out.println("\nLogin Successful! Access Granted.");
                break;
            } else {
                attempts--;
                System.out.println("\nInvalid Username or Password.");
                if (attempts > 0) {
                    System.out.println("Attempts remaining: " + attempts);
                }
            }
        }

        // If login fails after 3 attempts
        if (!loginSuccess) {
            System.out.println("\nAccount locked! Too many failed login attempts.");
        }

        // Protected data access only after successful login
        if (loginSuccess) {
            System.out.println("\n=== Protected User Data ===");
            System.out.println("Welcome to the Academic Performance Evaluation System.");
            System.out.println("You can now view your academic details securely.");
        }

        scanner.close();
    }
}