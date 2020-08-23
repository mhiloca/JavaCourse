public class FeetAndInches {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            double feetToInches = feet * 12;
            return (feetToInches * 2.54) + (inches * 2.54);
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }

        double feet = (int) (inches / 12);
        double remainingInches = (int) (inches % 12);

        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");

        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }
}
