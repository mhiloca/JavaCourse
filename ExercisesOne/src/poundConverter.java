import java.util.Scanner;

public class poundConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double kilo;
        double pound;

        System.out.println("Enter the amount of pounds to convert: ");
        pound = sc.nextDouble();

        kilo = pound * 0.45359237;

        System.out.println(pound + " pounds in kilograms is: " + kilo);

        sc.close();

    }
}
