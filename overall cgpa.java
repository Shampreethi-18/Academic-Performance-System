import java.util.Scanner;

public class overall_cgpa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double totalCredits = 0;
        double weightedSum = 0;

        System.out.println("----- Overall CGPA Calculator -----");

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of subjects!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("\nSubject " + i);

            System.out.print("Enter credits: ");
            double credits = sc.nextDouble();

            System.out.print("Enter grade point (out of 10): ");
            double gradePoint = sc.nextDouble();

            totalCredits += credits;
            weightedSum += (credits * gradePoint);
        }

        if (totalCredits == 0) {
            System.out.println("Error: Total credits cannot be zero!");
        } else {
            double cgpa = weightedSum / totalCredits;

            System.out.println("\n===== RESULT =====");
            System.out.println("Total Credits: " + totalCredits);
            System.out.println("Overall CGPA: " + String.format("%.2f", cgpa));

            // Extra classification (for viva)
            if (cgpa >= 8.5) {
                System.out.println("Performance: Excellent");
            } else if (cgpa >= 6.0) {
                System.out.println("Performance: Good");
            } else if (cgpa >= 5.0) {
                System.out.println("Performance: Average");
            } else {
                System.out.println("Performance: Poor");
            }
        }

        sc.close();
    }
}