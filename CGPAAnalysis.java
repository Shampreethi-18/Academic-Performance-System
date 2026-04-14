public class CGPAAnalysis {

    // Method to analyze CGPA performance
    public static String analyzeCGPA(double cgpa) {

        if (cgpa >= 9.0) {
            return "Outstanding Performance";
        } 
        else if (cgpa >= 7.5) {
            return "Very Good Performance";
        } 
        else if (cgpa >= 6.0) {
            return "Good Performance";
        } 
        else if (cgpa >= 5.0) {
            return "Average Performance";
        } 
        else {
            return "Poor Performance";
        }
    }

    // Optional main for testing
    public static void main(String[] args) {

        double cgpa = 8.2;

        String result = analyzeCGPA(cgpa);

        System.out.println("CGPA: " + cgpa);
        System.out.println("Analysis: " + result);
    }
}