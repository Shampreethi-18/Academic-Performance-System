import java.util.Scanner;

class Subject {
    String subjectName;
    int credits;
    String grade;
    boolean isMajor;

    public Subject(String subjectName, int credits, String grade, boolean isMajor) {
        this.subjectName = subjectName;
        this.credits = credits;
        this.grade = grade;
        this.isMajor = isMajor;
    }

    public double getGradePoint() {
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

    public double getCreditPoint() {
        return getGradePoint() * credits;
    }
}

public class StudentCGPAViewer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student CGPA Viewer ===");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter total number of subjects: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Subject[] subjects = new Subject[n];

        double totalCreditPoints = 0.0;
        int totalCredits = 0;

        double majorCreditPoints = 0.0;
        int majorCredits = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Subject " + (i + 1));

            System.out.print("Subject Name: ");
            String name = scanner.nextLine();

            System.out.print("Credits: ");
            int credits = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Grade (O, A+, A, B+, B, C): ");
            String grade = scanner.nextLine();

            System.out.print("Is this a Major subject? (yes/no): ");
            String majorInput = scanner.nextLine();
            boolean isMajor = majorInput.equalsIgnoreCase("yes");

            subjects[i] = new Subject(name, credits, grade, isMajor);

            // Overall CGPA calculation
            totalCreditPoints += subjects[i].getCreditPoint();
            totalCredits += credits;

            // Major CGPA calculation
            if (subjects[i].isMajor) {
                majorCreditPoints += subjects[i].getCreditPoint();
                majorCredits += credits;
            }
        }

        // Calculate Overall CGPA
        double overallCGPA = 0.0;
        if (totalCredits > 0) {
            overallCGPA = totalCreditPoints / totalCredits;
        }

        // Calculate Major CGPA
        double majorCGPA = 0.0;
        if (majorCredits > 0) {
            majorCGPA = majorCreditPoints / majorCredits;
        }

        // Display result
        System.out.println("\n===== CGPA EVALUATION RESULT =====");
        System.out.println("Student Name: " + studentName);
        System.out.printf("Overall CGPA: %.2f\n", overallCGPA);
        System.out.printf("Major CGPA  : %.2f\n", majorCGPA);

        System.out.println("\n----- Subject-wise Calculation -----");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject: " + subjects[i].subjectName);
            System.out.println("Credits: " + subjects[i].credits);
            System.out.println("Grade: " + subjects[i].grade);
            System.out.println("Grade Point: " + subjects[i].getGradePoint());
            System.out.println("Credit Points: " + subjects[i].getCreditPoint());
            System.out.println("Major Subject: " + (subjects[i].isMajor ? "Yes" : "No"));
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}