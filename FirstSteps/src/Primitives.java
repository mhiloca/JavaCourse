public class Primitives {

    public static void primitive(int num1, int num2, int numInt) {

        byte numByte = (byte) num1;
        short numShort = (short) num2;

        long numLong = 50_000_000_000L + (10L * (numByte + numShort + numInt));

        System.out.println("This is my long number: " + numLong);
    }
}