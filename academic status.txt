import java.util.Scanner;

public class AcademicStatusViewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cgpa;
        int arrears;

        System.out.print("Enter your CGPA: ");
        cgpa = sc.nextDouble();

        System.out.print("Enter number of arrears: ");
        arrears = sc.nextInt();

        String status;

        if (cgpa >= 8.5 && arrears == 0) {
            status = "Excellent";
        } 
        else if (cgpa >= 6.0 && arrears == 0) {
            status = "Good Standing";
        } 
        else if ((cgpa >= 5.0 && cgpa < 6.0) || (arrears > 0 && arrears <= 2)) {
            status = "Average";
        } 
        else {
            status = "At Risk";
        }

        System.out.println("\nYour Academic Status: " + status);

        sc.close();
    }
}