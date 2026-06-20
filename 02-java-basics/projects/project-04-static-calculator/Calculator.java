public class Calculator {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {

        System.out.println(Calculator.sum(5, 3));
        System.out.println(Calculator.subtract(10, 2));
        System.out.println(Calculator.multiply(4, 6));

    }
}
