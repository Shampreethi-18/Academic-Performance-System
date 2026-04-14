public class StatusClassification {

    // Method to classify student status
    public static String getStatus(double cgpa, int arrears) {

        if (cgpa >= 8.5 && arrears == 0) {
            return "Excellent";
        } 
        else if (cgpa >= 6.0 && arrears == 0) {
            return "Good Standing";
        } 
        else if ((cgpa >= 5.0 && cgpa < 6.0) || (arrears > 0 && arrears <= 2)) {
            return "Average";
        } 
        else {
            return "At Risk";
        }
    }

    // Optional test main (for checking independently)
    public static void main(String[] args) {

        double cgpa = 7.2;
        int arrears = 1;

        String status = getStatus(cgpa, arrears);

        System.out.println("CGPA: " + cgpa);
        System.out.println("Arrears: " + arrears);
        System.out.println("Status: " + status);
    }
}