public class CalculateMajorCGPA {

    public static double calculate(double[] marks) {
        double sum = 0;

        for (double m : marks) {
            sum += m;
        }

        return sum / marks.length;
    }
}