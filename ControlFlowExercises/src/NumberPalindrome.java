public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        int num = Math.abs(number);
        int reverseNumber = 0;

        while (num > 0) {
            reverseNumber += num % 10;
            if (num < 10) {
                break;
            }
            reverseNumber *= 10;
            num /= 10;
        }

        return (Math.abs(number) == reverseNumber);

    }
}
