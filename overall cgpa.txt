import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double totalCredits = 0;
        double weightedSum = 0;

        System.out.print("Enter number of subjects: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nSubject " + i);

            System.out.print("Enter credits: ");
            double credits = sc.nextDouble();

            System.out.print("Enter grade point (out of 10): ");
            double gradePoint = sc.nextDouble();

            totalCredits += credits;
            weightedSum += (credits * gradePoint);
        }

        double cgpa = weightedSum / totalCredits;

        System.out.println("\nOverall CGPA: " + String.format("%.2f", cgpa));

        sc.close();
    }
}
