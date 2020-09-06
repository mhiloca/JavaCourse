public class switchString {

    public static void testString(String month) {

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("The first month");
                break;
            case "february":
                System.out.println("The second month");
                break;
            case "march":
                System.out.println("The third month");
                break;
            default:
                System.out.println("Not the 1st, 2nd or 3rd months");
                break;
        }
    }
}
