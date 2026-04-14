import java.util.Scanner;

public class notifications {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cgpa;
        int arrears;

        System.out.println("----- Notification System -----");

        System.out.print("Enter your CGPA: ");
        cgpa = sc.nextDouble();

        System.out.print("Enter number of arrears: ");
        arrears = sc.nextInt();

        System.out.println("\n--- Notification Result ---");

        if (cgpa >= 8.5 && arrears == 0) {
            System.out.println("Status: Excellent");
            System.out.println("Message: Keep up the great work!");
        } 
        else if (cgpa >= 6.0 && arrears == 0) {
            System.out.println("Status: Good Standing");
            System.out.println("Message: You are doing well.");
        } 
        else if ((cgpa >= 5.0 && cgpa < 6.0) || (arrears > 0 && arrears <= 2)) {
            System.out.println("Status: Warning");
            System.out.println("Message: Improve your performance.");
        } 
        else {
            System.out.println("Status: At Risk");
            System.out.println("Message: Immediate action required!");
        }

        sc.close();
    }
}