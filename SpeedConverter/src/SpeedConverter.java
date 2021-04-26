public class SpeedConverter {
    public static long toMilesPerHour(double kmh) {
        if(kmh < 0) {
            return -1;
        }
        return Math.round(kmh / 1.609344);
    }

    public static void printConversion(double kmh) {
        if (kmh < 0) {
            System.out.println("Invalid Value");
        }
        System.out.println(toMilesPerHour(kmh) + " mi/h = " + kmh + " km/h");
    }
}
