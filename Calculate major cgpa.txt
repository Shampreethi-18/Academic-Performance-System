import java.util.Scanner;

public class MajorCGPACalculator {

    // Method to convert grade to grade point
    public static double getGradePoint(String grade) {
        switch (grade.toUpperCase()) {
            case "O":
                return 10.0;
            case "A+":
                return 9.0;
            case "A":
                return 8.0;
            case "B+":
                return 7.0;
            case "B":
                return 6.0;
            case "C":
                return 5.0;
            default:
                return 0.0; // Fail or invalid grade
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Major CGPA Calculator ===");

        // Ask for number of major subjects
        System.out.print("Enter number of major subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // consume newline

        double totalCreditPoints = 0.0;
        int totalCredits = 0;

        // Loop through each major subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("\nEnter details for Major Subject " + i);

            System.out.print("Subject Name: ");
            String subjectName = scanner.nextLine();

            System.out.print("Credits: ");
            int credits = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Grade (O, A+, A, B+, B, C): ");
            String grade = scanner.nextLine();

            double gradePoint = getGradePoint(grade);
            double creditPoint = gradePoint * credits;

            totalCreditPoints += creditPoint;
            totalCredits += credits;

            System.out.println(subjectName + " -> Grade Point: " + gradePoint + ", Credit Points: " + creditPoint);
        }

        // Calculate Major CGPA
        if (totalCredits > 0) {
            double majorCGPA = totalCreditPoints / totalCredits;
            System.out.printf("\nMajor CGPA = %.2f\n", majorCGPA);
        } else {
            System.out.println("No major subjects entered.");
        }

        scanner.close();
    }
}