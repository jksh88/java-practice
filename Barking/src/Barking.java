public class Barking {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay == 23))) {
            return true;
        }
        return false;
    }
}
