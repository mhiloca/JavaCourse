public class OperatorChallenge {

    public static void operator(double num1, double num2) {

        double result1 = (num1 + num2) * 100d;
        double remainder;

        remainder = result1 % 40.00d;

        boolean hasRemainder = (remainder == 0);

        System.out.println(hasRemainder);

        if (!hasRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
