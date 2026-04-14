import java.util.Scanner;

public class PortableSystemDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Academic Performance System ===");
        System.out.println("This system can run on any device with Java support.");
        System.out.println("Device Type: " + System.getProperty("os.name"));

        System.out.print("\nEnter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.println("\nHello " + name + "!");
        System.out.println("Your CGPA is: " + cgpa);

        System.out.println("\n✅ This program can run on:");
        System.out.println("- Laptop (Windows / Mac / Linux)");
        System.out.println("- Mobile (with Java support apps)");
        System.out.println("- Any system with JVM");

        scanner.close();
    }
}