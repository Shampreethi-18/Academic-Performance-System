import java.util.Scanner;

class EvaluationRules {

    // Method to display minimum CGPA criteria
    public void showMinimumCGPA() {
        System.out.println("\n=== Minimum CGPA Requirements ===");
        System.out.println("Overall CGPA >= 5.0 → Pass");
        System.out.println("Major CGPA   >= 6.0 → Good Standing");
    }

    // Method to display evaluation rules
    public void showEvaluationRules() {
        System.out.println("\n=== Evaluation Rules ===");
        System.out.println("1. Overall CGPA is calculated using all subjects.");
        System.out.println("2. Major CGPA is calculated using only core/major subjects.");
        System.out.println("3. Grades are converted into grade points (O=10, A+=9, A=8, etc.).");
        System.out.println("4. CGPA = Total (Grade Points × Credits) / Total Credits.");
        System.out.println("5. Academic status is determined based on CGPA thresholds.");
    }

    // Method to display academic status rules
    public void showStatusRules() {
        System.out.println("\n=== Academic Status Rules ===");
        System.out.println("Good Standing       → Overall CGPA >= 7.0 AND Major CGPA >= 6.0");
        System.out.println("Academic Warning    → Overall CGPA between 5.0 and 6.9");
        System.out.println("Continue in Alternate → Major CGPA < 6.0");
        System.out.println("Dismissed           → Overall CGPA < 5.0");
    }
}

public class TransparencySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvaluationRules rules = new EvaluationRules();

        int choice;

        do {
            System.out.println("\n=== Student Transparency Menu ===");
            System.out.println("1. View Minimum CGPA Requirements");
            System.out.println("2. View Evaluation Rules");
            System.out.println("3. View Academic Status Rules");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    rules.showMinimumCGPA();
                    break;
                case 2:
                    rules.showEvaluationRules();
                    break;
                case 3:
                    rules.showStatusRules();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}