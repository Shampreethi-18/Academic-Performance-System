public class AcademicStatus {
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
}