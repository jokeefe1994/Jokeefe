public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,5));
        System.out.println(getDurationString(3905));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(9));
    }

    private static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutesToHours = minutes / 60;
        int leftOverMinutes = minutes % 60;

        String hoursString = minutesToHours + "h ";
        if (minutesToHours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = leftOverMinutes + "m ";
        if (leftOverMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s ";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }

    private static String getDurationString(int seconds) {

        if (seconds <= 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int secondsToMinutes = seconds / 60;
        int leftOverSeconds = seconds % 60;


        return getDurationString(secondsToMinutes, leftOverSeconds);

    }
}
