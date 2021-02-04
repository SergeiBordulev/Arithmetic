public class Arithmetic {
    public static void main(String[] args) {
        int integerValueFirst = 12;
        int integerValueSecond = 3;

        int resultInteger = integerValueFirst - integerValueSecond;
        System.out.println("Integer: a - b = " + resultInteger);

        resultInteger = integerValueFirst + integerValueSecond;
        System.out.println("Integer: a + b = " + resultInteger);

        resultInteger = integerValueFirst / integerValueSecond;
        System.out.println("Integer: a / b = " + resultInteger);

        resultInteger = integerValueFirst * integerValueSecond;
        System.out.println("Integer: a * b = " + resultInteger);

        resultInteger = integerValueSecond % integerValueFirst;
        System.out.println("Integer: b % a = " + resultInteger);

        System.out.println();

        double doubleValueFirst = 3.5;
        double doubleValueSecond = 2.3;

        double resultDouble = doubleValueFirst - doubleValueSecond;
        System.out.println("Double: a - b = " + resultDouble);

        resultDouble = doubleValueFirst + doubleValueSecond;
        System.out.println("Double: a + b = " + resultDouble);

        resultDouble = doubleValueFirst / doubleValueSecond;
        System.out.println("Double: a / b = " + resultDouble);

        resultDouble = doubleValueFirst * doubleValueSecond;
        System.out.println("Double: a * b = " + resultDouble);

        resultDouble = doubleValueFirst % doubleValueSecond;
        System.out.println("Double: a % b = " + resultDouble);
    }
}
