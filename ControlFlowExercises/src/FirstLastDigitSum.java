public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }

        int sumResult = number % 10;

        while (number >= 10) {
            number /=10;
        }

        return sumResult + number;
    }
}
