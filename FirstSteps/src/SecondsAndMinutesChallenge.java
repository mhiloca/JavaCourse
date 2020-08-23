public class SecondsAndMinutesChallenge {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = (minutes % 60) + (seconds / 60);
        int remainingSeconds = seconds % 60;

        return convertToString(hours) + "h " + convertToString(remainingMinutes) + "m " + convertToString(remainingSeconds) + "s";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String convertToString(int number) {
        return number >= 10 ? Integer.toString(number) : "0" + number;
    }
}
