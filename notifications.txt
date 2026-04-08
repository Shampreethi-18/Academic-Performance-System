import java.util.Scanner;

public class StudentAlertSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cgpa;
        int arrears;

        System.out.print("Enter your CGPA: ");
        cgpa = sc.nextDouble();

        System.out.print("Enter number of arrears: ");
        arrears = sc.nextInt();

        if (cgpa >= 6.0 && arrears == 0) {
            System.out.println("Status: Safe");
            System.out.println("No action needed. Keep performing well!");
        } 
        else if ((cgpa >= 5.0 && cgpa < 6.0) || (arrears > 0 && arrears <= 2)) {
            System.out.println("Status: Warning");
            System.out.println("Alert: Improve your academic performance to avoid dismissal.");
        } 
        else {
            System.out.println("Status: Dismissal");
            System.out.println("Alert: You are at risk of dismissal. Take immediate corrective action!");
        }

        sc.close();
    }
}