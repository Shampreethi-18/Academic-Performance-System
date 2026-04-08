import java.util.Scanner;

public class GoodStandingChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cgpa;
        int arrears;

        System.out.print("Enter student CGPA: ");
        cgpa = sc.nextDouble();

        System.out.print("Enter number of arrears: ");
        arrears = sc.nextInt();

        if (cgpa >= 6.0 && arrears == 0) {
            System.out.println("Status: Good Standing");
        } else {
            System.out.println("Status: Not in Good Standing");
        }

        sc.close();
    }
}