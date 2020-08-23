public class MinutesToYearsDaysCalculator {

    public static final String INVALID_VALUE_MSG = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MSG);
        } else {

            int days = (int) (minutes / 1440);
            int years = days / 365;
            int remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
