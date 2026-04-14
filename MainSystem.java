import java.util.Scanner;

public class MainSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cgpa;
        int arrears;
        int choice;

        do {
            System.out.println("\n===== Academic Performance System =====");
            System.out.println("1. Login");
            System.out.println("2. Enter Student Data");
            System.out.println("3. View CGPA");
            System.out.println("4. Status Classification");
            System.out.println("5. CGPA Analysis");
            System.out.println("6. Notifications");
            System.out.println("7. Final Evaluation");
            System.out.println("8. Generate Report");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Login Module ---");
                    LoginMain.main(null);   // your login file class name
                    break;

                case 2:
                    System.out.print("Enter CGPA: ");
                    cgpa = sc.nextDouble();

                    System.out.print("Enter number of arrears: ");
                    arrears = sc.nextInt();

                    System.out.println("Data Saved Successfully!");
                    break;

                case 3:
                    System.out.print("Enter CGPA: ");
                    cgpa = sc.nextDouble();
                    System.out.println("Your CGPA is: " + cgpa);
                    break;

                case 4:
                    System.out.print("Enter CGPA: ");
                    cgpa = sc.nextDouble();

                    System.out.print("Enter arrears: ");
                    arrears = sc.nextInt();

                    String status = StatusClassification.getStatus(cgpa, arrears);
                    System.out.println("Status: " + status);
                    break;

                case 5:
                    System.out.print("Enter CGPA: ");
                    cgpa = sc.nextDouble();

                    String analysis = CGPAAnalysis.analyzeCGPA(cgpa);
                    System.out.println("Analysis: " + analysis);
                    break;

                case 6:
                    System.out.print("Enter CGPA: ");
                    cgpa = sc.nextDouble();

                    System.out.print("Enter arrears: ");
                    arrears = sc.nextInt();

                    Notifications.showNotification(cgpa, arrears);
                    break;

                case 7:
                    System.out.print("Enter CGPA: ");
                    cgpa = sc.nextDouble();

                    System.out.print("Enter arrears: ");
                    arrears = sc.nextInt();

                    String result = AcademicPerformanceEvaluation.evaluate(cgpa, arrears);
                    System.out.println(result);
                    break;

                case 8:
                    System.out.print("Enter CGPA: ");
                    cgpa = sc.nextDouble();

                    System.out.print("Enter arrears: ");
                    arrears = sc.nextInt();

                    String finalStatus = StatusClassification.getStatus(cgpa, arrears);
                    String finalAnalysis = CGPAAnalysis.analyzeCGPA(cgpa);
                    String finalEval = AcademicPerformanceEvaluation.evaluate(cgpa, arrears);

                    System.out.println("\n===== REPORT =====");
                    System.out.println("CGPA: " + cgpa);
                    System.out.println("Arrears: " + arrears);
                    System.out.println("Status: " + finalStatus);
                    System.out.println("Analysis: " + finalAnalysis);
                    System.out.println(finalEval);
                    break;

                case 9:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}