public class Calculator {

    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        int intBase = 3;
        int intExponent = 4;
        int intResult = Calculator.powerInt(intBase, intExponent);
        System.out.println(intBase + " to the power of " + intExponent + " is: " + intResult);

        double doubleBase = 2.5;
        int doubleExponent = 3;
        double doubleResult = Calculator.powerDouble(doubleBase, doubleExponent);
        System.out.println(doubleBase + " to the power of " + doubleExponent + " is: " + doubleResult);
    }
}
