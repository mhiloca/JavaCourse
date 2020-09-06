public class SumOddRange {

    public static boolean isOdd (int num) {
        return (num > 0) && (num % 2 != 0);
    }

    public static int sumOdd (int start, int end) {

        if ((start > end) || (start < 0)) {
            return -1;
        }

        int sumResult = 0;

        for (; start <= end; start++) {
            if (isOdd(start)) {
                sumResult += start;
            }
        }

        return sumResult;
    }
}
