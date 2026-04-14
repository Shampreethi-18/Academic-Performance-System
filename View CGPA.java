import java.util.Scanner;

public class view_cgpa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cgpa;

        System.out.println("----- View CGPA -----");

        System.out.print("Enter your CGPA: ");
        cgpa = sc.nextDouble();

        System.out.println("\nYour CGPA is: " + cgpa);

        // Simple interpretation
        if (cgpa >= 8.5) {
            System.out.println("Performance: Excellent");
        } else if (cgpa >= 6.0) {
            System.out.println("Performance: Good");
        } else if (cgpa >= 5.0) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Poor");
        }

        sc.close();
    }
}