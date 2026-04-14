public class AcademicPerformanceEvaluation {

    // Method to evaluate overall academic performance
    public static String evaluate(double cgpa, int arrears) {

        if (cgpa >= 8.5 && arrears == 0) {
            return "Final Evaluation: Excellent Student";
        } 
        else if (cgpa >= 6.0 && arrears == 0) {
            return "Final Evaluation: Good Standing";
        } 
        else if ((cgpa >= 5.0 && cgpa < 6.0) || (arrears > 0 && arrears <= 2)) {
            return "Final Evaluation: Needs Improvement";
        } 
        else {
            return "Final Evaluation: At Risk (Possible Dismissal)";
        }
    }

    // Optional testing main method
    public static void main(String[] args) {

        double cgpa = 6.8;
        int arrears = 1;

        String result = evaluate(cgpa, arrears);

        System.out.println("CGPA: " + cgpa);
        System.out.println("Arrears: " + arrears);
        System.out.println(result);
    }
}