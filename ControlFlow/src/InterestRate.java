public class InterestRate {

    public static double calculateInterest(double amount, double interestRate) {
        return Math.round(amount * (interestRate / 100));
    }
}
