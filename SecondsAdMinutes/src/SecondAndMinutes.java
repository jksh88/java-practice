public class SecondAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hrs = minutes / 60;
        String hoursString = hrs + "";
        if (hrs < 10) {
            hoursString = "0" + hrs;
        }

        int remainingMinutes = minutes % 60;
        String minutesString = remainingMinutes + "";
        if (remainingMinutes < 10) {
            minutesString = "0" + remainingMinutes;
        }

        String secondsString = seconds + "";
        if (seconds < 10) {
            secondsString = "0" + seconds;
        }


        return (hoursString + "h " + minutesString + "m " + secondsString + "s ");
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
