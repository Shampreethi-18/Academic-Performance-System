import java.util.Scanner;

public class secure_login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username, password;

        String VALID_USERNAME = "admin";
        String VALID_PASSWORD = "1234";

        System.out.println("----- Secure Login -----");

        System.out.print("Enter Username: ");
        username = sc.nextLine();

        System.out.print("Enter Password: ");
        password = sc.nextLine();

        if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password!");
        }

        sc.close();
    }
}