import java.util.Scanner;

public class AlternateProgramSuggester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double cgpa;
        int arrears;

        System.out.print("Enter student CGPA: ");
        cgpa = sc.nextDouble();

        System.out.print("Enter number of arrears: ");
        arrears = sc.nextInt();

        System.out.println("\nSuggestion:");

        if (cgpa >= 6.0 && arrears == 0) {
            System.out.println("You can continue in your current program.");
        } 
        else if ((cgpa >= 5.0 && cgpa < 6.0) || (arrears > 0 && arrears <= 2)) {
            System.out.println("Suggested Options:");
            System.out.println("- Switch to a related program with lower difficulty");
            System.out.println("- Consider academic support programs or tutoring");
        } 
        else {
            System.out.println("Suggested Options:");
            System.out.println("- Diploma courses");
            System.out.println("- Vocational training programs");
            System.out.println("- Skill-based certifications (e.g., IT, Design, etc.)");
        }

        sc.close();
    }
}