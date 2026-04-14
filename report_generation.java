import java.util.Scanner;

public class report_generation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double cgpa;

        System.out.println("----- Report Generation -----");

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();

        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);

        if (cgpa >= 8.5) {
            System.out.println("Grade: A");
        } else if (cgpa >= 6.0) {
            System.out.println("Grade: B");
        } else if (cgpa >= 5.0) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}