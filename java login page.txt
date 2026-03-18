import java.util.Scanner;

public class LoginMain {
    // Hardcoded correct username and password for validation
    private static final String VALID_USERNAME = "user";
    private static final String VALID_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Login Page ---");
        
        // Prompt for username
        System.out.print("Enter Username: ");
        String usernameInput = scanner.nextLine();

        // Prompt for password
        System.out.print("Enter Password: ");
        String passwordInput = scanner.nextLine();

        // Check if the entered credentials are valid
        if (validateLogin(usernameInput, passwordInput)) {
            System.out.println("Access Granted! Welcome, " + usernameInput + "!");
        } else {
            System.out.println("Login Failed! Invalid username or password.");
        }

        // Close the scanner
        scanner.close();
    }

    
    private static boolean validateLogin(String username, String password) {
        // Use .equals() for string comparison in Java
        return username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD);
    }
}
