public class EvenDigitSum {

    public static int getEvenDigitSum (int number) {

        if (number < 0) {
            return -1;
        }

        int sumResult = 0;

        while (number > 0) {
            int n = number % 10;
            if (isEvenNumber(n)) {
                sumResult += n;
            }
            number /= 10;
        }

        return sumResult;
    }

    public static boolean isEvenNumber (int num) {
        return (num % 2 == 0);
    }
}
