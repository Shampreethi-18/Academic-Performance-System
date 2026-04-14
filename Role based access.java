import java.util.Scanner;

public class role_based_access {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username;
        int choice;

        System.out.println("----- Role Based Access System -----");

        System.out.print("Enter Username: ");
        username = sc.nextLine();

        System.out.println("\nSelect Role:");
        System.out.println("1. Student");
        System.out.println("2. Faculty");
        System.out.println("3. Admin");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.println("\n--- Access Permissions ---");

        switch (choice) {
            case 1:
                System.out.println(username + " (Student) can:");
                System.out.println("- View CGPA");
                System.out.println("- View Academic Status");
                break;

            case 2:
                System.out.println(username + " (Faculty) can:");
                System.out.println("- Enter Marks");
                System.out.println("- Update Student Records");
                break;

            case 3:
                System.out.println(username + " (Admin) can:");
                System.out.println("- Manage Users");
                System.out.println("- Generate Reports");
                break;

            default:
                System.out.println("Invalid role selected!");
        }

        sc.close();
    }
}