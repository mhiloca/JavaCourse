public class Main {

    public static void main (String[] args) {

        switchChar.testChar('G');
        switchString.testString("MARCH");
        WeekChallenge.printDayOfTheWeek(5);
        WeekChallenge.printWeekDay(17);
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(20, 1500));

        for(double i=2.0; i<9; i++) {
            System.out.println("10,000 at " + (int) i + "% rate = " + String.format("%.2f", InterestRate.calculateInterest(10000.0, i)));
        }

        System.out.println("- - - - - - - - - - - - - - - - ");

        for(double i=8.0; i>1; i--) {
            System.out.println("10,000 at " + (int) i + "% rate = " + String.format("%.2f", InterestRate.calculateInterest(10000.0, i)));
        }

        int count = 0;

        for (int j=14; j < 56; j++) {
            if (PrimeNumber.isPrime(j)) {
                System.out.println(j);
                count++;
                if (count == 3) {
                    break;
                }
            }
        }

        int sumResult = 0;
        int counter = 0;
        String numbers = "The numbers are: ";
        for (int k=1; k <= 1000; k++) {
            if ((k % 3 == 0) && (k % 5 == 0)) {
                sumResult += k;
                counter++;
                numbers = numbers + k + " ";
            }
            if (counter == 5) {
                break;
            }
        }

        System.out.println(numbers);
        System.out.println("The sum result is: " + sumResult);

        int number = 4;
        int finishNumber = 20;
        int count1 = 0;
        int sumResult1 = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            sumResult1 += number;
            count1++;
            System.out.println("Even number " + number);
            if (count == 5) {
                break;
            }
        }

        System.out.println("The total is: " + sumResult);

        System.out.println(DigitSum.sumDigits2(987));

    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
