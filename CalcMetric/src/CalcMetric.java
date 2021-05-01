public class CalcMetric {

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double centimeter = ( feet * 12 + inches ) * 2.54;
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0) {
            return -1;
        }

        System.out.println((int)(inches / 12) + " feet and " + (inches % 12) + " inches");
        return calcFeetAndInchesToCentimeters(6, 7);
    }
}
