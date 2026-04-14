import java.util.Scanner;

public class MainSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // LOGIN
        System.out.println("Enter Username:");
        String user = sc.nextLine();

        System.out.println("Enter Password:");
        String pass = sc.nextLine();

        if(!user.equals("admin") || !pass.equals("123")) {
            System.out.println("Login Failed!");
            return;
        }

        System.out.println("Login Successful!");

        // INPUT MARKS
        double[] marks = {80, 70, 60};

        // CGPA CALCULATION
        double sum = 0;
        for(double m : marks) sum += m;

        double cgpa = sum / marks.length;

        // STATUS
        String status;
        if(cgpa >= 7) status = "Good Standing";
        else if(cgpa >= 5) status = "Academic Warning";
        else status = "Dismissed";

        // OUTPUT
        System.out.println("\n--- RESULT ---");
        System.out.println("CGPA: " + cgpa);
        System.out.println("Status: " + status);

    }
}