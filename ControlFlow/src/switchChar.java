public class switchChar {

    public static void testChar(char charValue){

        switch (charValue) {
            case 'A':
                System.out.println("It's an A");
                break;
            case 'B':
                System.out.println("It's a B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("It's a " + charValue);
                break;
            default:
                System.out.println("Not found any valid value");
                break;
        }
    }
}
