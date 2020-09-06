public class DigitSum {

    public static int sumDigits (int number) {
        if (number < 10) {
            return -1;
        }

        String numString = Integer.toString(number);
        int sumResult = 0;
        int count = 0;

        while (count < numString.length()) {
            sumResult += Character.getNumericValue(numString.charAt(count));
            count++;
        }

        return sumResult;
    }

    public static int sumDigits2 (int num) {

        if (num < 10) {
            return -1;
        }

        int sumResult2 = 0;

        while (num > 0) {
            sumResult2 += (num % 10);
            num /= 10;
        }

        return sumResult2;
    }
}
