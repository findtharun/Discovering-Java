class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int product(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}

public class ClassAndObject {
    public static void main(String args[]) {
        int x, y;
        x = 10;
        y = 15;
        Calculator calc = new Calculator();
        System.out.println("Sum of Given  Numbers is : " + calc.add(x, y));
        System.out.println("Difference of Given numbers is : " + calc.subtract(x, y));
        System.out.println("Product of Given numbers is : " + calc.product(x, y));
        System.out.println("Division of Given numbers is : " + calc.divide(x, y));
    }
}