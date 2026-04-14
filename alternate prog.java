public class AlternateProgram {

    public static String suggest(double cgpa, int arrears) {

        if (cgpa >= 6.0 && arrears == 0) {
            return "Continue in current program";
        } 
        else if ((cgpa >= 5.0 && cgpa < 6.0) || (arrears > 0 && arrears <= 2)) {
            return "Switch to related program or take academic support";
        } 
        else {
            return "Consider diploma or vocational courses";
        }
    }
}