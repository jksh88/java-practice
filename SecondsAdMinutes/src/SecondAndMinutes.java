public class SecondAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hrs = minutes / 60;
        int remainingMinutes = minutes % 60;
        return (hrs + "h " + remainingMinutes + "m " + seconds + "s ");
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int mins = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(mins, remainingSeconds);

    }
}
